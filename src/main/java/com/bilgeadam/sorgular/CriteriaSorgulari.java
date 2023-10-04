package com.bilgeadam.sorgular;


import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.List;

public class CriteriaSorgulari {

    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;

    public CriteriaSorgulari() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

    public List<String> findAllStudentsByName(){
        CriteriaQuery<String> criteria = criteriaBuilder.createQuery(String.class);
        Root<Ogrenci> ogrenciRoot = criteria.from(Ogrenci.class);
        criteria.select(ogrenciRoot.get("kisiselBilgiler").get("isim"));

//        TypedQuery<String> query = entityManager.createQuery(criteria);
//        return query.getResultList();
        List<String> result = entityManager.createQuery(criteria).getResultList();
        return result;
    }

    public List<Ogrenci> findAllBornAfter1995(){
        LocalDate dateThreshold = LocalDate.of(1995,1,1);
        CriteriaQuery<Ogrenci> criteria = criteriaBuilder.createQuery(Ogrenci.class);
        Root<Ogrenci> root = criteria.from(Ogrenci.class);
        criteria.select(root).where(criteriaBuilder.greaterThan(root.get("dogumTarihi"),dateThreshold));
        List<Ogrenci> ogrenciList = entityManager.createQuery(criteria).getResultList();
        return ogrenciList;
    }




}

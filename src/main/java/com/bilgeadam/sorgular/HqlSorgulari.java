package com.bilgeadam.sorgular;


import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HqlSorgulari {

    EntityManager entityManager;

    public HqlSorgulari() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        String hql = "SELECT o.kisiselBilgiler.isim FROM Ogrenci o";
        TypedQuery<String> result = entityManager.createQuery(hql,String.class);
        return result.getResultList();
    }

    public List<Ogrenci> findAllBornAfter1995(){
        String hql = "FROM Ogrenci o WHERE o.dogumTarihi>'1995-01-01'";
        TypedQuery<Ogrenci> query = entityManager.createQuery(hql,Ogrenci.class);
        return  query.getResultList();
    }


}

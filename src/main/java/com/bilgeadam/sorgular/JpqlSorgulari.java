package com.bilgeadam.sorgular;



import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;

public class JpqlSorgulari {

    private EntityManager entityManager;

    public JpqlSorgulari() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        String jpql = "SELECT o.kisiselBilgiler.isim FROM Ogrenci o";
        List<String> result = entityManager.createQuery(jpql,String.class).getResultList();
        return result;
    }

    public List<Ogrenci> findAllStudentsBornAfter1995(){
        LocalDate dateThreshold = LocalDate.of(1995,1,1);
        String jpql = "SELECT o FROM Ogrenci o WHERE o.dogumTarihi > :threshold";
        TypedQuery<Ogrenci> query = entityManager.createQuery(jpql, Ogrenci.class);
        query.setParameter("threshold",dateThreshold);
        return query.getResultList();
    }


}

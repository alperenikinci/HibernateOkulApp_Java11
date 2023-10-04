package com.bilgeadam.sorgular;


import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class NamedQuerySorgulari {
    EntityManager entityManager;

    public NamedQuerySorgulari() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentNames(){
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Ogrenci.findAllByName",String.class);
        return namedQuery.getResultList();
    }

    public List<Ogrenci> findAllBornAfter1995(){
        LocalDate dateThreshold = LocalDate.of(1995,1,1);
        TypedQuery<Ogrenci> query = entityManager.createNamedQuery(
                "Ogrenci.findAllBornAfter1995", Ogrenci.class);
        query.setParameter("threshold",dateThreshold);
        return query.getResultList();

    }


}

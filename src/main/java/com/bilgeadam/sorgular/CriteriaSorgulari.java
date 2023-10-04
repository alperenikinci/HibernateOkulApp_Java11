package com.bilgeadam.sorgular;


import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CriteriaSorgulari {


    private EntityManager entityManager;
    private CriteriaBuilder criteriaBuilder;

    public CriteriaSorgulari(){
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        this.criteriaBuilder = entityManager.getCriteriaBuilder();
    }

}

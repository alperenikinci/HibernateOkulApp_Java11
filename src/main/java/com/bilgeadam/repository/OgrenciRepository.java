package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;
import com.bilgeadam.utility.ICrud;
import com.bilgeadam.utility.MyFactoryRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class OgrenciRepository extends MyFactoryRepository<Ogrenci> {
    EntityManager entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

    public OgrenciRepository() {
        super(new Ogrenci());
    }

    @Override
    public List<Ogrenci> findAll() {
        CriteriaQuery<Ogrenci> criteria = criteriaBuilder.createQuery(Ogrenci.class);
        Root<Ogrenci> root = criteria.from(Ogrenci.class);
        criteria.select(root);
        List<Ogrenci> ogrenciList = entityManager.createQuery(criteria).getResultList();
        return ogrenciList;
    }
    public Ogrenci findById(Long id) {
        CriteriaQuery<Ogrenci> criteria = criteriaBuilder.createQuery(Ogrenci.class);
        Root<Ogrenci> root = criteria.from(Ogrenci.class);
        criteria.select(root);
        criteria.where(criteriaBuilder.equal(root.get("id"),id));
        Ogrenci ogrenci = entityManager.createQuery(criteria).getSingleResult();
        return ogrenci;
    }
}
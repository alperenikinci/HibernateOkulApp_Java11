package com.bilgeadam.repository.hql;

import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;
import com.bilgeadam.utility.ICrud;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

/*
    findAll ve findById icin metotlar.
 */
public class OgrenciDao implements ICrud<Ogrenci> {
    private final EntityManager entityManager;

    public OgrenciDao() {
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    @Override
    public Ogrenci save(Ogrenci entity) {
        return null;
    }

    @Override
    public void update(Ogrenci entity) {

    }

    @Override
    public List<Ogrenci> findAll() {
        //"SELECT * FROM tbl_ogrenci"
        String hql = "SELECT o FROM Ogrenci as o";
        TypedQuery<Ogrenci> query = entityManager.createQuery(hql, Ogrenci.class);
        return query.getResultList();
    }

    public List<Ogrenci> findAll2(){
        String hql = "SELECT o FROM Ogrenci as o";
        Session session = HibernateUtility.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        List<Ogrenci> ogrenciList = query.getResultList();
        session.close();
        return ogrenciList;
    }

    @Override
    public Optional<Ogrenci> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Ogrenci.class,id));
    }


    public Ogrenci findById2(Long id){
        Session session = HibernateUtility.getSessionFactory().openSession();
//        String hql = "SELECT o FROM Ogrenci as o WHERE id =: deger ";
        String hql = "SELECT o FROM Ogrenci as o WHERE id ="+id;
        Query query = session.createQuery(hql);
        Ogrenci ogrenci = (Ogrenci) query.getSingleResult();
//        Ogrenci ogrenci = (Ogrenci) query.setParameter("deger",id).getSingleResult();
        session.close();
        return ogrenci;
    }

}

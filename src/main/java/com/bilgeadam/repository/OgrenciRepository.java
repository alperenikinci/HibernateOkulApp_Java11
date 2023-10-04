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
import java.util.Optional;


public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {
    public OgrenciRepository() {
        super(new Ogrenci());
    }


}

package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Sinif;
import com.bilgeadam.utility.HibernateUtility;
import com.bilgeadam.utility.ICrud;
import com.bilgeadam.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

public class SinifRepository extends MyFactoryRepository<Sinif,Long> {
    public SinifRepository(){
        super(new Sinif());
    }


}

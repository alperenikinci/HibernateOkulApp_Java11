package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.Ogretmen;
import com.bilgeadam.utility.MyFactoryRepository;


public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {

    public OgretmenRepository() {
        super(new Ogretmen());
    }


}

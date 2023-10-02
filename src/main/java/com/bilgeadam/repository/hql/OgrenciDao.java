package com.bilgeadam.repository.hql;

import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.ICrud;

import java.util.List;

/*
    findAll ve findById icin metotlar.
 */
public class OgrenciDao implements ICrud<Ogrenci> {
    @Override
    public List<Ogrenci> findAll() {
        return null;
    }

    @Override
    public Ogrenci findById(Long id) {
        return null;
    }

}

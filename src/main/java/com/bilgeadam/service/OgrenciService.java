package com.bilgeadam.service;

import com.bilgeadam.repository.OgrenciRepository;
import com.bilgeadam.repository.entity.Ogrenci;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;
import java.util.Optional;

public class OgrenciService {

    OgrenciRepository ogrenciRepository;

    public OgrenciService (){
        this.ogrenciRepository = new OgrenciRepository();
    }

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciRepository.save(ogrenci);
    }

    public void update(Ogrenci ogrenci){
        ogrenciRepository.update(ogrenci);
    }

    public List<Ogrenci> findAll(){
        return ogrenciRepository.findAll();
    }

    public Optional<Ogrenci> findById(Long id){
        return ogrenciRepository.findById(id);
    }

    public List<Ogrenci> saveAll(List<Ogrenci> ogrenciList){
        return (List<Ogrenci>) ogrenciRepository.saveAll(ogrenciList);
    }

    public void delete(Ogrenci ogrenci){
        ogrenciRepository.delete(ogrenci);
    }

    public void deleteById(Long id){
        ogrenciRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return ogrenciRepository.existById(id);
    }
    public List<Ogrenci> findByEntity(Ogrenci ogrenci){
        return ogrenciRepository.findByEntity(ogrenci);
    }

    public List<Ogrenci> findByColumnNameAndValue(String columnName, String columnValue){
        return ogrenciRepository.findByColumnNameAndValue(columnName,columnValue);
    }
}

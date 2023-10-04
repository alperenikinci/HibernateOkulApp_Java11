package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.service.OgrenciService;

import java.util.List;
import java.util.Optional;

public class OgrenciController {

    OgrenciService ogrenciService;

    public OgrenciController (){
        this.ogrenciService = new OgrenciService();
    }

    public Ogrenci save(Ogrenci ogrenci){
        return ogrenciService.save(ogrenci);
    }

    public void update(Ogrenci ogrenci){
        ogrenciService.update(ogrenci);
    }

    public List<Ogrenci> findAll(){
        return ogrenciService.findAll();
    }

    public Optional<Ogrenci> findById(Long id){
        return ogrenciService.findById(id);
    }

    public List<Ogrenci> saveAll(List<Ogrenci> ogrenciList){
        return (List<Ogrenci>) ogrenciService.saveAll(ogrenciList);
    }

    public void delete(Ogrenci ogrenci){
        ogrenciService.delete(ogrenci);
    }

    public void deleteById(Long id){
        ogrenciService.deleteById(id);
    }

    public boolean existById(Long id){
        return ogrenciService.existById(id);
    }
    public List<Ogrenci> findByEntity(Ogrenci ogrenci){
        return ogrenciService.findByEntity(ogrenci);
    }

    public List<Ogrenci> findByColumnNameAndValue(String columnName, String columnValue){
        return ogrenciService.findByColumnNameAndValue(columnName,columnValue);
    }
}

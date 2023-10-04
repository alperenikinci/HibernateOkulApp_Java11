package com.bilgeadam.service;

import com.bilgeadam.repository.OgretmenRepository;
import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.repository.entity.Ogretmen;

import java.util.List;
import java.util.Optional;

public class OgretmenService {

    OgretmenRepository ogretmenRepository;

    public OgretmenService() {
        this.ogretmenRepository = new OgretmenRepository();
    }

    public Ogretmen save(Ogretmen ogretmen) {
        return ogretmenRepository.save(ogretmen);
    }

    public void update(Ogretmen ogretmen) {
        ogretmenRepository.update(ogretmen);
    }

    public List<Ogretmen> findAll() {
        return ogretmenRepository.findAll();
    }

    public Optional<Ogretmen> findById(Long id) {
        return ogretmenRepository.findById(id);
    }

    public List<Ogretmen> saveAll(List<Ogretmen> ogretmenList){
        return (List<Ogretmen>) ogretmenRepository.saveAll(ogretmenList);
    }

    public void delete(Ogretmen ogretmen){
        ogretmenRepository.delete(ogretmen);
    }

    public void deleteById(Long id){
        ogretmenRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return ogretmenRepository.existById(id);
    }
    public List<Ogretmen> findByEntity(Ogretmen ogretmen){
        return ogretmenRepository.findByEntity(ogretmen);
    }

    public List<Ogretmen> findByColumnNameAndValue(String columnName, String columnValue){
        return ogretmenRepository.findByColumnNameAndValue(columnName,columnValue);
    }
}

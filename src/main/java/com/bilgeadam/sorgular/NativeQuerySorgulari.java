package com.bilgeadam.sorgular;



import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.utility.HibernateUtility;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class NativeQuerySorgulari {
    private EntityManager entityManager;

    public NativeQuerySorgulari(){
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public List<String> findAllStudentsByName(){
        List<String> studentNames =entityManager.createNativeQuery("SELECT isim FROM tbl_ogrenci").getResultList();
        return  studentNames;
    }

    public List<Ogrenci> findAllStudentsBornAfter1995(){
        LocalDate threshold = LocalDate.of(1995,1,1);
        String sql= "SELECT * FROM tbl_ogrenci WHERE dogumTarihi>'1995-01-01'";
        String sql1= "SELECT * FROM tbl_ogrenci WHERE dogumTarihi> :threshold";
        TypedQuery<Ogrenci> ogrenciTypedQuery = (TypedQuery<Ogrenci>) entityManager.createNativeQuery(sql, Ogrenci.class);
//        List<Ogrenci> ogrenciList = entityManager.createNativeQuery(sql, Ogrenci.class).getResultList();
        List<Ogrenci> ogrenciList = ogrenciTypedQuery.getResultList();
        return  ogrenciList;
    }



}

package com.bilgeadam;

import com.bilgeadam.repository.criteria.OgrenciCriteria;
import com.bilgeadam.repository.criteria.OgretmenCriteria;
import com.bilgeadam.repository.entity.Ogrenci;
import com.bilgeadam.repository.entity.Ogretmen;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Session session = HibernateUtility.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        Ogretmen ogretmen = Ogretmen.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Alperen")
//                        .soyisim("Ikinci")
//                        .tcKimlikNo("1564789")
//                        .build())
//                .brans(EBrans.FIZIK)
////                .iseBaslamaTarihi(LocalDate.of(2022,01,15))
//                .build();
//        session.save(ogretmen);
//        Ogrenci ogrenci = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Banu")
//                        .soyisim("Yilmaz")
//                        .tcKimlikNo("12345")
//                        .build())
//                .build();
//        Ogrenci ogrenci2 = Ogrenci.builder()
//                .kisiselBilgiler(KisiselBilgiler.builder()
//                        .isim("Ahmet")
//                        .soyisim("Kaya")
//                        .tcKimlikNo("123456")
//                        .build())
//
//                .dogumTarihi(LocalDate.of(1990,10,10))
//                .build();
//        Sinif sinif = Sinif.builder()
//                .sinifAdi("Kelebekler Sinifi")
//                .ogretmenId(ogretmen.getId())
//                .ogrenciler(List.of(
//                        ogrenci.getKisiselBilgiler().getIsim(),
//                        ogrenci2.getKisiselBilgiler().getIsim()
//                ))
//                .build();
//
//        session.save(ogrenci);
//        session.save(ogrenci2);
//        session.save(sinif);
//        transaction.commit();
//        session.close();
//        OgrenciCriteria ogrenciCriteria = new OgrenciCriteria();
//        Ogrenci ogrenci = ogrenciCriteria.findById(1L);
//        List<Ogrenci> ogrenciList = ogrenciCriteria.findAll();
//        System.out.println("Tekli ogrenci (findById : " + ogrenci);
//        System.out.println("######################################");
//        ogrenciList.forEach(x -> System.out.println(x));

        OgretmenCriteria ogretmenCriteria = new OgretmenCriteria();
        Ogretmen ogretmen = ogretmenCriteria.findById(1L);
        List<Ogretmen> ogretmenList = ogretmenCriteria.findAll();
        System.out.println("Tekli ogretmen (findById : " + ogretmen);
        System.out.println("######################################");
        ogretmenList.forEach(x -> System.out.println(x));

    }
}
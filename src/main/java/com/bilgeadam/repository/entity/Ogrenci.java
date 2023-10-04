package com.bilgeadam.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_ogrenci")
@Entity

@NamedQueries({
        @NamedQuery(name = "Ogrenci.findAllByName", query = "SELECT o.kisiselBilgiler.isim FROM Ogrenci o"),
//        @NamedQuery(name = "Ogrenci.findAllBornAfter1995", query = "SELECT o FROM Ogrenci o WHERE o.dogumTarihi>'1995-01-01'"),
        @NamedQuery(name = "Ogrenci.findAllBornAfter1995", query = "SELECT o FROM Ogrenci o WHERE o.dogumTarihi> :threshold")
}

)
public class Ogrenci {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private KisiselBilgiler kisiselBilgiler;

    @Builder.Default
    private LocalDate dogumTarihi = LocalDate.now();
}

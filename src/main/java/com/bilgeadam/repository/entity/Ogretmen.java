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
@Table(name = "tbl_ogretmen")
@Entity
public class Ogretmen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private KisiselBilgiler kisiselBilgiler;
    @Enumerated(EnumType.STRING)
    private EBrans brans;
    @Builder.Default
    @Column(nullable = false)
    private LocalDate iseBaslamaTarihi = LocalDate.now();
}

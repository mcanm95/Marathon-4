package com.mcanm.RandevuSistemi;

import jakarta.persistence.*;

import java.time.LocalDate;

@RandevuEntity
@Table(name = "musteri")
public class Randevu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isim")
    private String isim;

    @Column(name = "telefon")
    private String telefon;

    @Column(name = "tarih")
    private LocalDate tarih;

    @Column(name = "saat")
    private  LocalDate saat;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public  LocalDate getTarih() {
        return tarih;
    }

    public void setTarih( LocalDate tarih) {
        this.tarih = tarih;
    }

    public  LocalDate getSaat() {
        return saat;
    }

    public void setSaat( LocalDate saat) {
        this.saat = saat;
    }
}


package com.mcanm.RandevuSistemi;

import java.time.LocalDate;

public class RandevuDto {

    private Long id;
    private String isim;
    private String telefon;
    private LocalDate tarih;
    private LocalDate saat;



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

    public void setTarih(LocalDate tarih) {
        this.tarih = tarih;
    }

    public  LocalDate getSaat() {
        return saat;
    }

    public void setSaat(LocalDate saat) {
        this.saat = saat;
    }
}


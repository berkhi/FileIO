package com.berkhayta;
public class Ogrenci {
    private String adSoyad;
    private Integer ogrNo;

    public Ogrenci(String adSoyad, Integer ogrNo) {
        this.adSoyad = adSoyad;
        this.ogrNo = ogrNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", ogrNo=" + ogrNo +
                '}';
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public Integer getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(Integer ogrNo) {
        this.ogrNo = ogrNo;
    }
}




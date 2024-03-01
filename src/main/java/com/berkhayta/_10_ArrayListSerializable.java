package com.berkhayta;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _10_ArrayListSerializable {
    public static void main(String[] args) {
        ArrayList<Ogr> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogr(1, "Aslıhan", "Mert", "EE Mühendisliği", 85.0));
        ogrenciler.add(new Ogr(2, "Hasancan", "Doganay", "EE Mühendisliği", 66d));
        ogrenciler.add(new Ogr(3, "Can Deniz", "Gumus", "İnşaat Mühendisliği", 98d));
        ogrenciler.add(new Ogr(4, "Salih Ertuğrul", "ER", "Metalurji ve Malzeme Mühendisliği", 92.5));
        ogrenciler.add(new Ogr(5, "Heval Can Aslan", "Özen", "EE Mühendisliği", 90.0));
        ogrenciler.add(new Ogr(6, "Buse", "Ölmez", "Kimya Mühendisliği", 65d));
        ogrenciler.add(new Ogr(7, "İsmet Mustafa", "Görgülü", "Bilgisayar Mühendisliği", 80.0));
        ogrenciler.add(new Ogr(8, "Serkan", "Guner", "Enerji Sistemleri Muhendisligi", 80.0));
        ogrenciler.add(new Ogr(9, "Zeynep", "Isiklar", "EE Mühendisliği", 80d));
        ogrenciler.add(new Ogr(10, "Berk", "Hayta", "Endüstri Mühendisliği", 79d));
        ogrenciler.add(new Ogr(11, "Kenan Kerem", "Öktener", "İnşaat Mühendisliği", 75d));
        ogrenciler.add(new Ogr(12, "Emir", "Esen", "İnşaat Mühendisliği", 75d));
        ogrenciler.add(new Ogr(13, "Hicran", "Arslan", "EE Mühendisliği", 85.0d));
        ogrenciler.add(new Ogr(14, "İdris", "Tamdoğan", "EE Mühendisliği", 75d));
        ogrenciler.add(new Ogr(15, "Sefa", "Goktepe", "Kimya Mühendisliği", 75.0));
        ogrenciler.add(new Ogr(16, "Mina", "Bilici", "EE Mühendisliği", 87d));


        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("java14.bin"))){

            out.writeObject(ogrenciler);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

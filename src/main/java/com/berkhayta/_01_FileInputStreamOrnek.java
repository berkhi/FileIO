package com.berkhayta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_FileInputStreamOrnek {
    public static void main(String[] args) {
        System.out.println(dosyaOku("/Users/berkhayta/Downloads/belge3.txt"));
    }
    public static String dosyaOku(String dosyaYolu){
        StringBuilder metin = new StringBuilder();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(dosyaYolu);
            int okunanKarakter;
            while ((okunanKarakter=fis.read())!=-1) {
                metin.append((char)okunanKarakter);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Fis işlemi sırasında dosya bulunamadı.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Fis'te okuma sırasında hata meydana geldi.");
            throw new RuntimeException(e);
        }
        return dosyaYolu;
    }
}

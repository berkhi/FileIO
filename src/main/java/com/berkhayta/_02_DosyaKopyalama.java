package com.berkhayta;
/*
Kopya oluşturma:
1. Adım: Dosyayı oku, okuduğum değerleri bir ArrayListe yaz.
2. Adım: ArrayListteki verilerle yeni dosya yaz.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class _02_DosyaKopyalama {

    public static ArrayList<Integer> dosyaIcerik=new ArrayList<>();

    public static void main(String[] args) {



        dosyaOku("D:/java14Files/manzara.webp");
        kopyaOlustur("D:/java14Files/manzaraKopya.webp");
        kopyaOlustur("D:/java14Files/manzaraKopya1.webp");
        //kopyaOlustur("C:/manzaraKopya2.webp"); Windowsda C dizinine direkt olarak birşey yazamazsınız.
    }

    public static void dosyaOku(String dosyaYolu){

        FileInputStream fis=null;
        try {
            fis = new FileInputStream(dosyaYolu);
            int okunanKarakter;
            while ((okunanKarakter=fis.read())!=-1) {
                dosyaIcerik.add(okunanKarakter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fis işlemi sırasında dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Fis'te okuma sırasında hata meydana geldi.");
        } catch (RuntimeException e){
            System.out.println("Runtime exception oluştu.");
        }
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Fis kapatılamadı");
        } catch (NullPointerException e){
            System.out.println("Kapatılacak dosya yok.");
        }
    }

    public static void kopyaOlustur(String dosyaYolu){
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(dosyaYolu);
            for (Integer i : dosyaIcerik) {
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

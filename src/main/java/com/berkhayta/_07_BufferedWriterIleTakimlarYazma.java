package com.berkhayta;

import java.io.*;

public class _07_BufferedWriterIleTakimlarYazma {
    public static void main(String[] args) {
        takimEkle("Eskişehirspor");
        ogrenciEkle("Hicran Arslan",444);
        ogrenciEkle("Serkan Güner",555);
        ogrenciEkle("Mina Bilici",777);
    }

    private static void takimEkle(String eklenecekTakim) {
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("takimlar.txt",true))){
            bufferedWriter.write("\n"+eklenecekTakim);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Yazma işlemi tamamlandı.");
    }

    private static void ogrenciEkle(String ogrenciAdSoyad,int ogrNo) {
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("liste.txt",true))){
            bufferedWriter.write("\n"+ogrenciAdSoyad+","+ogrNo);
            //bufferedWriter.write(new Ogrenci("aaa",111));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Yazma işlemi tamamlandı.");
    }

}

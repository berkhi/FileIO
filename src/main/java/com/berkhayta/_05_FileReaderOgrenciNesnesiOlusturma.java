package com.berkhayta;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_FileReaderOgrenciNesnesiOlusturma {
    public static void main(String[] args) {
        List<Ogrenci> ogrenciList=new ArrayList<>();
        try(Scanner sc=new Scanner(new FileReader("liste.txt"))){
            while(sc.hasNextLine()) {
                String ogrenciString = sc.nextLine();
                String[] ogrenciVeri = ogrenciString.split(",");
                System.out.println(ogrenciVeri[0]+"-"+ogrenciVeri[1]);
                Ogrenci ogr=new Ogrenci(ogrenciVeri[0].trim(),Integer.parseInt(ogrenciVeri[1].trim()));
                ogrenciList.add(ogr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileReader dosyayı bulamadı.");
            e.printStackTrace();
        }

        //ogrenciList yazdıralım:
        for (Ogrenci ogrenci : ogrenciList) {
            System.out.println(ogrenci);
        }
    }
}

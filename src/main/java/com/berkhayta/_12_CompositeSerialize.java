package com.berkhayta;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _12_CompositeSerialize {
    public static void main(String[] args) {
        Otomobil oto1=new Otomobil("Oto1","Oto1Model1",2022,"Beyaz",new Motor("Multijet",100));
        Otomobil oto2=new Otomobil("Oto2","Oto2Model1",2020,"Beyaz",new Motor("Multijet",101));
        Otomobil oto3=new Otomobil("Oto3","Oto3Model1",2021,"Siyah",new Motor("Multijet",102));
        Otomobil oto4=new Otomobil("Oto4","Oto4Model1",2023,"Gri",new Motor("Multijet",103));

        ArrayList<Otomobil> otomobilArrayList=new ArrayList<>();
        otomobilArrayList.add(oto1);
        otomobilArrayList.add(oto2);
        otomobilArrayList.add(oto3);
        otomobilArrayList.add(oto4);

        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("otomobiller.bin"))){
            out.writeObject(otomobilArrayList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

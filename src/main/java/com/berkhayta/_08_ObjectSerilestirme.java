package com.berkhayta;

import java.io.*;
import java.util.ArrayList;

public class _08_ObjectSerilestirme {
    public static void main(String[] args) {
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("otomobil.bin",true))){

            Otomobil oto1=new Otomobil("Opel","Mokka",2023);
            Otomobil oto2=new Otomobil("Mercedes","S450",2022);
            Otomobil oto3=new Otomobil("Mazda","G5",2028);

            out.writeObject(oto1);
            out.writeObject(oto2);
            out.writeObject(oto3);




        } catch (NotSerializableException e){
            System.out.println("Kaydetmeye çalıştığınız obje Serializable değil.");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

package com.berkhayta;

import java.io.*;

public class _09_ObjectDeserialize {
    public static void main(String[] args) {
        try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("otomobil.bin"))){

//            Otomobil oto1 = (Otomobil)input.readObject();
//            System.out.println(oto1);
//            Otomobil oto2 = (Otomobil)input.readObject();
//            System.out.println(oto2);
//            Otomobil oto3 = (Otomobil)input.readObject();
//            System.out.println(oto3);
            Otomobil oto;
            while( (oto= (Otomobil)input.readObject() )!=null){
                System.out.println(oto);
            }
        } catch (EOFException e){
            System.out.println("Dosya Okuma Tamamlandı..");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

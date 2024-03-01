package com.berkhayta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class _13_CompositeDeserialize {
    public static void main(String[] args) {
        try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("otomobiller.bin"))){

             ArrayList<Otomobil> okunanOtomobilArraylist= (ArrayList<Otomobil>) input.readObject();
                okunanOtomobilArraylist.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.berkhayta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _06_BufferedReaderIleTakimlarOkuma {
    public static void main(String[] args) {
        dosyadanBirSatirOkuma();
        dosyaninTamaminiOkuma();
    }

    private static void dosyadanBirSatirOkuma() {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("takimlar.txt"))){
            String okunanSatir = bufferedReader.readLine();
            System.out.println(okunanSatir);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void dosyaninTamaminiOkuma() {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("takimlar.txt"))){
            String okunanSatir;
            while((okunanSatir= bufferedReader.readLine())!=null){
                System.out.println(okunanSatir);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

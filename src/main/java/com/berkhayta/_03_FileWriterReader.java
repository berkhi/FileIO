package com.berkhayta;

/*
FIS - FOS : Bütün dosya türleri ile IO işlemleri yapılabilir.
Ancak sadece metin dosyaları üzeirnde çalışmak isterseniz: FileWriter ve FileReader kullanabilirsiniz.
 */

import java.io.FileWriter;
import java.io.IOException;

public class _03_FileWriterReader {
    public static void main(String[] args) {
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter("dosya.txt");
            fileWriter.write("İSTANBUL şçğ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

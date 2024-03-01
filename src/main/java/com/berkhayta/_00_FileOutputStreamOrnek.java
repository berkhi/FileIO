package com.berkhayta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _00_FileOutputStreamOrnek {
    public static void main(String[] args) {
        // 1.YOL: FOS'a File ile dosya path'i gösterme
        File file=new File("belge.txt");
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream(file,true);
            fos.write('B');
            fos.write('E');
            fos.write('R');
            fos.write('K');
            fos.write("HYT".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Fos işlemi sırasında dosya bulunamadı.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında bir hata meydana geldi.");
            throw new RuntimeException(e);
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Fos kapatılırken bir hata meydana geldi.");
                throw new RuntimeException(e);
            }
        }


        // 2.YOL: Fos filename ile relative yol gönderme

        FileOutputStream fos2=null;
        try {
            //Relative Path: Göreceli
            fos2 = new FileOutputStream("belge2.txt",true);
            fos2.write('B');
            fos2.write('E');
            fos2.write('R');
            fos2.write('K');
            fos2.write('\n');
            fos2.write(new byte[]{'a','b','c'});
            fos2.write("HYT".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Fos işlemi sırasında dosya bulunamadı.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında bir hata meydana geldi.");
            throw new RuntimeException(e);
        }finally {
            try {
                fos2.close();
            } catch (IOException e) {
                System.out.println("Fos kapatılırken bir hata meydana geldi.");
                throw new RuntimeException(e);
            }
        }
        // 3.YOL: Fos'a filename ile absolute path gönderme
        FileOutputStream fos3=null;
        try {
            //Absolute Path: Kesin dosya yolu.
            fos3 = new FileOutputStream("/Users/berkhayta/Downloads/belge3.txt",true);
            fos3.write('B');
            fos3.write('E');
            fos3.write('R');
            fos3.write('K');
            fos3.write("HYT".getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("Fos işlemi sırasında dosya bulunamadı.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında bir hata meydana geldi.");
            throw new RuntimeException(e);
        }finally {
            try {
                fos3.close();
            } catch (IOException e) {
                System.out.println("Fos kapatılırken bir hata meydana geldi.");
                throw new RuntimeException(e);
            }
        }
    }
}

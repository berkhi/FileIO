package com.berkhayta;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//try-with-resources: Kaynaklarla çalışan try:
// bu yapıyı kullanabilmek için Kaynağınız Closeable interface'ini implemente etmelidir.
// bu yapı sayesinde try içinde açılan yapılar otomatik olarak kapatılır.
// close metodunu çağırmanıza gerek kalmaz.
// bu durumda finally bloğuna da gerek kalmaz.
// close ederken oluşturduğumuz try-catch yapısına da gerek kalmaz.


public class _04_FileWriterTryWithResources {
    public static void main(String[] args) {

        try(FileWriter fw=new FileWriter("dosyaYeni.txt")){
            //dosyaya yazılacak metni kullanıcıdan alınız.(-1 girene kadar)
            Scanner sc=new Scanner(System.in);
            System.out.println("Dosyaya yazılacak metni giriniz. (Sonlandırmak için -1)");
            String girdi;
            StringBuilder sb=new StringBuilder();
            while( !(girdi=sc.nextLine()).equals("-1")){
                sb.append(girdi+"\n");
            }
            fw.write(sb.toString());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

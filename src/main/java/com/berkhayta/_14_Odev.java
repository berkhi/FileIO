package com.berkhayta;

import com.berkhayta._14_ExceptionLogging.Log;
import com.berkhayta._14_ExceptionLogging.LogServices;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Programdaki oluşan exceptionları bir Log dosyasında tutalım.
 * Log sınıfı oluşturmalısınız.
 * errorMessage, errorCode, className, methodName, zaman, detay
 *
 * Oluşan hatalarda log sınıfından nesne üretilsin ve loglar.bin dosyasına kaydedilsin.
 * Logları okumak için de bir metod oluşturabilirsiniz.
 */

public class _14_Odev {

    public static void main(String[] args) {
        LogServices logServices = new LogServices();
        try {
            int sonuc = bol(10, 0);
        } catch (ArithmeticException e) {
            Log log = new Log("Sıfıra bölme hatası", 500, "_14_Odev", "bol", LocalDateTime.now(), e.getMessage());
            logServices.kaydet(log);
        }
        List<Log> loglar = logServices.loglariOku();
        for (Log log : loglar) {
            System.out.println(log.toString());
        }
    }

    public static int bol(int sayi, int bolen) {
        return sayi / bolen;
    }
}

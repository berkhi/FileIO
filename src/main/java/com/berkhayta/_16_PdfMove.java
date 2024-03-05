package com.berkhayta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _16_PdfMove {
    public static void main(String[] args) {
        Path resourcePath= Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources");
        Path targetPath=Path.of("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\kitaplar\\");
//        try {
//            dosyaTasi(resourcePath, targetPath,".pdf");
//        } catch (IOException e) {
//            e.printStackTrace();
//        };


        //Dosya silmek:
        try {
            //Files.deleteIfExists(Path.of("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\kitaplar\\kitap.pdf"));
            Files.delete(Path.of("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\kitaplar\\kitap.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dosyaTasi(Path resourcePath, Path targetPath,String uzanti) throws IOException {
        Files.walk(resourcePath)
                .filter(path -> path.toString().endsWith(uzanti))
                .forEach(path -> {
                    try {
                        Files.move(path, targetPath.resolve(path.getFileName()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}

package com.berkhayta;
/*
Nio: New IO, Non-Blocking IO
 */

import java.io.IOException;
import java.nio.file.*;

public class _15_FileNio {
    public static void main(String[] args) throws IOException {
        // Path: yol+dosya adı
        // Relative Path
        // Absolute Path
        Path p1= Paths.get("a/b/c");
        Path p2=Paths.get("a","b","c");
        System.out.println(p1);
        System.out.println(p1.getClass()); //Windowsta: sun.nio.fs.WindowsPath, Mac=UnixPath

        System.out.println(p2);

        Path absolutePath=Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources");
        Path absolutePath2=Paths.get("/deneme");
        Path relativePath=Paths.get("deneme");
        Path relativePath2=Paths.get("..");
        Path relativePath3=Paths.get("../..");

        System.out.println(absolutePath);
        System.out.println(absolutePath2.toAbsolutePath());
        System.out.println(relativePath.toAbsolutePath());
        System.out.println(relativePath2.toAbsolutePath());
        System.out.println(relativePath2.toRealPath(LinkOption.NOFOLLOW_LINKS));
        System.out.println(relativePath3.toRealPath(LinkOption.NOFOLLOW_LINKS));

        Path anormalizePath= Paths.get("a/b/c/../../d/././c");
        System.out.println(anormalizePath);
        System.out.println(anormalizePath.normalize());
        System.out.println(anormalizePath.getFileName());

        Path denemeTxtPath=Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\Deneme.txt");
        System.out.println("toRealPath()...."+denemeTxtPath.toRealPath(LinkOption.NOFOLLOW_LINKS));
        System.out.println("toAbsolutePath()...."+denemeTxtPath.toAbsolutePath());
        System.out.println("toString()...."+denemeTxtPath.toString());
        System.out.println("toUri()...."+denemeTxtPath.toUri()); // file:///
        System.out.println("isAbsolute()........"+denemeTxtPath.isAbsolute());

        Path denemeTxtRelativePath=Paths.get("src\\main\\resources\\Deneme.txt");
        System.out.println("toRealPath()...."+denemeTxtRelativePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
        System.out.println("toAbsolutePath()...."+denemeTxtRelativePath.toAbsolutePath());
        System.out.println("toString()...."+denemeTxtRelativePath.toString());
        System.out.println("toUri()...."+denemeTxtRelativePath.toUri()); // file:///
        System.out.println("isAbsolute()........"+denemeTxtRelativePath.isAbsolute());

        System.out.println();


        Path suAnkiPath=Paths.get(".");
        System.out.println("Şu an ki dizin:"+suAnkiPath.toRealPath(LinkOption.NOFOLLOW_LINKS));

        Path resourceAbsolutePath=Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources");
        Path resimKlasoru=resourceAbsolutePath.resolve("resimler");
        Path denemeKlasoru=resourceAbsolutePath.resolve("a/b/c");
        //Files.createDirectory(resimKlasoru);
        Files.createDirectories(denemeKlasoru);

        //Dizindekileri listelemek:
        System.out.println("Resources Dizinindeki Klasörler:");
        Files.walk(resourceAbsolutePath)
                .filter(path -> Files.isDirectory(path))
                .forEach(System.out::println);
        System.out.println("Resources Dizinindeki Herşey :");
        Files.walk(resourceAbsolutePath)
                      .forEach(System.out::println);

        System.out.println("Resources Dizinindeki Dosyalar :");
        Files.walk(resourceAbsolutePath)
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
        System.out.println("Resources Dizinindeki Sadece .pdf Dosyalar :");
        Files.walk(resourceAbsolutePath)
                .filter(path -> path.toString().endsWith(".pdf"))
                .forEach(System.out::println);
        Path resim=Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\resim.jpg");
        Path resimKlasoru2=Paths.get("D:\\JAVA14GITHUB\\Java14Full\\Java14_06_FileIO\\FileIO\\src\\main\\resources\\resimler\\moveResim.jpg");
        //Files.copy(resim,resimKlasoru2,StandardCopyOption.REPLACE_EXISTING); // bu işlem copy+past
       // Files.move(resim,resimKlasoru2,StandardCopyOption.REPLACE_EXISTING); // bu işlem cut+paste

        //pdf lerin hepsini kitaplar klasörüne taşıyın.
    }
}

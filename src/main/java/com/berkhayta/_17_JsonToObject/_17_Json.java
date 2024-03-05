package com.berkhayta._17_JsonToObject;
/*

    JSON: Javascript Object Notation
    Veri taşıma da boyutu küçük dosyalar oluşturarak kolaylık ve hız sağladığı için çokca tercih edilir.
    Alternatif: XML

    {
        K : V
        "ad":"Barış",
        "yas":30,
        "araba":null
    } // bu bir json objesidir.
    [] : Json Array aklınıza gelsin.
    {}: Json Object aklınıza gelsin.
 */

public class _17_Json {
    public static void main(String[] args) {
        UserRepository repository=new UserRepository();
        repository.getUsers(200)
                .stream()
                .filter(user -> user.getLocation().getCountry().equals("Turkey"))
                .forEach(System.out::println);
    }
    // ödeviniz burada 10 tane stream sorusu yazıp çözümünü yapınız.
}

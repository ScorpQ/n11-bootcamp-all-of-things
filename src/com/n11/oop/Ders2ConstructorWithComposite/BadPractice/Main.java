package com.n11.oop.Ders2ConstructorWithComposite.BadPractice;


public class Main {
    public static void main(String[] args) {

        // Biyolojik kısımlar teker teker yazıldı ve composite class kullanılmadığı için çok karmaşık ve uzun gözüküyor.
        Baba baba = new Baba("yeşil", "badem", "geniş", "büyük", "küçük", "2");


        // Şimdi aynı şeyi Good Practice içerisinde yapalım.
    }
}
package com.n11.oop.Ders2ConstructorWithComposite.GoodPractice;

// Imports


import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Burun;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Goz;
import com.n11.oop.Ders2ConstructorWithComposite.GoodPractice.BioParts.Kulak;

public class Main {
    public static void main(String[] args) {

        // Composite class'lar ile çok daha temiz bir CTR kullanımı
        Baba baba = new Baba(
                new Goz("yeşil", "badem"),
                new Burun("geniş", "büyük"),
                new Kulak("küçük", "2")
        );
    }
}
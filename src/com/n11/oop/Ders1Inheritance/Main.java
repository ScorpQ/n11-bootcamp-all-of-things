package com.n11.oop.Ders1Inheritance;

// Imports
import com.n11.oop.Ders1Inheritance.CocukCesitleri.AkilliCocuk;
import com.n11.oop.Ders1Inheritance.CocukCesitleri.UsluCocuk;

public class Main {
    public static void main(String[] args) {

        // Bu class inheritance (kalıtım) kullanılmadan doğrudan bir sınıf üzerinden gidilecek yapıldı.
        Insan insan = new Insan();
        insan.ad = "Cansın";
        insan.soyad = "Lale";
        insan.yas = 47;
        insan.maas = 3.14;
        insan.cinsiyet = true;
        insan.uyu();


        // Baba ve Anne class'ları ise inheritance kullanılarak oluşturulmuş class'lar.
        // Insan class'ının özelliklerini inheritance ile aldı.
        Baba baba  = new Baba();
        baba.ad = "Fahrettin";
        baba.soyad = "Lale";
        baba.yas = 47;
        baba.maas = 3.14;
        baba.cinsiyet = true;
        baba.uyu();

        // Baba ve Anne class'ları ise inheritance kullanılarak oluşturulmuş class'lar.
        // Insan class'ının özelliklerini inheritance ile aldı.
        Anne anne = new Anne();
        anne.ad = "Sahriye";
        anne.soyad = "Lale";
        anne.yas = 47;
        anne.maas = 3.14;
        anne.cinsiyet = true;
        anne.uyu();


        // Akıllı ve Uslu çocuk classlarında ise inheritance kullanılarak oluşturulmuş class'lar.
        // Burada Akıllı ve Uslu class'ları çocuktan extend edildi, çocuk ise insandan extend edildi.
        // Böylece akıllı/uslu classlar insan özelliklerine sahip oldukları gibi bir de sadece çocuk classına özel
        // field ve fonksiyonları da barındırıyor böylece 'Encapsulation' da yapmış sayılırız bir yandan.
        AkilliCocuk  akilliCocuk = new AkilliCocuk();
        akilliCocuk.ad = "Halle";
        akilliCocuk.soyad = "Lale";
        akilliCocuk.yas = 15;
        akilliCocuk.cinsiyet = true;
        akilliCocuk.cocukBilgileriYazdir();


        // Akıllı ve Uslu çocuk classlarında ise inheritance kullanılarak oluşturulmuş class'lar.
        // Burada Akıllı ve Uslu class'ları çocuktan extend edildi, çocuk ise insandan extend edildi.
        // Böylece akıllı/uslu classlar insan özelliklerine sahip oldukları gibi bir de sadece çocuk classına özel
        // field ve fonksiyonları da barındırıyor böylece 'Encapsulation' da yapmış sayılırız bir yandan.
        UsluCocuk usluCocuk = new UsluCocuk();
        usluCocuk.ad = "Tamme";
        usluCocuk.soyad = "Lale";
        usluCocuk.yas = 15;
        usluCocuk.cinsiyet = true;
        usluCocuk.cocukBilgileriYazdir();



        // Son olarak biz bazı class'ların bazı özel özelliklere sahip olmasını istersek yani
        // Baba maketyap ve bahçedüzenle- Anne sofrahazırla ve temizlikyap - Çocuk ise dersçalış özelliklerine sahip olsun.
        // Bunu interface ile yapabiliriz ama önce Class kullanarak yapmaya çalışalım ve sonuçları aşağıda özetleyelim::

        // Insan class'ına Özellikler classını extend ederiz. Böylece gerçekten de bu istenilen özelliklere erişebiliriz.
        Baba baba2  = new Baba();
        Anne anne2 = new Anne();
        Cocuk cocuk2 = new Cocuk();

        // Fark ettiysen baba sofrahazırla yapmamalı - anne maket yapmamalı - cocuk temizlikyapmamlı ama tüm bunları yapabiliyor.
        // İstedikleri özellikleri yapabildikleri gibi istenmeyen özellikleri da yapar hale geldiler.
        // Demekki Class'lara özel özellikler tanımlamak istersek class kullanmamamız lazım.
        baba2.sofrahazırla();
        anne2.maketyap();
        cocuk2.temizlikyap();

        // ---- !! ----
        // Son olarak burada encapsulation kavramını da ihlal etmiş oluruz. Çünkü istenmeyen özelliklere erişe de biliyoruz.
        // Son olarak bir class birden fazla class'tan türeyemez. Extend edilemez.
        // Son olarak bir class birden fazla interface'ten türeyebilir. Implement edilebilir.
        // ------------

        // Ders1Interface kısmında geçelim...
    }
}
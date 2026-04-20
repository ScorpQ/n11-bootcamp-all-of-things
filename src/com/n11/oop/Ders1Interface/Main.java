package com.n11.oop.Ders1Interface;

// Imports
import com.n11.oop.Ders1Interface.Anne;
import com.n11.oop.Ders1Interface.Baba;
import com.n11.oop.Ders1Interface.Cocuk;
import com.n11.oop.Ders1Interface.CocukCesitleri.AkilliCocuk;
import com.n11.oop.Ders1Interface.CocukCesitleri.UsluCocuk;
import com.n11.oop.Ders1Interface.Insan;


public class Main {
    public static void main(String[] args) {


        // Az önce Ders1Inheritance'ın sonunda, classlarımızın özel özelliklere sahip olmasını istemiştik.
        // Bunu class ile yaptığımı zaman, encapslation methoduna aykırılık yani herkes her methoda erişebilir hale gelmişti
        // Şimdi ise interface'ler tanımlarıp bunları ilgili classlara implemente ediyoruz.

        // Baba okusun ve dinlesin - Anne okusun ve yazsın - Çocuk is sadece okusun

        Baba baba2  = new Baba();
        Anne anne2 = new Anne();
        Cocuk cocuk2 = new Cocuk();

        // baba2.yaz(); Kesinlikle hata atar çünkü 'yaz' interface'ini baba class'ına implemente etmedik. Baba sadece 'oku ve dinle'
        baba2.dinle();
        baba2.oku();

        // anne2.dinle(); Kesinlikle hata atar çünkü 'dinle' interface'ini anne class'ına implemente etmedik. Anne sadece 'oku ve yaz'
        anne2.yaz();
        anne2.oku();

        // cocuk2.dinle/yaz(); Kesinlikle hata atar çünkü 'dinle/yaz' interface'ini cocuk class'ına implemente etmedik. Cocuk sadece 'oku'
        cocuk2.oku();

        // Interface'i kafamızd fazla büyütmeyelim....
    }
}
package com.n11.oop.Ders1Interface.Interfaces;


// Bu interface tanımı kesinlikle hatalı çünkü yine spesifik özellikleri class ile eklemeyle aynı yola çıkıyor.
// Tek bir classa implemente edince o class, "okuma-yazma-dinleme" özelliklerine sahip olur ve biz bunu istemiyoruz.
// Biz sadece istediğimiz classlar istediğimiz özelliklere sahip olsun istiyoruz...

public interface IHatalıOzellikler {
    public void Ioku();
    public void dinle();
    public void yaz();
}

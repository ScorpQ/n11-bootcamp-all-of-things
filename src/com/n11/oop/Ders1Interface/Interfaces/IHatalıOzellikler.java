package com.n11.oop.Ders1Interface.Interfaces;

// Bu interface tanımı kesinlikle hatalı çünkü yine spesifik özellikleri class ile eklemeyle aynı yola çıkıyor.
// Tek bir classa implemente edince o class, tüm özelliklere(bahcedüzenle, derscalis, ...) sahip olur ve biz bunu istemiyoruz.
// Biz sadece istediğimiz classlar istediğimiz özelliklere sahip olsun istiyoruz.
// Doğru yaklaşım: IBahce, IDers, IMaket, ISofra, ITemizlik şeklinde ayrı ayrı interface tanımlamak.

public interface IHatalıOzellikler {
    public void bahceDuzenle();
    public void dersCalış();
    public void maketYap();
    public void sofraHazirla();
    public void temizlikYap();
}
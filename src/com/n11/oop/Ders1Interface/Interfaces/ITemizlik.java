package com.n11.oop.Ders1Interface.Interfaces;

// Interface içerisindeki tüm methodlar gövdesiz olmalıdır.
// Kesinlikle public'tir.

// Kısaca bir class'ın hangi methodlara (kesinlikle) sahip olabileceğini göstermektedir. Bir sözleşme gibidir.
// Implemente edilen classta, interface'in tüm methodları override edilip gövdeli hali yazılmalıdır.

// !!! Biz bir class'a spesifik özellik grubu eklemek istediğimiz zaman şu an yaptığımız gibi bir interface oluşturmak
// zorunda değiliz. Bu işlem tamamen kod yapısının anlaşılabilirliği/okunabilirliği/geliştirilebilirliği ile ilgilidir.
// Interface olmazsa geliştirme sıralarında varolan bir method tekrar farklı bir isimle eklenebilir.
// Bu sebeple DRY yapısına aykırılığa sebep olabilir.

public interface ITemizlik {
    public void temizlikYap();
}

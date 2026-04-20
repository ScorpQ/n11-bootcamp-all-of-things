Abstraction, class'ların ortak özelliklerinin tek bir noktada toplanmasıdır.
Bu classlardan doğrudan obje oluşturmayız, extend ederiz.

Peki Interface ile Abtraction farkı nedir?
    - Aslında ikisini de kullanarak aynı işi yapabiliriz, fakat bazı durumlarda bu mümkün değildir.
    Interface ile class'lara spesifik özellikleri implemente edebilirken
    Abtraction ile class'lara ortak özellik extend ederiz.

    Aslında fark çok basit:
        - Anne konuşabilir.
        - Baba konuşabilir.
        - Çocuk konuşabilir.
        konuşma özelliği tüm class'larda ortak olduğu için burada abstract class kullanmalıyız.


        - Anne sadece okuyabilir, yazabilir.
        - Baba sadece okuyabilir, dinleyebilir.
        - Cocuk sadece okuyabilir.
        okuma-yazma-dinleme sadece bazı classlara özel olduğu için interface kullanılır.

    INTERFACE = CAN DO?
    ABSTRACTION IS A?
    bu soruları da sorabiliriz.
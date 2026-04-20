Aslında her şey iyi gibi duruyor. Ama yeni bir logger tipi eklemek istediğimiz zaman neler
yapmalıyız adım adım inceleyelim:

  LogType'a yeni bir tip eklenmel/yazmalı. JSON diyelim.

  Logger class'ına gelip diğerleri gibi JSON log tipini de eklememiz lazım. (10. satır)

  Logger class'ında bu sefer CTR'Ye yeni parametre eklememiz lazım (16. satır)

  Logger clas'ında bulunan switch-case'e ekleme yapmamız lazım :)

  sonra da main.js'Te çağrırız.


Burada SOLID'in Open/Closed prinsibini çok ciddi şekilde ihlal etmiş oluruz.

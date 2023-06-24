@us08,@us08_01,@us08_02,@us08_03
Feature:US001_Vice_Dean_LessonCreatePage_Test

  @us08_01
  Scenario:Lesson Name ismini girebilmelidir
    Given kullanici ana sayfaya gider
    And kullanici login butonunu tıklar
    And kullanici username "vicedeanbulent" girer
    And kullanıcı 3 saniye bekler
    And kullanici password "12345678" girer
    And kullanıcı 2 saniye bekler
    And kullanici loginMenu butonunu tıklar
    And kullanici lesson basligini tiklar
    And kullanıcı 2 saniye bekler
    And kullanici LessonName bilgisini girer
    And kullanıcı 3 saniye bekler
    And kullanici menuButtonu clickler
    And kullanıcı 2 saniye bekler
    And kullanici logout secenegini tıklar
    And kullanıcı 1 saniye bekler
    And kullanici YES secenegini tıklar
    And kullanıcı 2 saniye bekler
    Then kullanici sayfayı kapatir

  @us08_02
    Scenario:Dersin, zorunlu (Compulsory) olup olmadıgını isaretleyebilmelidir.
      Given kullanici ana sayfaya gider
      And kullanici login butonunu tıklar
      And kullanici username "vicedeanbulent" girer
      And kullanıcı 3 saniye bekler
      And kullanici password "12345678" girer
      And kullanici loginMenu butonunu tıklar
      And kullanici lesson basligini tiklar
      And kullanici LessonName bilgisini girer
      And kullanıcı 3 saniye bekler
      Then Compulsory secenegini isaretler
      And kullanici sayfayı kapatir

  @us08_03
    Scenario:Credit Score girebilmelidir
      Given kullanici ana sayfaya gider
      And kullanici login butonunu tıklar
      And kullanici username "vicedeanbulent" girer
      And kullanıcı 3 saniye bekler
      And kullanici password "12345678" girer
      And kullanici loginMenu butonunu tıklar
      And kullanici lesson basligini tiklar
      And kullanici LessonName bilgisini girer
      And kullanıcı 3 saniye bekler
      And Compulsory secenegini isaretler
      And kullanıcı 2 saniye bekler
      And Credit Score 0 bilgisini girer
      And kullanıcı 2 saniye bekler
      And kullanici submit butonu tıklar
      And kullanıcı 1 saniye bekler
      And ekran goruntusunu alir
      Then Lesson Created Alert ini gorur
      And kullanıcı 2 saniye bekler
      And kullanici sayfayı kapatir






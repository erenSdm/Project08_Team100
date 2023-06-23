@us08
Feature:US001_Vice_Dean_LessonPage_Test

  Scenario: : vice dean anasayfaya gider
    Given kullanici "managementonschoolUrl" sayfasina gider
    And kullanici login butonunu tıklar
    And kullanici username "vicedeanbulent" girer
    And kullanıcı 3 saniye bekler
    And kullanici password "12345678" girer
    And kullanici loginMenu butonunu tıklar
    And kullanici lesson basligini tiklar
    Then kullanici LessonName bilgisini girer

    @us081
    Scenario: Vice_Dean_Lesson_Create
      Given kullanici "managementonschoolUrl" sayfasina gider
      And kullanici login butonunu tıklar
      And kullanici username "vicedeanbulent" girer
      And kullanıcı 3 saniye bekler
      And kullanici password "12345678" girer
      And kullanici loginMenu butonunu tıklar
      And kullanici lesson basligini tiklar
      And kullanici LessonName bilgisini girer
      And kullanıcı 3 saniye bekler
      Then Compulsory secenegini isaretler

    Scenario:
      Given kullanici "managementonschoolUrl" sayfasina gider
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






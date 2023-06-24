
Feature: US18-TC02 Teacher ogrenci islemleri

  Scenario: US18-TC02 Teacher notlari silebilmeli
    Given student Info Management sayfasina gidilir_k
    And login butonuna basilir_k
    And iki saniye beklenir_k
    And username ve password girilir_k
    And iki saniye beklenir_k
    And logine basilir
    And iki saniye beklenir_k
    And edit butonuna basilir
    And edit student info sayfasinin acilmasi beklenir
    And iki saniye beklenir_k
    And acilan sayfada ders "<Phyton>" ile degistirilir





  #  And acilan sayfada choose education term degistirilir
  #    And acilan sayfada absentee degistirilir
  #    And acilan sayfada midterm exam degistirilir
  #    And acilan sayfada final exam degistirilir
  #    And acilan sayfada info note degistirilir






















  #Anasayfaya gidilir
  #Advisor Teacher olarak giris yapilir
  #Menu tiklanir
  #Student Info Management bolumune girilir
  #Student Info list kisminda Edit tusuna basilir
  #Edit Student Info sayfasinin gelmesi beklenir
  #Edit student Info  bolumunde Choose Lesson  degistirilir
  #Edit student Info  bolumunde Choose Education Term  degistirilir
  #Edit student Info  bolumunde Ansentee degistirilir
  #Edit student Info  bolumunde Midterm Exam degistirilir
  #Edit student Info  bolumunde Final Exam degistirilir
  #Edit student Info  bolumunde Note degistirilir
  #Edit student Info  bolumunde Info Note degistirilir
  #Submit tusuna basilir
  #Degisiklik yapildi yazisi gorulur
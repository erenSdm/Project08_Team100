Feature: US18-Taecher ogrenci not islemleri

  Scenario: Teacher ogrenci notlarini gorebilmeli
  Given student Info Management sayfasina gidilir_k
    And login butonuna basilir_k
    And iki saniye beklenir_k
    And username ve password girilir_k
    And iki saniye beklenir_k
    And logine basilir
    Then name in girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then lesson un girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then absentee nin girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then midtermexam in girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then finalexam in girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then note nin girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then infonote nin girilmis oldugu gorulur_k
    And iki saniye beklenir_k
    Then average in girilmis oldugu gorulur_k
    And iki saniye beklenir_k









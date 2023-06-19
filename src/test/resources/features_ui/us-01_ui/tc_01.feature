@register
Feature: US01 Register
  Background: kullanici ana sayfaya gider
    Given kullanici_managentonschool_ana_sayfasina gider
    And kullanici register butonuna tiklar
    And kullanicinin register sayfasinda oldugu dogrulanir

  Scenario: TC01 Register Pozitif Testi
    Given kullanici Name bolumune gecerli bir "name" girer
    And kullanici Surname bolumune gecerli bir "Surname" girer
    And Kullanici Birth Place bolumune gecerli bir "Birth Place" girer
    And Kullanici Phone bolumune gecerli bir "Phone nummber" girer
    And kullanici rastgele bir Gerder secer
    And Kullanici Date Of Birth bolumune gecerli bir "Date Of Birth" girer
    And kullanici Ssn bolumune gecerli bir "Ssn" girer
    And kullanici Username bolumune gecerli bir "Username" girer
    And kullanici Password bolumune gecerli bir "Password" girer
    And kullanici register butonunu tiklar
    Then kullanici register islemlerinin basari ile tamamlandigini gorur

  Scenario: TC02 Register Name Boşluk Pozitif Testi
    Given kullanici Name bolumune "" girer
    And kullanici Surname bolumune gecerli bir "Surname" girer
    And Kullanici Birth Place bolumune gecerli bir "Birth Place" girer
    And Kullanici Phone bolumune gecerli bir "Phone nummber" girer
    And kullanici rastgele bir Gerder secer
    And Kullanici Date Of Birth bolumune gecerli bir "Date Of Birth" girer
    And kullanici Ssn bolumune gecerli bir "Ssn" girer
    And kullanici Username bolumune gecerli bir "Username" girer
    And kullanici Password bolumune gecerli bir "Password" girer
    And kullanici register butonunu tiklar
    Then kullanici Name bolumunu bos biraktigina dair uyari alir

  Scenario: TC03 Register Name Bosluk Karakteri Pozitif Testi
    Given kullanici Name bolumune "  " girer
    And kullanici Surname bolumune gecerli bir "Surname" girer
    And Kullanici Birth Place bolumune gecerli bir "Birth Place" girer
    And Kullanici Phone bolumune gecerli bir "Phone nummber" girer
    And kullanici rastgele bir Gerder secer
    And Kullanici Date Of Birth bolumune gecerli bir "Date Of Birth" girer
    And kullanici Ssn bolumune gecerli bir "Ssn" girer
    And kullanici Username bolumune gecerli bir "Username" girer
    And kullanici Password bolumune gecerli bir "Password" girer
    And kullanici register butonunu tiklar
    Then kullanici "Your name must consist of the characters" iceren bir mesaj alir

  Scenario: TC04 Register Surname Boşluk Negatif Testi
    Given kullanici Name bolumune gecerli bir "name" girer
    And kullanici Surname bolumune "" girer
    And Kullanici Birth Place bolumune gecerli bir "Birth Place" girer
    And Kullanici Phone bolumune gecerli bir "Phone nummber" girer
    And kullanici rastgele bir Gerder secer
    And Kullanici Date Of Birth bolumune gecerli bir "Date Of Birth" girer
    And kullanici Ssn bolumune gecerli bir "Ssn" girer
    And kullanici Username bolumune gecerli bir "Username" girer
    And kullanici Password bolumune gecerli bir "Password" girer
    And kullanici register butonunu tiklar
    Then kullanici surname bolumunu bos biraktigina dair uyari alir

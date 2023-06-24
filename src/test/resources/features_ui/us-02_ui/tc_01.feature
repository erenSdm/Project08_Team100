@US02
Feature: US02 Login

  Background: kullanici Guest User List gider
    Given Kullanıcı Url Adresine Gider
    Then Kullanıcı Login Tıklar
    And Kullanıcı Username Girer
    And Kullanıcı Password Girer
    And Kullanıcı Login Olur
    When Kullanıcı Login Oldugu Sayfadan Menu Tıklar
    And Kullanıcı Açılan Menüden Guest User Tıklar

  Scenario: TC01  Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini görebilmeli
    Given Kullanıcı Guest User List Görüntüleyebilmeli
    And Kullanıcı Name Bilgilerini Görebilmeli
    And Kullanıcı Phone Number Bilgilerini Görebilmeli
    And Kullanıcı SSN Bilgilerini Görebilmeli
    And Kullanıcı User Name Bilgilerini Görebilmeli
    And Sayfa Sonlandırmalı
  Scenario: TC02 Admin Guest User List bilgilerini silebilir
    Given Kullanıcı Guest User List İçerisindeki Bilgileri Silebilmeli
    And Sayfa Sonlandırmalı
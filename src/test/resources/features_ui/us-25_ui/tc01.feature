Feature: Admin, öğrenci oluşturabilme
  Scenario: Öğrencinin danışman öğretmeni seçilmelidir.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Sayfa kapatiliir
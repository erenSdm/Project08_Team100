
Feature: US17 Teacher, öğrencilere not verebilmelidir.

  Scenario Outline: TC03 Negatif Test Student info bolumune yanlis degerlerin girilmesi
    Given Anasyafaya_gidilir_k
    And login butonuna basilir_k
    And iki saniye beklenir_k
    And username ve password girilir_k
    And iki saniye beklenir_k
    And logine basilir
    And iki saniye beklenir_k
    Then "<username>" yazisi gorunur
    And add student Info bolumunde "Selenium" dersi secilir_k
    And iki saniye beklenir_k
    And add student Info bolumunde "Kubra ogrenci2" ogrencisi secilir_k
    And iki saniye beklenir_k
    And add student Info bolumunde "<SPRING_SEMESTER>" secilir_k
    And su bilgiler girilir: "<absentee>", "<midtermexam>", "<finalexam>", "<infonote>",
    And submit tusuna basilir_k
    And iki saniye beklenir_k
    And Logout yapilir

    Examples:
      | absentee     | midtermexam | finalexam | infonote |
      | 10.050       | 50          | 100       | Basarili |
      | 70           | 999         | 89        | Basarili |
      | yazi girilir | 1.99        | -56       | Basarili |
      | 100          | -70         | 78        | 56.9     |



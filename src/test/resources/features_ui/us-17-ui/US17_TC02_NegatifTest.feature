
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
    And add student Info bolumunde "Ahlak Dersi" dersi secilir_k
    And iki saniye beklenir_k
    And add student Info bolumunde "kubraogrenci" ogrencisi secilir_k
    And iki saniye beklenir_k
    And add student Info bolumunde "<SPRING_SEMESTER>" secilir_k
    And su bilgiler girilir: "<absentee>", "<midtermexam>", "<finalexam>", "<infonote>",
    And submit tusuna basilir_k
    And student info listte girilen bilgiler gorunur_k

    Examples:
      | absentee | midtermexam | finalexam | infonote |
      | 10       | 20          | 50        | Basarili |

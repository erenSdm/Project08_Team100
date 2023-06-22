

Feature: US17 Teacher, öğrencilere not verebilmelidir.

  Scenario Outline: TC01 Teacher Register Islemleri
    Given Anasyafaya_gidilir_k
    And iki saniye beklenir_k
    And register_tusuna_basilir_k
    And iki saniye beklenir_k
    And bu_bilgiler_girilir: "<name>", "<surname>", "<birtPlace>", "<phone>", "<gender>", "<dateOfbirth>","<ssn>","<username>", "<password>"
    And register butonuna basilir_k
    And iki saniye beklenir_k

    Examples:
      | name  | surname | birtPlace | phone        | gender | dateOfbirth | ssn         | username | password |
      | Derya | AK      | Bordeaux  | 123-999-4567 | female | 12.02.1990  | 124-65-9898 | derya    | 12345678 |


  Scenario Outline: TC02 Student info bolumune bilgilerin girilmesi
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





@US13_UI @US13_IU_AC1
Feature: US13_UI_AC1_Ders_Secme

  Background:
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"ViceDeanUserName"> UserName
    And Enter<"ViceDeanUserPassword"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    Then Click To <"teacherManagementMenu">



  Scenario: US13_AC1_TC01
    And Choose a lesson
    And Enter random<"name">
    And Enter random<"surname">
    And Enter random<"birthPlace">
    And Enter random<"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC1_TC01N

    And Enter random<"name">
    And Enter random<"surname">
    And Enter random<"birthPlace">
    And Enter random<"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"pleaseChooseLessonMessage">
##To DO assertleri düzenle
    And Quit Driver Gorkem
@US13_UI @US13_IU_AC13
Feature: US13_UI_AC10_SSNGirisi

  Background:
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"ViceDeanUserName"> UserName
    And Enter<"ViceDeanUserPassword"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    Then Click To <"teacherManagementMenu">
    And Choose a lesson
    And Enter specific <"Gecerli"> to <"name">
    And Enter specific <"GecerliSur"> to <"surname">
    And Enter specific <"Istanbul"> to <"birthPlace">
    And Enter random<"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter specific <"19061989"> to <"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">


  Scenario: US13_AC12_TC30
    And Enter specific <""> to <"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC12_TC30b
    And Enter specific <"1234567"> to <"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC13_TC31A
    And Enter specific <"1234567a"> to <"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem


  Scenario: US13_AC13_TC32
    And Enter specific <"1234567A"> to <"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC13_TC33
    And Enter specific <"ABCDEFGs"> to <"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem



@US13_UI @US13_IU_AC10
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

  Scenario: US13_AC10_TC24
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC10_TC25
    And Enter specific <"12345678"> to <"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC10_TC26
    And Enter specific <"123456789"> to <"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC10_TC27
    And Enter specific <"12345-6789"> to <"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC10_TC28
    And Enter specific <"123-456789"> to <"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem
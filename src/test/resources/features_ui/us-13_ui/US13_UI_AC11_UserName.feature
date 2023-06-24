@US13_UI @US13_IU_AC11
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

  Scenario: US13_AC11_TC29
    And Enter specific <""> to <"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC11_TC29a
    And Enter specific <"AhmetMAhmt232132"> to <"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem
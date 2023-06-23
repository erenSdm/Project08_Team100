@US13_UI @US13_IU_AC7
Feature: US13_UI_AC7_Is AdvisorTeacher

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

  Scenario: US13_AC7_TC20
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC7_TC20b
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem
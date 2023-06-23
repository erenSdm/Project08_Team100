@US13_UI @US13_IU_AC3
Feature: US13_UI_AC3_SurNameGirme

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

  Scenario: US13_AC3_TC04
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
    And Warning for <"surNameRequired">
    Then Quit Driver Gorkem


  Scenario: US13_AC3_TC05
    And Enter specific <"A"> to <"surname">
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
    And Warning for <"invalidSurNameWarning">
    Then Quit Driver Gorkem

  Scenario: US13_AC3_TC05B
    And Enter specific <"12345678901sadasdasdaasdasdadasd23456"> to <"surname">
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
    And Warning for <"invalidSurNameWarning">
    Then Quit Driver Gorkem
@US13_UI @US13_IU_AC2
Feature: US13_UI_AC2_NameGirme

  Background:
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"ViceDeanUserName"> UserName
    And Enter<"ViceDeanUserPassword"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    Then Click To <"teacherManagementMenu">
    And Choose a lesson

  Scenario: US13_AC2_TC02
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
    And Warning for <"nameRequired">
    Then Quit Driver Gorkem



  Scenario: US13_AC2_TC03

    And Enter specific <"A"> to <"name">
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
    And Warning for <"invalidNameWarning">
    Then Quit Driver Gorkem

  Scenario: US13_AC2_TC03B

    And Enter specific <"12345678901sadasdasdaasdasdadasd23456"> to <"name">
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
    And Warning for <"invalidNameWarning">
    Then Quit Driver Gorkem
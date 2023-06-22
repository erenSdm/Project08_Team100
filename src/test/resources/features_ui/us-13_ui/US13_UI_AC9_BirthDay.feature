@US13_UI @US13_IU_AC9
Feature: US13_UI_AC9_BirthdayGirisi

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

  Scenario: US13_AC9_TC22
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC9_TC23

    And Enter specific <"12062989"> to <"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem
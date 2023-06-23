@US13_UI @US13_IU_AC6
Feature: US13_UI_AC6_Is PhoneNumberGirisi

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


  Scenario: US13_AC6_TC18
    And Enter specific <""> to <"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem

  Scenario: US13_AC6_TC019
    And Enter specific <"123456789012"> to <"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    Then Quit Driver Gorkem
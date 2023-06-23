@US13_UI @US13_IU_AC5
Feature: US13_UI_AC5_EmailGirme

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

  Scenario: US13_AC5_TC08
    And Enter specific <""> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailRequired">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC09
    And Enter specific <"A"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"pleaseEnterValidEmailMessage">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC010
    And Enter specific <"A@"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC011
    And Enter specific <"A@1"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC012
    And Enter specific <"A@."> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"pleaseEnterValidEmailMessage">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC013
    And Enter specific <"A@.1"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC014
    And Enter specific <"A@.12"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC015
    And Enter specific <"12345"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC016
    And Enter specific <"123.5"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem

  Scenario: US13_AC5_TC017
    And Enter specific <"1@345"> to <"email">
    And Enter random<"phoneNumber">
    And Click To <"isAdvisorTeacher">
    And Click To <"Gender">
    And Enter random<"DateOfBirth">
    And Enter random<"SSN">
    And Enter random<"userName">
    And Enter random<"password">
    And Click To <"Submit">
    And Warning for <"emailShouldBe5_50">
    Then Quit Driver Gorkem





Feature: US13_UI_Vice_Dean_Registry_AC1
  Background:
Given go to <"managementonschoolUrl">
Then Click To <"login">
Then Enter<"ViceDeanUserName"> UserName
And Enter<"ViceDeanUserPassword"> PassWord
Then Click To <"LoginButtonInLoginMenu">
Then Click To <"menuButton">
Then Click To <"teacherManagementMenu">

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




  Scenario: US13_AC1_TC1

    And Enter random<"password">
Feature: US01_Vice Dean can create a lesson program

  Background: To Lesson management menü
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"ViceDeanUsernameAykut"> UserName
    And Enter<"ViceDeanPasswordAykut"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    Then Click To <"lessonManagementMenu">
    And Click_To_Lesson_Program

  Scenario: TC-01 ice Dean can choose lesson

    Then Choose a lesson as Vice Dean in Lesson Program
    And assert Java is selected
    And close Driver

  Scenario: TC-02 Vice Dean can choose education term
    Then Choose a education term as Vice Dean in Lesson Program
    And assert Education term is selected
    And close Driver


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

    Then Choose a lesson "Java" as Vice Dean in Lesson Program
    And assert "Java" is display
    And Close Driver
  Scenario: TC-02 Vice Dean can choose education term
    Then Choose a education term as Vice Dean in Lesson Program
    And assert Education term "SPRING_SEMESTER" is selected
    And Quit Driver

  Scenario: TC-03 TC-02 Vice Dean can choose day
    Then Choose a day as Vice Dean in Lesson Program
    And assert Day is selected
    And Quit Driver

  Scenario: TC-04  Vice Dean can choose start time
    Then Choose a start time "07:50" in Lesson Program
    And assert Start Time "07:50" is selected
    And Close Driver

  Scenario: TC-05 Vice Dean can choose stop time
    Then Choose a Stop Time "09:00" in Lesson Program
    And assert Stop Time "09:00" is selected
    And Close Driver


Feature: US-11 Vice dean can to see created Lesson Program

  Scenario: TC-01 Vice dean can to see created lesson,lesson day,start time, stop time
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"ViceDeanUsernameAykut"> UserName
    And Enter<"ViceDeanPasswordAykut"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    Then Click To <"lessonManagementMenu">
    And Click_To_Lesson_Program
    Then Choose a lesson as Vice Dean in Lesson Program
    Then Choose a education term as Vice Dean in Lesson Program
    Then Choose a day as Vice Dean in Lesson Program
    Then Choose a Start Time as Vice Dean in Lesson Program
    Then Choose a Stop Time as Vice Dean in Lesson Program
    And Click To Submit in Add Lesson Program
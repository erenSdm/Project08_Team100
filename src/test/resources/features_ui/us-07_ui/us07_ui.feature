Feature:
  Scenario: To Lesson contact all menü
    Given go to <"managementonschoolUrl">
    Then Click To <"login">
    Then Enter<"DeanUserName"> UserName
    And Enter<"DeanUserPassword"> PassWord
    Then Click To <"LoginButtonInLoginMenu">
    Then Click To <"menuButton">
    And Click To <"contactMenu">
    Then Dean can see contact message table
    Then Dean can see data of contact message
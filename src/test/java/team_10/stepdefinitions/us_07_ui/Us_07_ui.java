package team_10.stepdefinitions.us_07_ui;

import io.cucumber.java.en.Then;
import team_10.pages.Managementonschool_LessonPage;

import static org.junit.Assert.assertTrue;

public class Us_07_ui {
    Managementonschool_LessonPage managementonschoolLessonPage;
    @Then("Dean can see contact message table")
    public void dean_can_see_contact_message_table() {
    managementonschoolLessonPage=new Managementonschool_LessonPage();
    assertTrue(managementonschoolLessonPage.contactMessageText.isDisplayed());
    }

    @Then("Dean can see data of contact message")
    public void deanCanSeeDataOfContactMessage() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
       assertTrue( managementonschoolLessonPage.contactMessageTable.isDisplayed());
    }
}

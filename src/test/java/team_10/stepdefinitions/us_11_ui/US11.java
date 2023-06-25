package team_10.stepdefinitions.us_11_ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import team_10.pages.Managementonschool_LessonPage;
import team_10.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US11 {
    Managementonschool_LessonPage managementonschoolLessonPage;

    @Then("Lesson is Display")
    public void lesson_is_display() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.scroll(managementonschoolLessonPage.submitButtonAddLessonProgram);
        assertTrue(managementonschoolLessonPage.lessonText.isDisplayed());
    }
    @Then("Day is Display")
    public void day_is_display() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        assertTrue(managementonschoolLessonPage.dayText.isDisplayed());
    }
    @Then("Start Time is Display")
    public void start_time_is_display() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        assertTrue(managementonschoolLessonPage.startTimeText.isDisplayed());
    }


    @And("Stop Time is Display")
    public void stopTimeIsDisplay() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        assertTrue(managementonschoolLessonPage.stopTimeText.isDisplayed());
    }


    @Then("Vice Dean can not {string}")
    public void viceDeanCanNot(String arg0) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.scroll(managementonschoolLessonPage.submitButtonAddLessonProgram);
        ReusableMethods.bekle(2);
        ReusableMethods.tumSayfaResmi();
    }
}

package team_10.stepdefinitions.us_10_ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import team_10.pages.Managementonschool_LessonPage;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US10 {
    Managementonschool_LessonPage managementonschoolLessonPage;



    @Then("{int}_second_WaitWithThreadSleep")
    public void secondWaitWithThreadSleep(Integer int1) {
        ReusableMethods.bekle(3);    }

    @Then("Click_To_Lesson_Program")
    public void clickToLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.lessonProgram.click();
        ReusableMethods.bekle(1);
    }
    @Then("Choose a education term as Vice Dean in Lesson Program")
    public void chooseAEducationTermAsViceDeanInLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseEducationTermInLessonProgramasViceDean.click();
        managementonschoolLessonPage.chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean.click();
    }


    @And("assert Education term {string} is selected")
    public void assertEducationTermIsSelected(String semester) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean.getText();
        assertEquals(semester,actualData);
    }

    @And("close Driver")
    public void closeDriver() {
        Driver.closeDriver();
    }

    @And("Quit Driver")
    public void quitDriver() {
        Driver.quitDriver();
    }

    @Then("Choose a day as Vice Dean in Lesson Program")
    public void chooseADayAsViceDeanInLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseDayInLessonProgramasViceDean.click();
        managementonschoolLessonPage.chooseMondayInLessonProgramasViceDean.click();
    }

    public static String expectedDay ="MONDAY";

    @And("assert Day is selected")
    public void assertDayIsSelected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseMondayInLessonProgramasViceDean.getText();
        assertEquals(expectedDay,actualData);
    }

    @And("Close Driver")
    public void closeDrive() {
        Driver.closeDriver();
    }

    @Then("Choose a start time {string} in Lesson Program")
    public void chooseAAsInLessonProgram(String startTime) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseStartTimeInLessonProgramasViceDean.sendKeys(startTime);
    }
    public static String expectedDataStartTime="07:50";

    @Then("assert Start Time {string} is selected")
    public void assert_start_time_is_selected(String startTime) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseStartTimeInLessonProgramasViceDean.getAttribute("value");
         assertEquals(startTime,actualData);
    }

    public static String expectedDataStopTime="10:00";
    @Then("Choose a Stop Time {string} in Lesson Program")
    public void choose_a_stop_time_as_vice_dean_in_lesson_program(String stopTime) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseStopTimeInLessonProgramasViceDean.sendKeys(stopTime);
        ReusableMethods.bekle(2);

    }
    @Then("assert Stop Time {string} is selected")
    public void assert_stop_time_is_selected(String stopTime) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseStopTimeInLessonProgramasViceDean.getAttribute("value");
        assertEquals(stopTime,actualData);
    }


    @Then("Choose a lesson {string} as Vice Dean in Lesson Program")
    public void chooseAsViceDeanInLessonProgram(String lesson) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseLessonsInLessonProgramasViceDean.sendKeys(lesson, Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @And("assert {string} is display")
    public void assertIsDisplay(String lesson) {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        assertEquals(lesson,managementonschoolLessonPage.sendedLesson.getText());
    }

    @Then("Click_To_Lesson_Programs")
    public void clickToLessonPrograms() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.bekle(2);
        managementonschoolLessonPage.lessonProgram.click();
        ReusableMethods.bekle(1);
    }




}

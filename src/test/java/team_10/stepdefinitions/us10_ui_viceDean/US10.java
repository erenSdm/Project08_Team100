package team_10.stepdefinitions.us10_ui_viceDean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import team_10.pages.Managementonschool_LessonPage;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US10 {
    Managementonschool_LessonPage managementonschoolLessonPage;



    @Then("{int}_second_WaitWithThreadSleep")
    public void secondWaitWithThreadSleep(Integer int1) {
        ReusableMethods.bekle(3);    }

    @Then("Click_To_Lesson_Program")
    public void clickToLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.lessonProgram.click();    }

    public static String expectedLesson="Java";
    @Then("Choose a lesson as Vice Dean in Lesson Program")
    public void chooseALessonAsViceDeanInLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseLessonsInLessonProgramasViceDean.sendKeys(expectedLesson, Keys.ENTER);
    }

    @And("assert Java is selected")
    public void javaIsSelected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseLessonsInLessonProgramasViceDean.isSelected();
    }

    @Then("Choose a education term as Vice Dean in Lesson Program")
    public void chooseAEducationTermAsViceDeanInLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseEducationTermInLessonProgramasViceDean.click();
        managementonschoolLessonPage.chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean.click();
    }

    public static String expectedSemester="SPRING_SEMESTER";
    @And("assert Education term is selected")
    public void assertEducationTermIsSelected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean.getText();
        assertEquals(expectedSemester,actualData);
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
    public static String expectedDataStartTime="07:50";
    @Then("Choose a Start Time as Vice Dean in Lesson Program")
    public void choose_a_start_time_as_vice_dean_in_lesson_program() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseStartTimeInLessonProgramasViceDean.sendKeys(expectedDataStartTime);

    }
    @Then("assert Start Time is selected")
    public void assert_start_time_is_selected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseStartTimeInLessonProgramasViceDean.getAttribute("value");
         assertEquals(expectedDataStartTime,actualData);
    }

    public static String expectedDataStopTime="10:00";
    @Then("Choose a Stop Time as Vice Dean in Lesson Program")
    public void choose_a_stop_time_as_vice_dean_in_lesson_program() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseStopTimeInLessonProgramasViceDean.sendKeys(expectedDataStopTime);

    }
    @Then("assert Stop Time is selected")
    public void assert_stop_time_is_selected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseStopTimeInLessonProgramasViceDean.getAttribute("value");
        assertEquals(expectedDataStopTime,actualData);
    }



}

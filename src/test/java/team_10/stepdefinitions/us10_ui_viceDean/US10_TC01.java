package team_10.stepdefinitions.us10_ui_viceDean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import team_10.pages.Managementonschool_HomePage;
import team_10.pages.Managementonschool_LessonPage;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US10_TC01 {
    Managementonschool_LessonPage managementonschoolLessonPage;



    @Then("{int}_second_WaitWithThreadSleep")
    public void secondWaitWithThreadSleep(Integer int1) {
        ReusableMethods.bekle(3);    }

    @Then("Click_To_Lesson_Program")
    public void clickToLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.lessonProgram.click();    }

    @Then("Choose a lesson as Vice Dean in Lesson Program")
    public void chooseALessonAsViceDeanInLessonProgram() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        managementonschoolLessonPage.chooseLessonsInLessonProgramasViceDean.sendKeys("Java", Keys.ENTER);
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


    @And("assert Education term is selected")
    public void assertEducationTermIsSelected() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        String actualData=managementonschoolLessonPage.chooseSPRING_SEMESTERInEducationTermInLessonProgramasViceDean.getText();
        String expectedData="SPRING_SEMESTER";
        assertEquals(expectedData,actualData);
    }

    @And("close Driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}

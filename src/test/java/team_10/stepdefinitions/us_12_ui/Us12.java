package team_10.stepdefinitions.us_12_ui;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import team_10.pages.Managementonschool_LessonPage;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

public class Us12 {
    Managementonschool_LessonPage managementonschoolLessonPage;
    @Then("submit in add lesson program")
    public void submit_in_add_lesson_program() {
       managementonschoolLessonPage=new Managementonschool_LessonPage();
       managementonschoolLessonPage.submitButtonAddLessonProgram.click();

    }

    @Then("Vice Dean select a lesson")
    public void viceDeanSelectALesson() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.visibleWait(managementonschoolLessonPage.selectALessonInLessonProgramAssign,30);
        ReusableMethods.scroll( managementonschoolLessonPage.selectALessonInLessonProgramAssign);
        ReusableMethods.bekle(5);
        managementonschoolLessonPage.selectALessonInLessonProgramAssign.click();

    }

    @Then("Vice Dean asign a teacher")
    public void viceDeanAsignATeacher() {
        managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.scroll(managementonschoolLessonPage.chooseTeacherDDM);
        managementonschoolLessonPage.chooseTeacherDDM.click();
        managementonschoolLessonPage.chooseTeacherMuratInLessonProgramasViceDean.click();


    }
}

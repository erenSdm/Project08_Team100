package team_10.stepdefinitions.us11_ui;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import team_10.pages.Managementonschool_LessonPage;
import team_10.stepdefinitions.us10_ui_viceDean.US10;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US11_ui {

    Managementonschool_LessonPage managementonschoolLessonPage;

    @And("Click To Submit in Add Lesson Program")
    public void clickToSubmitInAddLessonProgram() {
     managementonschoolLessonPage=new Managementonschool_LessonPage();
        ReusableMethods.scroll(managementonschoolLessonPage.submitButtonAddLessonProgram);
     managementonschoolLessonPage.submitButtonAddLessonProgram.click();

        ReusableMethods.scroll(managementonschoolLessonPage.tableInLessonProgram);
        List<WebElement> elements=Driver.getDriver().findElements(By.cssSelector("#controlled-tab-example-tabpane-lessonProgram > div:nth-child(2) > div:nth-child(2) > div > div > table > tbody > tr"));

        List<String> elementsString=new ArrayList<>();
        for (int i = 0; i <elements.size() ; i++) {
            System.out.println(elements.get(i).getText()+"");
            elementsString.add(elements.get(i).getText());
        }

      assertTrue(elementsString.contains(US10.expectedLesson+" "+US10.expectedDay+" "+US10.expectedDataStartTime+" "+US10.expectedDataStopTime));

    }



}

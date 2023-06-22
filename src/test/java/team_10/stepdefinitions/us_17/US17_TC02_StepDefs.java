package team_10.stepdefinitions.us_17;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import team_10.pages.KubraLocatler;
import team_10.utilities.ConfigReader;

import static org.junit.Assert.assertTrue;

public class US17_TC02_StepDefs {

   KubraLocatler kubraLocatler;
   @Given("advisor teacher olarak giris yapilir_k")
   public void advisor_teacher_olarak_giris_yapilir_k() throws InterruptedException {
      kubraLocatler= new KubraLocatler();
      Thread.sleep(2000);
      kubraLocatler.loginGiris.click();
      kubraLocatler.userName.sendKeys(ConfigReader.getProperty("teacherUsernameK"),Keys.TAB);
      Thread.sleep(2000);
      kubraLocatler.password.sendKeys(ConfigReader.getProperty("passwordTeacherK"));
      kubraLocatler.loginteach.click();
      Thread.sleep(2000);
      kubraLocatler = new KubraLocatler();
      assertTrue(kubraLocatler.hiTeacher.isDisplayed());

   }
   @Given("su bilgiler girilir: {string}, {string}, {string}, {string},")
   public void su_bilgiler_girilir(String absentee, String midtermexam, String finalexam, String infonote) {

      kubraLocatler = new KubraLocatler();
      kubraLocatler.absentee.click();
      kubraLocatler.absentee.sendKeys("10", Keys.TAB, "45", Keys.TAB, "60", Keys.TAB, "Basari");

   }
   @Given("submit tusuna basilir_k")
   public void submit_tusuna_basilir_k() {
      kubraLocatler =new KubraLocatler();
      kubraLocatler.submit.click();

   }
   @Given("student info listte girilen bilgiler gorunur_k")
   public void student_info_listte_girilen_bilgiler_gorunur_k() {

   }




}

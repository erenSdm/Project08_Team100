package team_10.stepdefinitions.us_17;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team_10.pages.KubraLocatler;
import team_10.utilities.ConfigReader;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import javax.swing.*;

import static org.junit.Assert.assertTrue;

public class US17_TC03_StepDefs {

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
      kubraLocatler.absentee.sendKeys(absentee,Keys.TAB, midtermexam, Keys.TAB, finalexam, Keys.TAB, infonote, Keys.TAB);

   }
   @Given("submit tusuna basilir_k")
   public void submit_tusuna_basilir_k() {
      kubraLocatler =new KubraLocatler();
      kubraLocatler.submit.click();

   }
   @Given("student info listte girilen bilgiler gorunur_k")
   public void student_info_listte_girilen_bilgiler_gorunur_k() {

   }


   @And("Hata mesaji gorulur ve ekran resmi alinir")
   public void hataMesajiGorulurVeEkranResmiAlinir() {

      ReusableMethods.tumSayfaResmi("Hata mesaji teacher ");
   }

   @Then("Logout yapilir")
   public void logout_yapilir() {
      kubraLocatler = new KubraLocatler();

      kubraLocatler.menu.click();
      ReusableMethods.bekle(2000);
      kubraLocatler.logout.click();
      ReusableMethods.bekle(4000);
      Driver.getDriver().quit();

   }


    @Then("name in girilmis oldugu gorulur_k")
    public void nameInGirilmisOlduguGorulur_k() {
      kubraLocatler = new KubraLocatler();

      assertTrue(kubraLocatler.nameIsdisp.isDisplayed());
    }

   @Then("lesson un girilmis oldugu gorulur_k")
   public void lessonUnGirilmisOlduguGorulur_k() {
      kubraLocatler = new KubraLocatler();
      assertTrue(kubraLocatler.lessonIsdisp.isDisplayed());
   }

   @Then("absentee nin girilmis oldugu gorulur_k")
   public void absenteeNinGirilmisOlduguGorulur_k() {
      kubraLocatler= new KubraLocatler();
      assertTrue(kubraLocatler.absenteeIsdisp.isDisplayed());

   }

   @Then("midtermexam in girilmis oldugu gorulur_k")
   public void midtermexamInGirilmisOlduguGorulur_k() {

      kubraLocatler= new KubraLocatler();
      assertTrue(kubraLocatler.midterexamIsdisp.isDisplayed());
   }

   @Then("finalexam in girilmis oldugu gorulur_k")
   public void finalexamInGirilmisOlduguGorulur_k() {

      kubraLocatler =new KubraLocatler();
      assertTrue(kubraLocatler.finalexamIsdisp.isDisplayed());


   }

   @Then("note nin girilmis oldugu gorulur_k")
   public void noteNinGirilmisOlduguGorulur_k() {

      kubraLocatler =new KubraLocatler();
      assertTrue(kubraLocatler.noteIsdisp.isDisplayed());


   }

   @Then("average in girilmis oldugu gorulur_k")
   public void averageInGirilmisOlduguGorulur_k() {

      kubraLocatler =new KubraLocatler();
      assertTrue(kubraLocatler.averageIsdisp.isDisplayed());


   }

   @Then("infonote nin girilmis oldugu gorulur_k")
   public void infonoteNinGirilmisOlduguGorulur_k() {

      kubraLocatler =new KubraLocatler();
      assertTrue(kubraLocatler.infonoteIsdisp.isDisplayed());


   }

    @Given("student Info Management sayfasina gidilir_k")
    public void studentInfoManagementSayfasinaGidilir_k() {

      kubraLocatler = new KubraLocatler();
      Driver.getDriver().get(ConfigReader.getProperty("SInfoMangSayfa"));
    }

   @And("edit butonuna basilir")
   public void editButonunaBasilir() throws InterruptedException {

      kubraLocatler =new KubraLocatler();
      Actions actions = new Actions(Driver.getDriver());
      actions.sendKeys(Keys.PAGE_DOWN);
      Thread.sleep(2000);

      WebElement submit = Driver.getDriver().findElement(By.xpath("(//button[@class='text-dark btn btn-outline-info'])[5]"));

      try {
         submit.click();
      } catch (Exception e) {
         JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
         js.executeScript("arguments[0].click()", submit);
      }
     // kubraLocatler.edit.click();
   }

   @And("edit student info sayfasinin acilmasi beklenir")
   public void editStudentInfoSayfasininAcilmasiBeklenir() {
      
      kubraLocatler = new KubraLocatler();
      assertTrue(kubraLocatler.editStudentInfopage.isDisplayed());
   }


   @And("acilan sayfada ders {string} ile degistirilir")
   public void acilanSayfadaDersIleDegistirilir(String ders) throws InterruptedException {

      kubraLocatler = new KubraLocatler();
      WebElement lesson = Driver.getDriver().findElement(By.xpath("(//select[@class='form-select'])[1]"));

      Thread.sleep(2000);

      Select select = new Select(lesson);
      select.selectByVisibleText(ders);
   }
}

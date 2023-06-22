package team_10.stepdefinitions.us_17;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team_10.pages.KubraLocatler;
import team_10.pages.Managementonschool_HomePage;
import team_10.utilities.ConfigReader;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import javax.swing.*;
import java.security.Key;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;
import static team_10.utilities.ReusableMethods.webelementJavaScript;

public class US17_TC01_StepDefs {

    KubraLocatler kubraLocatler;



    @Given("Anasyafaya_gidilir_k")
    public void anasyafaya_gidilir_k() {
        kubraLocatler = new KubraLocatler();
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolUrl"));


    }

    @Given("register_tusuna_basilir_k")
    public void register_tusuna_basilir() {
        kubraLocatler = new KubraLocatler();
        WebElement submit = Driver.getDriver().findElement(By.cssSelector("[href='/register']"));

        try {
            submit.click();
        } catch (Exception e) {
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", submit);
        }


    }

    @Given("bu_bilgiler_girilir: {string}, {string}, {string}, {string}, {string}, {string},{string},{string}, {string}")
    public void bu_bilgiler_girilir(String name, String surname, String birtPlace, String phone, String gender, String dateOfbirth,

                                    String ssn, String username, String password) throws SQLException {


        kubraLocatler.name.click();
        kubraLocatler.name.sendKeys(name, Keys.TAB, surname, Keys.TAB, birtPlace, Keys.TAB,
                phone, Keys.TAB, gender);

        kubraLocatler.genderFemale.click();
        kubraLocatler.name.sendKeys( Keys.TAB, dateOfbirth, Keys.TAB, ssn, Keys.TAB, username, Keys.TAB, password);
    }


    @And("iki saniye beklenir_k")
    public void ikiSaniyeBeklenir() throws InterruptedException {
        kubraLocatler = new KubraLocatler();
        Thread.sleep(2000);
    }


    //////////////////////////////////

    @And("login butonuna basilir_k")
    public void loginButonunaBasilir_k() {

        kubraLocatler = new KubraLocatler();
     kubraLocatler.loginGiris.click();

    }


    @Then("{string} yazisi gorunur")
    public void yazisi_gorunur(String string) {
        kubraLocatler = new KubraLocatler();
        String hiYazisi = Driver.getDriver().findElement(By.xpath("//span[@class='text-white']")).getText();
        assertTrue(kubraLocatler.hiYazisi.isDisplayed());
        assertEquals("derya", hiYazisi);

    }



    /////////
    @And("logine basilir")
    public void logineBasilir() throws InterruptedException {

        kubraLocatler= new KubraLocatler();
        WebElement submit = Driver.getDriver().findElement(By.xpath("(//button[@type='button'])[3]"));

        try {
            submit.click();
        } catch (Exception e) {
            JavascriptExecutor js =(JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click()", submit);
        }

        /*

        Thread.sleep(2000);
        kubraLocatler.loginGiris.click();

         */
    }

    @And("username ve password girilir_k")
    public void usernameVePasswordGirilir_k() throws InterruptedException {
        kubraLocatler= new KubraLocatler();
        kubraLocatler.userName.sendKeys(ConfigReader.getProperty("teacherUsernameK"),Keys.TAB);
        Thread.sleep(2000);
        kubraLocatler.password.sendKeys(ConfigReader.getProperty("passwordTeacherK"));

    }


    @Then("menu tiklanir_k")
    public void menu_tiklanir_k() {
        kubraLocatler = new KubraLocatler();
        kubraLocatler.ogertmenMenu.click();
    }

    @Then("student Info Management bolumune girilir_k")
    public void student_ınfo_management_bolumune_girilir() {
        kubraLocatler = new KubraLocatler();
        kubraLocatler.studentManagInfo.click();
        kubraLocatler.studentManagInfo.click();
    }

    @And("register butonuna basilir_k")
    public void registerButonunaBasilir_k() {

        kubraLocatler = new KubraLocatler();

        kubraLocatler.registerK.click();
    }


    @And("add student Info bolumunde {string} dersi secilir_k")
    public void addStudentInfoBolumundeDersiSecilir_k(String ders) {

        kubraLocatler = new KubraLocatler();
        WebElement lesson = Driver.getDriver().findElement(By.xpath("(//select[@class='form-select'])[1]"));

        Select select = new Select(lesson);
        select.selectByVisibleText(ders);


    }

    @And("add student Info bolumunde {string} ogrencisi secilir_k")
    public void addStudentInfoBolumundeOgrencisiSecilir_k(String student) {
        kubraLocatler = new KubraLocatler();
        WebElement ogrenci = Driver.getDriver().findElement(By.xpath("//select[@id='studentId']"));

        Select select = new Select(ogrenci);
        select.selectByVisibleText(student);
    }


    @And("add student Info bolumunde {string} secilir_k")
    public void addStudentInfoBolumundeSecilir_k(String donem) {
        kubraLocatler = new KubraLocatler();
        WebElement term= Driver.getDriver().findElement(By.xpath("//*[@id='educationTermId']"));


        Select select = new Select(term);
        select.selectByIndex(1);

    }



}

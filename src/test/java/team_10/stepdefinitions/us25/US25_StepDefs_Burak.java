package team_10.stepdefinitions.us25;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import team_10.pages.US25Pages.AdminPage_Burak;
import team_10.pages.US25Pages.Login;
import team_10.utilities.Driver;
import team_10.utilities.ConfigReader;

import team_10.utilities.ReusableMethods;

public class US25_StepDefs_Burak extends Login {


    AdminPage_Burak admin = new AdminPage_Burak();
    Login log = new Login();

    @Given("Kullanıcı _{string} sayfasina gider")
    public void kullanıcı_sayfasina_gider(String url) {
        Driver.getDriver().get(url);
    }

    @When("Kullanıcı LOG IN e tıklar")
    public void kullanıcı_log_ın_e_tıklar() {
        login.click();
    }

    @When("Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_vice_dean_olarak_user_name_ve_password_u_girer() {
        admin.username.sendKeys(ConfigReader.getProperty("username"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.click(accountlogin);
    }

    @When("Kullanıcı menuden student management e tıklar")
    public void kullanıcı_menuden_student_management_e_tıklar() {
        ReusableMethods.click(log.menu);
        ReusableMethods.bekle(1);
        ReusableMethods.click(log.studentmanagement);
    }

    @Then("Kullanıcı istediği danışman öğretmeni seçer")
    public void kullanıcı_istediği_danışman_öğretmeni_seçer() {
        ReusableMethods.click(log.teacherselectddm);
        Select select = new Select(log.teacherselectddm);
        select.selectByIndex(1);
    }


    @And("And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void andKullanıcıNAMEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.surname.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı name in altında Required yazısını görür.")
    public void kullanıcıNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.nameRequired.isDisplayed());
    }

    @And("Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıSurNAMEIBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı surname in altında Required yazısını görür.")
    public void kullanıcıSurnameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.surnameRequired.isDisplayed());
    }

    @And("Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıBIRTHPLACEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Birth Place in altında Required yazısını görür.")
    public void kullanıcıBirthPlaceInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.birthplaceRequired.isDisplayed());
    }

    @And("Kullanıcı E-mail İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıEMailİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı E-mail in altında Required yazısını görür.")
    public void kullanıcıEMailInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.emailRequired.isDisplayed());
    }

    @And("Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıTelefonNumarasıİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Telefon numarası in altında Required yazısını görür.")
    public void kullanıcıTelefonNumarasıInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.phoneRequired.isDisplayed());
    }

    @And("Kullanıcı cinsiyet İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıCinsiyetİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.submit.click();
    }

    @Then("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE uyarısını görür")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEUyarısınıGörür() {
        //String expected="You have entered an invalid value. Valid values are: MALE, FEMALE";
        //String actual=vice.genderalert.getText();
        Assert.assertTrue(admin.genderAlert.isDisplayed());
    }

    @And("Kullanıcı Date Of Birth İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıDateOfBirthİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Date Of Birth in altında Required yazısını görür.")
    public void kullanıcıDateOfBirthInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.dobRequired.isDisplayed());
    }

    @And("Kullanıcı User Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıUserNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı User Name in altında Required yazısını görür.")
    public void kullanıcıUserNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.usernameRequired.isDisplayed());
    }

    @And("Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar")
    public void kullanıcıFatherNameİBoşBırakıpNAMESurnameBirthPlaceEmailDateOfBirthSsnUserNameCinsiyetMotherNameGeçerliPasswordTelefonNumarasıGirdiktenSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Father Name in altında Required yazısını görür.")
    public void kullanıcıFatherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(admin.fathernameRequired.isDisplayed());
    }

    @And("Kullanıcı Mother Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıMotherNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Mother Name in altında Required yazısını görür.")
    public void kullanıcıMotherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(vice.mothernamerequired.isDisplayed());
    }


    @Then("Kullanıcı Please enter valid SSN number uyarsını görür.")
    public void kullanıcıPleaseEnterValidSSNNumberUyarsınıGörür() {

    }


    @And("Sayfa kapatiliir")
    public void sayfaKapatiliir() {
        ReusableMethods.bekle(1);
        Driver.closeDriver();
    }

    @And("Kullanıcı SSN BÖLÜMÜNE; {string} ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar")
    public void kullanıcıSSNBÖLÜMÜNEVeDokuzRakamdanOluşanNumarayıDiğerBölümlerGirdiktenSonraSubmitETıklar(String ihtimal) {
        admin.ssn.sendKeys(ihtimal);
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();

    }

    @And("Kullanıcı tüm bölümleri girdikten sonra submit e tıklar")
    public void kullanıcıTümBölümleriGirdiktenSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("erelpassword"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı STUDENT LIST bölümünde student number ı görür.")
    public void kullanıcıSTUDENTLISTBölümündeStudentNumberIGörür() {

    }


    @And("Kullanıcı password kısmına {string} İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıPasswordKısmınaİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar(String Pass) {
        admin.smpassword.sendKeys(Pass);
        admin.name.sendKeys(ConfigReader.getProperty("erelname"));
        admin.surname.sendKeys(ConfigReader.getProperty("erelsurname"));
        admin.email.sendKeys(ConfigReader.getProperty("erelemail"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("ereldateofbirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("erelssn"));
        admin.username.sendKeys(ConfigReader.getProperty("erelusername"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("erelfathername"));
        admin.motherName.sendKeys(ConfigReader.getProperty("erelmothername"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("erelbirthplace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("erelphone"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı passwordun altında Minimum sekiz character uyarısını görür")
    public void kullanıcıPasswordunAltındaMinimumSekizCharacterUyarısınıGörür() {
        // String expected="Minimum 8 character";
        String actual = vice.passwordalerT.getText();
        Assert.assertTrue(actual.contains("Minimum 8 character"));

    }


}
package team_10.stepdefinitions.us25;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import team_10.pages.US25Pages.AdminPage_Burak;
import team_10.pages.US25Pages.Login;
import team_10.utilities.ConfigReader;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

import static team_10.utilities.ReusableMethods.bekle;


public class US25_StepDefs_Burak {


    Login log = new Login();
    AdminPage_Burak admin = new AdminPage_Burak();
    pages.US25_AdminStudent adminStudent = new pages.US25_AdminStudent();

    @Given("Kullanıcı _{string} sayfasina gider")
    public void kullanıcı_sayfasina_gider(String url) {
        Driver.getDriver().get(url);
    }

    @When("Kullanıcı LOG IN e tıklar")
    public void kullanıcı_log_ın_e_tıklar() {
        log.login.click();
    }

    @When("Kullanıcı geçerli ADMİN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_admin_olarak_user_name_ve_password_u_girer() {
        log.username.sendKeys(ConfigReader.getProperty("AdminUserName"));
        log.password.sendKeys(ConfigReader.getProperty("AdminPassword"));
        ReusableMethods.click(log.accountlogin);
    }

    @When("Kullanıcı menuden student management e tıklar")
    public void kullanıcı_menuden_student_management_e_tıklar() {
        ReusableMethods.click(log.menu);
        bekle(1);
        ReusableMethods.click(log.studentmanagement);
    }

    @Then("Kullanıcı istediği danışman öğretmeni seçer")
    public void kullanıcı_istediği_danışman_öğretmeni_seçer() {
        ReusableMethods.click(admin.teacherSelectddm);
        Select select = new Select(admin.teacherSelectddm);
        select.selectByIndex(1);
    }


    @And("And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void andKullanıcıNAMEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakBirthPlace"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı name in altında Required yazısını görür.")
    public void kullanıcıNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.namerequired.isDisplayed());
    }

    @And("Kullanıcı SurNAME i boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıSurNAMEIBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı surname in altında Required yazısını görür.")
    public void kullanıcıSurnameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.surnamerequired.isDisplayed());
    }

    @And("Kullanıcı BIRTH PLACE İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıBIRTHPLACEİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Birth Place in altında Required yazısını görür.")
    public void kullanıcıBirthPlaceInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.birthplacerequired.isDisplayed());
    }

    @And("Kullanıcı E-mail İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıEMailİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı E-mail in altında Required yazısını görür.")
    public void kullanıcıEMailInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.emailrequired.isDisplayed());
    }

    @And("Kullanıcı Telefon numarası İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıTelefonNumarasıİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Telefon numarası in altında Required yazısını görür.")
    public void kullanıcıTelefonNumarasıInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.phonerequired.isDisplayed());
    }

    @And("Kullanıcı cinsiyet İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıCinsiyetİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı You have entered an invalid value. Valid values are: MALE, FEMALE uyarısını görür")
    public void kullanıcıYouHaveEnteredAnInvalidValueValidValuesAreMALEFEMALEUyarısınıGörür() {
        //String expected="You have entered an invalid value. Valid values are: MALE, FEMALE";
        //String actual=vice.genderalert.getText();
        Assert.assertTrue(adminStudent.genderalert.isDisplayed());
    }

    @And("Kullanıcı Date Of Birth İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıDateOfBirthİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Date Of Birth in altında Required yazısını görür.")
    public void kullanıcıDateOfBirthInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.dobrequired.isDisplayed());
    }

    @And("Kullanıcı User Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıUserNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı User Name in altında Required yazısını görür.")
    public void kullanıcıUserNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.usernamerequired.isDisplayed());
    }

    @And("Kullanıcı father name İ boş bırakıp NAME,surname,Birth Place,email,Date Of Birth,Ssn,User name,cinsiyet,mother name,geçerli password,Telefon numarası girdikten sonra submit e tıklar")
    public void kullanıcıFatherNameİBoşBırakıpNAMESurnameBirthPlaceEmailDateOfBirthSsnUserNameCinsiyetMotherNameGeçerliPasswordTelefonNumarasıGirdiktenSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Father Name in altında Required yazısını görür.")
    public void kullanıcıFatherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.fathernamerequired.isDisplayed());
    }

    @And("Kullanıcı Mother Name İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar")
    public void kullanıcıMotherNameİBoşBırakıpDiğerAlanlarDoldurulupSonraSubmitETıklar() {
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
        admin.female.click();
        admin.submit.click();
    }

    @Then("Kullanıcı Mother Name in altında Required yazısını görür.")
    public void kullanıcıMotherNameInAltındaRequiredYazısınıGörür() {
        Assert.assertTrue(adminStudent.mothernamerequired.isDisplayed());
    }


    @Then("Kullanıcı Please enter valid SSN number uyarsını görür.")
    public void kullanıcıPleaseEnterValidSSNNumberUyarsınıGörür() {

    }


    @And("Sayfa kapatiliir")
    public void sayfaKapatiliir() {
        bekle(1);
        Driver.closeDriver();
    }

    @And("Kullanıcı SSN BÖLÜMÜNE; {string} ve dokuz rakamdan oluşan numarayı,diğer bölümler girdikten sonra submit e tıklar")
    public void kullanıcıSSNBÖLÜMÜNEVeDokuzRakamdanOluşanNumarayıDiğerBölümlerGirdiktenSonraSubmitETıklar(String ihtimal) {
        admin.ssn.sendKeys(ihtimal);
        admin.name.sendKeys(ConfigReader.getProperty("burakName"));
        admin.birthPlace.sendKeys(ConfigReader.getProperty("burakSurname"));
        admin.phoneNumber.sendKeys(ConfigReader.getProperty("burakPhone"));
        admin.birthDay.sendKeys(ConfigReader.getProperty("burakDateOfBirth"));
        admin.ssn.sendKeys(ConfigReader.getProperty("burakSsn"));
        admin.username.sendKeys(ConfigReader.getProperty("burakUserName"));
        admin.fatherName.sendKeys(ConfigReader.getProperty("burakFatherName"));
        admin.motherName.sendKeys(ConfigReader.getProperty("burakMotherName"));
        admin.smpassword.sendKeys(ConfigReader.getProperty("burakPassword"));
        admin.email.sendKeys(ConfigReader.getProperty("burakEmail"));
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
        String actual = adminStudent.passwordalerT.getText();
        Assert.assertTrue(actual.contains("Minimum 8 character"));
    }

    @Then("Kullanici danismani secer")
    public void kullaniciDanismaniSecer() {
        ReusableMethods.click(admin.teacherSelectddm);
        bekle(2);
        Select select = new Select(admin.teacherSelectddm);
        select.selectByIndex(3);
    }
}


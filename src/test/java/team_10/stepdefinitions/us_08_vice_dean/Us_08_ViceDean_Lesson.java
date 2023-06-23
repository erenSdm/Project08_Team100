package team_10.stepdefinitions.us_08_vice_dean;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import team_10.pages.ViceDean_Lesson;
import team_10.utilities.ConfigReader;
import team_10.utilities.Driver;
import team_10.utilities.ReusableMethods;

public class Us_08_ViceDean_Lesson {
     ViceDean_Lesson viceDean_lesson;


    @Given("kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolUrl"));
    }
    @Given("kullanici login butonunu tıklar")
    public void kullanici_login_butonunu_tıklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.homepageLogin.click();

    }
    @And("kullanici username {string} girer")
    public void kullaniciUsernameGirer(String username) {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.userName.sendKeys(username,Keys.TAB);
    }
    @And("kullanıcı {int} saniye bekler")
    public void kullanıcıSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);


    }

    @And("kullanici password {string} girer")
    public void kullaniciPasswordGirer(String password) {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.password.sendKeys(password);
    }
    @And("kullanici loginMenu butonunu tıklar")
    public void kullaniciLoginMenuButonunuTıklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.loginMenuLoginButon.click();
    }
    @Given("kullanici lesson basligini tiklar")
    public void kullanici_lesson_basligini_tiklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.lessonMenuButton.click();

    }
    @Then("kullanici LessonName bilgisini girer")
    public void kullaniciLessonNameBilgisiniGirer() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.lessonNameBox.sendKeys("STLC19",Keys.ENTER);
    }


    @Then("Compulsory secenegini isaretler")
    public void compulsorySeceneginiIsaretler() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.checkbox.click();
    }

    @And("Credit Score {int} bilgisini girer")
    public void creditScoreBilgisiniGirer(int creditScore) {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.creditScoreBox.sendKeys("5");
    }
    @And("kullanici submit butonu tıklar")
    public void kullaniciSubmitButonuTıklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.submitButton.click();
    }

    @Then("Lesson List de eklenen dersi görür")
    public void lessonListDeEklenenDersiGörür() {
    }


    @Then("Lesson Created Alert ini gorur")
    public void lessonCreatedAlertIniGorur() {
        viceDean_lesson=new ViceDean_Lesson();
        assert viceDean_lesson.lessonCeratedAlert.isDisplayed();

    }

    @And("ekran goruntusunu alir")
    public void ekranGoruntusunuAlir() {
        ReusableMethods.tumSayfaResmi();

    }

    @And("kullanici sayfayı kapatir")
    public void kullaniciSayfayıKapatir() {
        Driver.getDriver().close();
    }


    @And("kullanici menuButtonu clickler")
    public void kullaniciMenuButtonuClickler() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.menuButton.click();
    }

    @And("kullanici logout secenegini tıklar")
    public void kullaniciLogoutSeceneginiTıklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.logout.click();
    }


    @And("kullanici YES secenegini tıklar")
    public void kullaniciYESSeceneginiTıklar() {
        viceDean_lesson=new ViceDean_Lesson();
        viceDean_lesson.yes.click();
    }
}

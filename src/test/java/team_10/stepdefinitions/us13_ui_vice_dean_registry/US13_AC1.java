package team_10.stepdefinitions.us13_ui_vice_dean_registry;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import team_10.pages.Managementonschool_HomePage;
import team_10.utilities.ConfigReader;
import team_10.utilities.Driver;
import team_10.utilities.FakeProfile;
import team_10.utilities.ReusableMethods;

public class US13_AC1 {
    Managementonschool_HomePage managementonschoolHomePage;
    FakeProfile fakeProfile;

    @Given("go to <{string}>")
    public void go_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Click To <{string}>")
    public void click_to(String string) {
        managementonschoolHomePage = new Managementonschool_HomePage();
        switch (string) {
            case "RegisterButtonInMain":
                managementonschoolHomePage.mainMenuRegister.click();
                break;
            case "login":
                managementonschoolHomePage.mainMenuLogin.click();
                break;
            case "LoginButtonInLoginMenu":
                managementonschoolHomePage.loginMenuLoginButon.click();
                break;
            case "menuButton":
                managementonschoolHomePage.menuButton.click();
                break;
            case "adminManagementMenu":
                managementonschoolHomePage.adminManagement.click();
                break;
            case "deanManagementMenu":
                managementonschoolHomePage.deanManagement.click();
                break;
            case "viceDeanManagementMenu":
                managementonschoolHomePage.viceDeanMangement.click();
                break;
            case "lessonManagementMenu":
                managementonschoolHomePage.lessonManagement.click();
                break;
            case "teacherManagementMenu":
                managementonschoolHomePage.teacherMangement.click();
                break;
            case "studentManagementMenu":
                managementonschoolHomePage.studentManagement.click();
                break;
            case "studentInfoManagementMenu":
                managementonschoolHomePage.studentInfoManagement.click();
                break;
            case "contactMenu":
                managementonschoolHomePage.contactMenu.click();
                break;
            case "guestUserMenu":
                managementonschoolHomePage.guestUserMenu.click();
                break;
            case "logOut":
                managementonschoolHomePage.logOut.click();
                break;
            case "Submit":
                managementonschoolHomePage.submitButton.click();
                break;
            case "Gender":
                managementonschoolHomePage.genderFemale.click();
                break;
            case "isAdvisorTeacher":
                managementonschoolHomePage.isAdvisorTeacher.click();
                break;


        }
        ReusableMethods.bekle(2);
    }

    @Then("Enter<{string}> UserName")
    public void enter_user_name(String string) {

        managementonschoolHomePage.userName.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("Enter<{string}> PassWord")
    public void enter_pass_word(String string) {
        managementonschoolHomePage.password.sendKeys(ConfigReader.getProperty(string));
    }

    @Then("Choose a lesson")
    public void choose_a_lesson() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(managementonschoolHomePage.dropdownChooseLesson).perform();
        actions.click(managementonschoolHomePage.dropdownChooseLesson).sendKeys("Java", Keys.ARROW_DOWN, Keys.ENTER).build().perform();

    }

    @And("Enter random<{string}>")
    public void enterRandom(String variable) {

        fakeProfile = new FakeProfile();

        switch (variable) {
            case "name":
                managementonschoolHomePage.name.sendKeys(fakeProfile.getName());
                break;
            case "surname":
                managementonschoolHomePage.surname.sendKeys(fakeProfile.getSurname());
                break;
            case "birthPlace":
                managementonschoolHomePage.birthPlace.sendKeys(fakeProfile.getBirthPlace());
                break;
            case "email":
                managementonschoolHomePage.email.sendKeys(fakeProfile.getEmail());
                break;
            case "phoneNumber":
                managementonschoolHomePage.phoneNumber.sendKeys(fakeProfile.getPhoneNumber());
                break;
            case "SSN":
                managementonschoolHomePage.ssn.sendKeys(fakeProfile.getSocialSecurityNumber());
                break;
            case "userName":
                managementonschoolHomePage.userName.sendKeys(fakeProfile.getUserName());
                break;
            case "password":
                managementonschoolHomePage.password.sendKeys("1,2,3,4,5,6,7,8");
                break;
            case "DateOfBirth":
                managementonschoolHomePage.birthDay.sendKeys(fakeProfile.getDateOfBirth());
                break;


        }
    }

    @Given("Enter specific <{string}> to <{string}>")
    public void enter_specific_to(String string, String string2) {
        switch (string2) {
            case "name":
                managementonschoolHomePage.name.sendKeys(string);
                break;
            case "surname":
                managementonschoolHomePage.surname.sendKeys(string);
                break;
            case "birthPlace":
                managementonschoolHomePage.birthPlace.sendKeys(string);
                break;
            case "email":
                managementonschoolHomePage.email.sendKeys(string);
                break;
            case "phoneNumber":
                managementonschoolHomePage.phoneNumber.sendKeys(string);
                break;
            case "SSN":
                managementonschoolHomePage.ssn.sendKeys(string);
                break;
            case "userName":
                managementonschoolHomePage.userName.sendKeys(string);
                break;
            case "password":
                managementonschoolHomePage.password.sendKeys(string);
                break;
            case "DateOfBirth":
                managementonschoolHomePage.birthDay.sendKeys(string);
                break;


        }

    }


    @Then("Quit Driver Gorkem")
    public void quitDriverGorkem() {
    }

    @Then("Close it")
    public void closeIt() {

        Driver.quitDriver();
        ReusableMethods.bekle(3);
    }


    @And("Warning for <{string}>")
    public void warningFor(String warning) {
        boolean assrt = false;
        switch (warning) {
            case "nameRequired":
                assrt = managementonschoolHomePage.nameRequired.isDisplayed();
                break;
            case "surNameRequired":
                assrt = managementonschoolHomePage.surNameRequired.isDisplayed();
                break;
            case "birthPlaceRequired":
                assrt = managementonschoolHomePage.birthPlaceRequired.isDisplayed();
                break;
            case "emailRequired":
                assrt = managementonschoolHomePage.emailRequired.isDisplayed();
                break;
            case "phoneNumberRequired":
                assrt = managementonschoolHomePage.phoneNumberRequired.isDisplayed();
                break;
            case "birthDayRequired":
                assrt = managementonschoolHomePage.birthDayRequired.isDisplayed();
                break;
            case "sSNRequired":
                assrt = managementonschoolHomePage.sSNRequired.isDisplayed();
                break;
            case "passwordRequired":
                assrt = managementonschoolHomePage.passwordRequired.isDisplayed();
                break;
            case "pleaseChooseLessonMessage":
                assrt = managementonschoolHomePage.pleaseChooseLessonMessage.isEnabled();
                break;
            case "invalidNameWarning":
                assrt = managementonschoolHomePage.invalidNameWarning.isDisplayed();
                break;
            case "invalidSurNameWarning":
                assrt = managementonschoolHomePage.invalidSurNameWarning.isDisplayed();
                break;
            case "birthPlaceWarning":
                assrt = managementonschoolHomePage.birthPlaceWarning.isDisplayed();
                break;
            case "pleaseEnterValidEmailMessage":
                if (managementonschoolHomePage.pleaseEnterValidEmailMessage.isDisplayed() || managementonschoolHomePage.emailShouldBe5_50.isDisplayed()) {
                    assrt = true;
                }
                break;
            case "emailShouldBe5_50":
                if (managementonschoolHomePage.pleaseEnterValidEmailMessage.isDisplayed() || managementonschoolHomePage.emailShouldBe5_50.isDisplayed()) {
                    assrt = true;
                }
                break;
            case "pleaseEnterValidPhoneNumberMessage":
                assrt = managementonschoolHomePage.pleaseEnterValidPhoneNumberMessage.isDisplayed();
                break;
            case "phoneNumber12Message":
                assrt = managementonschoolHomePage.phoneNumber12Message.isDisplayed();
                break;
            case "dogumGunuGecmisBirTarihOlmali":
                assrt = managementonschoolHomePage.dogumGunuGecmisBirTarihOlmali.isDisplayed();
                break;
            case "pleaseEnterValidSSNNumberMessage":
                assrt = managementonschoolHomePage.pleaseEnterValidSSNNumberMessage.isDisplayed();
                break;
            case "userNameMust4CharMessage":
                assrt = managementonschoolHomePage.userNameMust4CharMessage.isDisplayed();
                break;
            case "fullAuthenticationWanrning":
                assrt = managementonschoolHomePage.fullAuthenticationWanrning.isDisplayed();
                break;
        }
        Assert.assertTrue(assrt);
    }

}
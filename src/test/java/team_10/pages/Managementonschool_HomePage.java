package team_10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_10.utilities.Driver;

public class Managementonschool_HomePage {
    public Managementonschool_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "[href='/register']")
    public WebElement mainMenuRegister;

    @FindBy(css = "[href='/login']")
    public WebElement mainMenuLogin;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginMenuLoginButon;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement adminManagement;
    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanManagement;
    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanMangement;

    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagement;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherMangement;
    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement;
    @FindBy(xpath = "//a[text()='Student Info Management']")
    public WebElement studentInfoManagement;
    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//a[text()='Choose Lesson']")
    public WebElement chooseLessonManagement;

    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactMenu;
    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUserMenu;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOut;

    @FindBy(id = "react-select-3-placeholder")
    public WebElement dropdownChooseLesson;

    @FindBy(id = "name")
    public WebElement name;
   @FindBy(id = "surname")
    public WebElement surname;

   @FindBy(id = "birthPlace")
    public WebElement birthPlace;

   @FindBy(id = "email")
    public WebElement email;

   @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(css = "[class='form-check']")
    public WebElement isAdvisorTeacher;

    @FindBy(id = "birthDay")
    public WebElement birthDay;








//-----------------------------------------------100

















































    //----------------------------------------------150 Eren

















































    //----------------------------------------------Burak 200

















































    //----------------------------------------------Aykut 250

















































    //----------------------------------------------Bilal 300

















































    //----------------------------------------------Gorkem 350
    //Requiered Messages
    @FindBy(xpath = "//*[@id='name' and @class='form-control is-invalid']")public WebElement nameRequired;
    @FindBy(xpath = "//*[@id='surname' and @class='form-control is-invalid']")public WebElement surNameRequired;
    @FindBy(xpath = "//*[@id='birthPlace' and @class='form-control is-invalid']")public WebElement birthPlaceRequired;
    @FindBy(xpath = "//*[@id='email' and @class='form-control is-invalid']")public WebElement emailRequired;
    @FindBy(xpath = "//*[@id='phoneNumber' and @class='form-control is-invalid']")public WebElement phoneNumberRequired;
    @FindBy(xpath = "//*[@id='birthDay' and @class='form-control is-invalid']")public WebElement birthDayRequired;
    @FindBy(xpath = "//*[@id='ssn' and @class='form-control is-invalid']")public WebElement sSNRequired;
    @FindBy(xpath = "//*[@id='password' and @class='form-control is-invalid']")public WebElement passwordRequired;

    //Warning Messages
    @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")public WebElement pleaseChooseLessonMessage;
    @FindBy(xpath = "//div[text()='Your name should be at least 2 characters']")public WebElement invalidNameWarning;
    @FindBy(xpath = "//div[text()='Your surname should be at least 2 characters']")public WebElement invalidSurNameWarning;
    @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']")public WebElement invalidGengerSelectWarning;
    @FindBy(xpath = "//div[text()='Your birth place should be at least 2 characters']")public WebElement birthPlaceWarning;
    @FindBy(xpath = "//div[text()='Please enter valid email']")public WebElement pleaseEnterValidEmailMessage;
    @FindBy(xpath = "//div[text()='Your email should be between 5 and 50 characters']")public WebElement pleaseEnterValidEmail2Message;
    @FindBy(xpath = "//div[text()='Phone number should be exact 12 characters']")public WebElement pleaseEnterValidPhoneNumberMessage;
    @FindBy(xpath = "//div[text()='Please enter valid phone number']")public WebElement pleaseEnterValidPhoneNumberMessage2;
    @FindBy(xpath = "//div[text()='geçmiş bir tarih olmalı']")public WebElement dogumGunuGecmisBirTarihOlmali;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")public WebElement pleaseEnterValidSSNNumberMessage;
    @FindBy(xpath = "//div[text()='Your username should be at least 4 characters']")public WebElement userNameMust4CharMessage;
    @FindBy(xpath = "//div[text()='Full authentication is required to access this resource']")public WebElement fullAuthenticationWanrning;

    @FindBy(xpath = "//span[@class='text-white']") public WebElement kullaniciIsmiTexti;
    @FindBy(xpath = "//div[@role='alert']")public WebElement teacherSavedMessage;
    @FindBy(css = " [class=' css-1xc3v61-indicatorContainer']") public WebElement selectLesson;





















    //----------------------------------------------Kemal 400

















































    //----------------------------------------------Kubra 450

















































    //----------------------------------------------Mustafa 500

















































    //----------------------------------------------Sabire 550

















































    //----------------------------------------------Sena 600

















































    //----------------------------------------------Erdogan 650


































































}

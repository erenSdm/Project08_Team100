package team_10.pages.US25Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage_Burak {

    @FindBy(xpath = "//a[.='Student Management']")
    public WebElement studentManagement;

    @FindBy(id = "advisorTeacherId")
    public WebElement teacherSelectddm;

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

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "fatherName")
    public WebElement fatherName;

    @FindBy(id = "motherName")
    public WebElement motherName;

    @FindBy(id = "password")
    public WebElement smpassword;

    @FindBy(xpath = "(//*[@class='form-check-input'])[2]")
    public WebElement male;

    @FindBy(xpath = "(//*[@class='form-check-input'])[1]")
    public WebElement female;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement surnameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement birthplaceRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement emailRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement dobRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement ssnRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement usernameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[9]")
    public WebElement fathernameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[10]")
    public WebElement mothernameRequired;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")
    public WebElement passwordRequired;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement genderAlert;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")
    public WebElement passwordAlert;
}

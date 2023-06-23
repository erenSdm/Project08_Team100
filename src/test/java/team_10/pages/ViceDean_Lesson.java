package team_10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_10.utilities.Driver;

public class ViceDean_Lesson {

    public ViceDean_Lesson(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement homepageLogin;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginMenuLoginButon;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonMenuButton;

    @FindBy(id = "lessonName")
    public WebElement lessonNameBox;

    @FindBy(xpath = "//*[@id='compulsory']")
    public WebElement checkbox;

    @FindBy(xpath = "//*[@id='creditScore']")
    public WebElement creditScoreBox;

    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButton;

    @FindBy(linkText ="//div[text()='Lesson Created']")
    public WebElement lessonCeratedAlert;

    @FindBy(xpath ="//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement yes;





}

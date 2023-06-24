package team_10.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team_10.utilities.Driver;

public class KubraLocatler {

    public KubraLocatler(){

     PageFactory.initElements(Driver.getDriver(), this);

}

    @FindBy(xpath = "//i[@aria-hidden='true']")
    public WebElement registerK;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement name;

    @FindBy(xpath = "//button[text()='Register']")
    public WebElement register;
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginGiris;


    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement hiYazisi;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement ogertmenMenu;



    @FindBy(xpath = "(//a[@role='button'])[10]")
    public WebElement studentManagInfo;


    ///TC02 Locateler

    //span[@class='text-white']
    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement hiTeacher;

    //input[@placeholder='Absentee']

    @FindBy(xpath = "//input[@placeholder='Absentee']")
    public WebElement absentee;


    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement submit;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginteach;

    @FindBy(xpath ="//option[text()='Selenium']")
    public WebElement chooseLesson;

    @FindBy(xpath ="(//*[text()='Selenium'])[2]")
    public WebElement seleniumSecim;

    //a[text()='Logout']

    @FindBy(xpath ="(//a[@role='button'])[12]")
    public WebElement logout;

    @FindBy(xpath ="//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement menu;

    //button[text()='Yes']

    @FindBy(xpath ="///button[text()='Yes']")
    public WebElement yesLogout;


    ///!!!!US 18 LOCATELER

    @FindBy(xpath ="//th[1]")
    public WebElement nameIsdisp;

    @FindBy(xpath ="//th[2]")
    public WebElement lessonIsdisp;

    @FindBy(xpath ="//th[3]")
    public WebElement absenteeIsdisp;

    @FindBy(xpath ="//th[4]")
    public WebElement midterexamIsdisp;

    @FindBy(xpath ="//th[5]")
    public WebElement finalexamIsdisp;

    @FindBy(xpath ="//th[6]")
    public WebElement noteIsdisp;

    @FindBy(xpath ="//th[7]")
    public WebElement infonoteIsdisp;

    @FindBy(xpath ="//th[8]")
    public WebElement averageIsdisp;

    @FindBy(xpath ="(//button[@class='text-dark btn btn-outline-info'])[5]")
    public WebElement edit;

    //div[text()='Edit Student Info']

    @FindBy(xpath ="//div[text()='Edit Student Info']")
    public WebElement editStudentInfopage;
}


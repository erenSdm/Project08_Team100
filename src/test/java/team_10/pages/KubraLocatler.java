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
    //span[@class='text-white']

    @FindBy(xpath = "//span[@class='text-white']")
    public WebElement hiYazisi;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement ogertmenMenu;

    //a[text()='Student Info Management']

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

}


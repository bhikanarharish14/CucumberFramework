package com.vtiger.pages;


import com.vtiger.utility.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonMethods {

    public WebDriver driver;

    public LoginPage(WebDriver driver)

    {
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);


    }

    @FindBy(name = "user_name")
    WebElement tb_username;

    @FindBy(name = "user_password")
    WebElement tb_password;

    @FindBy(name = "Login")
    WebElement btn_login;

    @FindBy(xpath = "//img[@src='include/images/vtiger-crm.gif']")
    WebElement img_logo;

    @FindBy(xpath = "//*[contains(text(), 'You must specify a valid username and password.')]")
    WebElement txt_errmsg;

    public void Login(String uid, String pwd)
    {

        SetUsername(uid);
        SetPassword(pwd);
        ClickLogin();

    }
    public void SetUsername(String uid)
    {
        SetInput(tb_username,uid,uid+ "has been entered into username field");
    }

    public void SetPassword(String pwd)
    {
        SetInput(tb_password,pwd, pwd+ "has been entered into username field");
    }

    public void ClickLogin()
    {
        ClickElement(btn_login, "Clicked on the login button");
    }

    public void VerifyLogo()
    {
        ElementExist(img_logo, "Logo verified succesfully on login page");

    }

    public void VerifyErrorMessage()
    {
        ElementExist(txt_errmsg, "error message is verified");
    }







}

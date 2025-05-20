package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//h6[contains(@class,'topbar-header-breadcrumb')]")
    private WebElement txtDashboard;

    public void loginUser(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();
    }

    public void loginUsernamePassword(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
    }

    public void setLoginBtn(){
        loginBtn.click();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }



}

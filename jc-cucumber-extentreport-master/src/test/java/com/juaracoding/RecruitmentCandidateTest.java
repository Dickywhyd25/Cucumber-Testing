package com.juaracoding;

import com.juaracoding.pages.RecruitmentCandidatePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RecruitmentCandidateTest {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private static RecruitmentCandidatePage recruitmentCandidatePage = new RecruitmentCandidatePage();

    public RecruitmentCandidateTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Admin go to menu Recruitment")
    public void admin_go_to_menu_recruitment(){
        recruitmentCandidatePage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS,"Admin go to menu Recruitment");
    }

    @When("Admin click button Add")
    public void admin_click_button_add(){
        recruitmentCandidatePage.setAddBtn();
        extentTest.log(LogStatus.PASS,"Admin click button Add");
    }

}

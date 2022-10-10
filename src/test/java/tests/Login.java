package tests;

import Pages.LoginPage;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import static extentreports.ExtentTestManager.startTest;
import static org.testng.Assert.assertEquals;
import static extentreports.ExtentTestManager.getTest;

public class Login extends BaseTest{

    @Test
    public void login (){
        startTest("Login Orang HRM", "Login as Admin");
        loginPage.loginHrm("Admin", "admin123");
        getTest().log(Status.INFO, "Set username & Password");

    }
}

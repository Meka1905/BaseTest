package tests;

import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_Latihan1 extends BaseTest {

//    @Test
//    public void login (){
//        startTest("go to form", "Practice form");
//        latihan1.practiceForm ();
//        getTest().log(Status.INFO, "Goto practice form");
//    }

    @Test (priority = 0)
    public void inputName(){
        startTest("input name", "first name&last name");
        latihan1.inputName("Khaeruz", "Zahra");
        getTest().log(Status.INFO, "input name");
    }

    @Test (priority = 1)
    public void inputEmail(){
        startTest("input email", "Email");
        latihan1.inputEmail("Khaeruzzahra97@gmail.com");
        getTest().log(Status.INFO, "input email");
    }

    @Test (priority = 2)
    public void chooseGender(){
        scroll();
        startTest("Choose gender", "Gender");
        latihan1.chooseGender();
        getTest().log(Status.INFO, "choose gender");
    }

    @Test (priority = 3)
    public void inputPhoneNum(){
        startTest("input phone number", "Phone Number");
        latihan1.inputPhoneNum("082xxxxxxxx");
        getTest().log(Status.INFO, "input phone number");
    }

}

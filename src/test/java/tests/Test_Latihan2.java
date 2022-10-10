package tests;

import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_Latihan2 extends BaseTest{

    @Test(priority = 0)
    public void startForm(){
        startTest("click add", "start");
        latihan2.clickAdd();
        latihan2.formInputName(setup.getfName(), setup.getlName());
        latihan2.formInputEmail("Khaeruzzahra97@gmail.com");
        latihan2.formInputAge("25");
        latihan2.formInputSalary("200000000");
        latihan2.formInputDepartment("QA");
        latihan2.clickSubmit();
        getTest().log(Status.INFO, "submit form");
    }




}

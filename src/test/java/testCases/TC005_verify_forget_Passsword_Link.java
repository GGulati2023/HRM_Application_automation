package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.OrangeHRM_HomePage;



public class TC005_verify_forget_Passsword_Link extends BaseClass {



    @Test

    public void verifyForgetPasswordLink() throws InterruptedException {

        OrangeHRM_HomePage ohp=new OrangeHRM_HomePage(driver);

        ohp.verifyForgetPasswordLink();

        Assert.assertEquals(true,ohp.verifyForgetPasswordLink());

        Thread.sleep(30000);
    }
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrangeHRM_HomePage;

public class TC002_Login_ValidCredentials extends BaseClass{

    // Create the object of Home page

   // in java action methods and webElements are access by the help of Object

    // Object of the home page

  @Test

    public void verifyLoginWithValidCredentials(){

//      HomePage hp = new HomePage(driver);
//      hp.clickMyAccount();
//      hp.clickLoginButton();

      // Enter Email id

    logger.info("****Starting TC*****");
    LoginPage lp = new LoginPage(driver);
    logger.info("Page Lp Object create successfully");
    lp.setUserName(rb.getString("userName"));
    logger.info("user name added");
    lp.setPassword(rb.getString("password"));
    logger.info("password entered");
    lp.clickOnContinueButton();
    logger.info("click on login button");
    // Assertion to check if user has been logged in successfully into the application

    OrangeHRM_HomePage orp = new OrangeHRM_HomePage(driver);
    String actualUserName =orp.getUserName();
    String expectedUserName ="Paul Collings";

//    Assert.fail();
//    Assert.assertEquals(actualUserName,expectedUserName);
  }

  @Test
  public void verifyLogout(){



    OrangeHRM_HomePage orp=new OrangeHRM_HomePage(driver);

    orp.clickOnUserIcon();

    orp.clickOnLogoutBtn();

    // verify that user has been loggegout

   String actualCurrentUrl= driver.getCurrentUrl();

   String expectedCurrentUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

   Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl);

  }

}

package testCases;

import org.testng.annotations.Test;
import pageObjects.VerifyLabelofUsernameAndPassword;

public class TC006DisplayUserNaneAndPassword extends BaseClass{

    @Test
    public void displayUserName(){
        VerifyLabelofUsernameAndPassword displayUserName =new VerifyLabelofUsernameAndPassword(driver);
        displayUserName.userNameDisplay();
        displayUserName.passwordDisplay();

    }
}

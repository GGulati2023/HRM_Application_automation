package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyLabelofUsernameAndPassword extends BasePage{


    public VerifyLabelofUsernameAndPassword(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//label[normalize-space()='Username']")
    WebElement un;

    @FindBy(xpath = "//label[normalize-space()='Password']")
    WebElement pw;

    public void userNameDisplay(){
     String und = un.getText();
        System.out.println(und);
    }

    public void passwordDisplay(){
      String pwd =pw.getText();
        System.out.println(pwd);

    }
}

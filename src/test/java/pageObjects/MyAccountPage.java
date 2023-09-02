package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//h2[contains(text(),'My Account')]")
    WebElement txtMyAccount;


    public String getMyAccountTxt(){
       String txt= txtMyAccount.getText();
       return txt;
    }

}

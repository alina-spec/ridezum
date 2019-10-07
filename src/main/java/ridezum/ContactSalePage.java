package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ContactSalePage extends BasePage {

    public ContactSalePage(WebDriver driver){
        super(driver);}

        @FindBy(css = ".m-input.contact-form__input.required")
        private List<WebElement> form;

    public void inputFullName(String fullName){
        wait.until(ExpectedConditions.elementToBeClickable(form.get(0)));
        form.get(0).sendKeys(fullName);
    }
    public void inputSchoolName(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(form.get(1)));
        form.get(1).sendKeys(lastName);
    }
    public void inputEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(form.get(2)));
        form.get(2).sendKeys(email);
    }
    public void inputPhone(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(form.get(3)));
        form.get(3).sendKeys(phone);
    }



}

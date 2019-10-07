package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class ApplyToPage extends BasePage {

    public ApplyToPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"application_form[first_name]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"application_form[last_name]\"] ")
    private WebElement lastNameField;

    @FindBy(css = "input[name=\"application_form[email]\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"application_form[phone_number]\"]")
    private WebElement phoneField;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> careersButton;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement selectAreaField;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    @FindBy(css = ".help-block")
    private List<WebElement> pLeaseEnterValue;


    public void clickCareersButton() {
        wait.until(ExpectedConditions.elementToBeClickable(careersButton.get(4)));
        careersButton.get(4).click();
        //return new CareerPage(driver);
    }

    public void selectArea(int index) {
        Select select = new Select(selectAreaField);
        select.selectByIndex(index);
    }

    public void selectAreabyName(String city) {
        Select select = new Select(selectAreaField);
        select.selectByVisibleText(city);
    }

    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }
    public void clickSubmit(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
    }

    public String verifyFirstError(){
        wait.until(ExpectedConditions.elementToBeClickable(pLeaseEnterValue.get(0)));
        return pLeaseEnterValue.get(0).getText();
    }
    public String verifySecondError(){
        wait.until(ExpectedConditions.elementToBeClickable(pLeaseEnterValue.get(2)));
        return pLeaseEnterValue.get(2).getText();
    }
    public String verifyThirdError(){
        wait.until(ExpectedConditions.elementToBeClickable(pLeaseEnterValue.get(5)));
        return pLeaseEnterValue.get(5).getText();
    }
    public String verifyFourthError(){
        wait.until(ExpectedConditions.elementToBeClickable(pLeaseEnterValue.get(7)));
        return pLeaseEnterValue.get(7).getText();
    }
    public String verifyFifthError(){
        wait.until(ExpectedConditions.elementToBeClickable(pLeaseEnterValue.get(9)));
        return pLeaseEnterValue.get(9).getText();
    }

}

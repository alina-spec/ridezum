package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SolutionsPage extends BasePage {

    public SolutionsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".m-btn.contact-btn.scroll-to-btn")
    private WebElement contactSales;

    public ContactSalePage clickContactSales(){
        wait.until(ExpectedConditions.elementToBeClickable(contactSales));
        contactSales.click();
        return new ContactSalePage(driver);
    }
}

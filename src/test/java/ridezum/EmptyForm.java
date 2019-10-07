package ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

public class EmptyForm extends BaseTest {

    private HomePage homePage;
    private ApplyToPage applyToPage;

    @Test
    public void formEmpty(){

        homePage = new HomePage(driver);
        applyToPage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyToPage.clickSubmit();

    }
}

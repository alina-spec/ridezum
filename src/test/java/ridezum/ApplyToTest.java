package ridezum;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ApplyToTest extends BaseTest{

    private HomePage homePage;
    private ApplyToPage applyToPage;

    @Test
    public void testToApply() throws InterruptedException {

        homePage = new HomePage(driver);

        applyToPage = homePage.clickApplyToDriveButton();

        String expectedResult = "Zumer, Become a Driver, Drivers for Kids | Zum";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyToPage.inputFirstName(user.getFistName());
        applyToPage.inputLastName(user.getLastName());
        applyToPage.inputEmail(user.getEmail());
        applyToPage.inputPhone(user.getPhone());

        applyToPage.selectArea(3);

        Thread.sleep(10000);
        driver.switchTo().defaultContent();
        applyToPage.clickCareersButton();

        String expectedResultFN = "Please enter a value";
        String expectedResultLN = "Please enter a value";
        String expectedResultEmail = "Please enter a value";
        String expectedResultPhone = "Please enter a value";
        String expectedResultArea = "Please enter a value";

        String actualResultFN = applyToPage.verifyFirstError();
        String actualResultLN = applyToPage.verifySecondError();
        String actualResultEmail = applyToPage.verifyThirdError();
        String actualResultPhone = applyToPage.verifyFourthError();
        String actualResultArea = applyToPage.verifyFifthError();

        Assert.assertEquals("Please enter a value", actualResultFN);
        Assert.assertEquals("Please enter a value", actualResultLN);
        Assert.assertEquals("Please enter a value", actualResultEmail);
        Assert.assertEquals("Please enter a value", actualResultPhone);
        Assert.assertEquals("Please enter a value", actualResultArea);

        System.out.println(actualResultFN);
        System.out.println(actualResultLN);
        System.out.println(actualResultEmail);
        System.out.println(actualResultPhone);
        System.out.println(actualResultArea);



    }
}

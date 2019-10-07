package ridezum;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static User user;


    @BeforeClass
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://ridezum.com");
        driver.manage().window().fullscreen();

        String expectedTitle = "Zūm";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        user = new User("alina", "malina", "alina@gmail.com", "1234567890");

    }

    //@AfterClass
    //public static void finish(){
       // driver.quit();
    //}


}

package ridezum;

import org.junit.Test;

public class ContactSaleTest extends BaseTest {

    private HomePage homePage;
    private SolutionsPage solutionsPage;
    private ContactSalePage contactSalePage;

    @Test
    public void testSaleContact(){

        homePage = new HomePage(driver);
        solutionsPage = homePage.clickSeeSolutionsForSchoolButton();
        contactSalePage = solutionsPage.clickContactSales();

        contactSalePage.inputFullName(user.getFistName());
        contactSalePage.inputFullName(user.getLastName());
        contactSalePage.inputFullName(user.getEmail());
        contactSalePage.inputFullName(user.getPhone());



    }
}

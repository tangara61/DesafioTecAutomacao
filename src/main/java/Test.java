import PageObjects.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Test {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver wdriver = new Driver();
        driver = wdriver.Webdriver();
    }

    public void completeFifthPage() throws InterruptedException {
        FifthPage pg5 = new FifthPage(driver);
        pg5.chooseEmail();
        pg5.choosePhone();
        pg5.chooseUsername();
        pg5.choosePassword();
        pg5.writeComments();
        pg5.clickButton();
        pg5.verificarSendEmail();
    }
    public void completeFourthPage() throws InterruptedException {
        FourthPage pg4 = new FourthPage(driver);
        pg4.chooseSelectOptionPrice();
        pg4.clickButton();
    }
    @org.junit.jupiter.api.Test
    public void completeThirdPage(){
        ThirdPage pg3 = new ThirdPage(driver);
        pg3.chooseStartDate();
        pg3.chooseInsuranceSum();
        pg3.chooseMeritRating();
        pg3.chooseDamageInsurance();
        pg3.chooseOpitionalProducts();
        pg3.chooseCourtesyCar();
        pg3.clickButton();
    }

    @org.junit.jupiter.api.Test
    public void completeSecondPage(){
        SecondPage pg2 = new SecondPage(driver);
        pg2.chooseName();
        pg2.chooseDateOfBirth();
        pg2.chooseGender();
        pg2.chooseStreetAddress();
        pg2.chooseCountry();
        pg2.chooseZipCode();
        pg2.chooseCity();
        pg2.chooseOccupation();
        pg2.chooseHobbies();
        pg2.chooseWebsite();
        pg2.clickButton();
    }
    @org.junit.jupiter.api.Test
    public void completeFirstPage(){
        FirstPage pg1 = new FirstPage(driver);
        pg1.escolherMake();
        pg1.escolherModel();
        pg1.chooseCylinderCapacity();
        pg1.chooseEnginePerformance();
        pg1.chooseDateManufacture();
        pg1.chooseNumberOfSeats();
        pg1.selectRHD();
        pg1.chooseNumberOfSeatsMotorcycle();
        pg1.chooseFuelType();
        pg1.choosePayload();
        pg1.chooseTotalWeight();
        pg1.chooseListPrice();
        pg1.chooseLicensePlateNumber();
        pg1.chooseAnnualMileage();

        pg1.clickButton();

    }
    @org.junit.jupiter.api.Test
    public void testThreePages() throws InterruptedException {
        criarDriver();
        completeFirstPage();
        completeSecondPage();
        completeThirdPage();
        completeFourthPage();
        completeFifthPage();
    }


    @After
    public void fecharDriver(){
        driver.close();
        driver.quit();
    }


}

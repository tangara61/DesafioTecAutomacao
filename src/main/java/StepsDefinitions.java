import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class StepsDefinitions {
    WebDriver driver;
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Given("que entrei no site: {string}")
    public void que_entrei_no_site(String url) {
        driver.get(url);
    }
    @Then("Preencher a primeira pagina")
    public void preencher_a_primeira_pagina() {
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

    @Then("Preencher a segunda pagina")
    public void preencher_a_segunda_pagina() {
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

    @Then("Preencher a terceira pagina")
    public void preencher_a_terceira_pagina() {
        ThirdPage pg3 = new ThirdPage(driver);
        pg3.chooseStartDate();
        pg3.chooseInsuranceSum();
        pg3.chooseMeritRating();
        pg3.chooseDamageInsurance();
        pg3.chooseOpitionalProducts();
        pg3.chooseCourtesyCar();
        pg3.clickButton();
    }
    @Then("Preencher a quarta pagina")
    public void preencher_a_quarta_pagina() throws InterruptedException {
        FourthPage pg4 = new FourthPage(driver);
        pg4.chooseSelectOptionPrice();
        pg4.clickButton();
    }

    @Then("Preencher a quinta pagina")
    public void preencher_a_quinta_pagina() throws InterruptedException {
        FifthPage pg5 = new FifthPage(driver);
        pg5.chooseEmail();
        pg5.choosePhone();
        pg5.chooseUsername();
        pg5.choosePassword();
        pg5.writeComments();
        pg5.clickButton();
        pg5.verificarSendEmail();
    }
    @After
    public void fecharDriver(){
        driver.close();
        driver.quit();
    }
}

package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class SecondPage {
    private WebDriver driver;
    public SecondPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
        @FindBy(how = How.XPATH, using = "//*[@id=\"firstname\"]")
        private WebElement firstName;

        @FindBy(how = How.XPATH, using = "//*[@id=\"lastname\"]")
        private WebElement lastName;

        @FindBy(how = How.XPATH, using = "//*[@id=\"birthdate\"]")
        private WebElement birthDate;

        @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p")
        private WebElement gender;

        @FindBy(how = How.XPATH, using = "//*[@id=\"streetaddress\"]")
        private WebElement streetAddress;

        @FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
        private WebElement country;

        @FindBy(how = How.XPATH, using = "//*[@id=\"zipcode\"]")
        private WebElement zipCode;

        @FindBy(how = How.XPATH, using = "//*[@id=\"occupation\"]")
        private WebElement occupation;

        @FindBy(how = How.XPATH, using ="//*[@id=\"city\"]")
        private WebElement city;

        @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p")
        private WebElement hobbies;

        @FindBy(how = How.XPATH, using = "//*[@id=\"website\"]")
        private WebElement website;

        @FindBy(how = How.XPATH, using = "//*[@id=\"picture\"]")
        private WebElement picture;

        @FindBy(how = How.XPATH, using = "//*[@id=\"nextenterproductdata\"]")
        private WebElement nextButton;

    public void chooseOption(Select select, List<WebElement> options){
        Random random = new Random();
        int rand = random.nextInt((options.size()+1) - 0)+0;
        if(rand==options.size()){
            rand=0;
        }
        select.selectByIndex(rand + 1);
    }
        public void chooseName(){
            firstName.sendKeys("Joao");
            lastName.sendKeys("Souza");
        }
        public void chooseDateOfBirth(){
            birthDate.sendKeys("05/16/2001");
        }

        public void chooseGender(){
            gender.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]")).click();
        }

        public void chooseStreetAddress(){
            streetAddress.sendKeys("Travessa Braúna, 55");
        }

        public void chooseCountry(){
            country.findElement(By.xpath("//*[@id=\"country\"]/option[32]")).click();
        }
        public void chooseZipCode(){
            zipCode.sendKeys("04849031");
        }
        public void chooseCity(){
            city.sendKeys("São Paulo");
        }
        public void chooseOccupation(){
            Select select = new Select(occupation);
            List<WebElement> options = select.getOptions();
            options.remove(0);
            chooseOption(select, options);
        }

        public void chooseHobbies(){
            hobbies.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]")).click();
        }

        public void chooseWebsite(){
            website.sendKeys("https://www.linkedin.com/in/jo%C3%A3o-felipe-batista-de-souza-b03361165/");
        }

        public void choosePicture(){
            driver.findElement(By.xpath("//*[@id=\"open\"]")).click();
            picture.sendKeys("D:/joaof/Pictures/Captura de tela 2022-12-25 224440.png");
        }
        public void clickButton(){
            nextButton.click();
        }
}

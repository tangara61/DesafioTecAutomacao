package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class FourthPage {
    private WebDriver driver;
    public FourthPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div")
    private WebElement selectOptionPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nextsendquote\"]")
    private WebElement nextButton;


    public void chooseSelectOptionPrice(){
        Random random = new Random();
        int rand = random.nextInt(5-1)+1;
        selectOptionPrice.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label["+rand+"]")).click();
    }
    public void clickButton() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nextButton.click();
    }

}

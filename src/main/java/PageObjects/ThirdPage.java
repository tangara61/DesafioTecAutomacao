package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ThirdPage {

    private WebDriver driver;
    public ThirdPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"startdate\"]")
    private WebElement startDate;

    @FindBy(how = How.XPATH, using = "//*[@id=\"insurancesum\"]")
    private WebElement insuranceSum;

    @FindBy(how = How.XPATH, using = "//*[@id=\"meritrating\"]")
    private WebElement meritRating;

    @FindBy(how = How.XPATH, using = "//*[@id=\"damageinsurance\"]")
    private WebElement damageInsurance;

    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p")
    private WebElement optionalProduts;

    @FindBy(how = How.XPATH, using = "//*[@id=\"courtesycar\"]")
    private WebElement courtesyCar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nextselectpriceoption\"]")
    private WebElement nextButton;

    public void chooseOption(Select select, List<WebElement> options){
        Random random = new Random();
        int rand = random.nextInt((options.size()+1) - 0)+0;
        if(rand==options.size()){
            rand=0;
        }
        select.selectByIndex(rand + 1);
    }
    public void chooseStartDate(){
        Date dataTeste = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataTeste);
        cal.add(Calendar.DATE, 1);
        cal.add(Calendar.MONTH, 1);
        dataTeste = cal.getTime();
        //System.out.println("Data = " +sdf.format(dataTeste));
        startDate.sendKeys(sdf.format(dataTeste));
    }

    public void chooseInsuranceSum(){
        Select select = new Select(insuranceSum);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void chooseMeritRating(){
        Select select = new Select(meritRating);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void chooseDamageInsurance(){
        Select select = new Select(damageInsurance);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void chooseOpitionalProducts(){
        Random random = new Random();
        int rand = random.nextInt(3 -1)+1;
        if (rand == 1){
            optionalProduts.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
        }else{
            optionalProduts.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
        }
    }
    public void chooseCourtesyCar(){
        Select select = new Select(courtesyCar);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void clickButton(){
        nextButton.click();
    }


}

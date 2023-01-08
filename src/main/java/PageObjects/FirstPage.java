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

public class FirstPage {
    private WebDriver driver;
    public FirstPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"make\"]")
    private WebElement make;

    @FindBy(how = How.XPATH, using = "//*[@id=\"model\"]")
    private WebElement model;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cylindercapacity\"]")
    private WebElement cylinderCapacity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"engineperformance\"]")
    private WebElement enginePerformance;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dateofmanufacture\"]")
    private WebElement dateOfManufacture;

   @FindBy(how = How.XPATH, using = "//*[@id=\"numberofseats\"]")
    private WebElement numberOfSeats;

    @FindBy(how = How.XPATH, using = "//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p")
    private WebElement rightHandDrive;

    @FindBy(how = How.XPATH, using = "//*[@id=\"numberofseatsmotorcycle\"]")
    private WebElement numberOfSeatsMotorcycle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"fuel\"]")
    private WebElement fuelType;

    @FindBy(how = How.XPATH, using = "//*[@id=\"payload\"]")
    private WebElement payload;

    @FindBy(how = How.XPATH, using = "//*[@id=\"totalweight\"]")
    private WebElement totalWeight;

    @FindBy(how = How.XPATH, using = "//*[@id=\"listprice\"]")
    private WebElement listPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"licenseplatenumber\"]")
    private WebElement licensePlateNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"annualmileage\"]")
    private WebElement annualMileage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nextenterinsurantdata\"]")
    private WebElement nextEnterInsurantData;

    public void chooseOption(Select select, List<WebElement> options){
        Random random = new Random();
        int rand = random.nextInt((options.size()+1) - 0)+0;
        if(rand==options.size()){
            rand=0;
        }
        select.selectByIndex(rand + 1);
    }
    public void escolherMake() {
        Select select = new Select(make);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void escolherModel() {
        Select select = new Select(model);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void chooseCylinderCapacity(){
        Random random = new Random();
        int rand = random.nextInt(2001-1)+1;
        cylinderCapacity.sendKeys(String.valueOf(rand));
    }
    public void chooseEnginePerformance(){
        Random random = new Random();
        int rand = random.nextInt(2001-1)+1;
        enginePerformance.sendKeys(String.valueOf(rand));
    }
    public void chooseDateManufacture(){
        Random random = new Random();
        Date dataTest = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataTest);
        int dayRandon = random.nextInt(31 - 0) + 0;
        int monthRandon = random.nextInt(13 - 0) + 0;
        int yearRandon = random.nextInt(11 - 0) + 0;
        cal.add(Calendar.DATE, -dayRandon);
        cal.add(Calendar.MONTH, -monthRandon);
        cal.add(Calendar.YEAR, -yearRandon);
        dataTest = cal.getTime();
        dateOfManufacture.sendKeys(sdf.format(dataTest));
    }
    public void chooseNumberOfSeats(){
        Select select = new Select(numberOfSeats);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }
    public void selectRHD(){
        Random random = new Random();
        int rand = random.nextInt(3 -1)+1;
        if (rand == 1){
            rightHandDrive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]")).click();
        }else{
            rightHandDrive.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]")).click();
        }
    }

    public void chooseNumberOfSeatsMotorcycle(){
        Select select = new Select(numberOfSeatsMotorcycle);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }

    public void chooseFuelType(){
        Select select = new Select(fuelType);
        List<WebElement> options = select.getOptions();
        options.remove(0);
        chooseOption(select, options);
    }
    public void choosePayload(){
        Random random = new Random();
        int rand = random.nextInt(1001-1)+1;
        payload.sendKeys(String.valueOf(rand));
    }

    public void chooseTotalWeight(){
        Random random = new Random();
        int rand = random.nextInt(50001-100)+100;
        totalWeight.sendKeys(String.valueOf(rand));
    }

    public void chooseListPrice(){
        Random random = new Random();
        int rand = random.nextInt(50001-100)+100;
        listPrice.sendKeys(String.valueOf(rand));
    }

    public void chooseLicensePlateNumber(){
        Random random = new Random();
        int rand = random.nextInt(50001-100)+100;
        licensePlateNumber.sendKeys(String.valueOf(rand));
    }
    public void chooseAnnualMileage(){
        Random random = new Random();
        int rand = random.nextInt(100001-100)+100;
        annualMileage.sendKeys(String.valueOf(rand));
    }
    public void clickButton(){
        nextEnterInsurantData.click();
    }


}

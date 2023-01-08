package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FifthPage {
    private WebDriver driver;
    public FifthPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
    private WebElement phone;

    @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    private WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"confirmpassword\"]")
    private WebElement confirmPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"Comments\"]")
    private WebElement comments;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sendemail\"]")
    private WebElement sendEmail;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]")
    private WebElement messageSendEmail;

    public void chooseEmail(){
        email.sendKeys("joaofelipe.spfc@gmail.com");
    }

    public void choosePhone(){
        phone.sendKeys("11953718396");
    }

    public void chooseUsername(){
        username.sendKeys("joaofelipe");
    }
    public void choosePassword(){
        String senha = "Teste123";
        password.sendKeys(senha);
        confirmPassword.sendKeys(senha);
    }

    public void writeComments(){
        comments.sendKeys("Fim da Automação!");
    }

    public void clickButton(){
        sendEmail.click();
    }

    public void verificarSendEmail() throws InterruptedException {
        Thread.sleep(10000);
        String mVerific = messageSendEmail.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        if(mVerific.intern() == "Sending e-mail success!"){
            System.out.println("Mensagem Verificada!");
        }else{
            System.out.println("Mensagem não verificada!");
        }
        messageSendEmail.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
    }
}

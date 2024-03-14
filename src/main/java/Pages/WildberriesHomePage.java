package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WildberriesHomePage extends BasePage {
     public WildberriesHomePage(WebDriver driver) {
        super(driver);
    }

    private By product1 = By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div/div[3]/div/article[1]/div/a");
    public String gethrefproduct1(){
        String hrefproduct1 = driver.findElement(product1).getAttribute("innerText");
        return hrefproduct1;
    }

    private By product2 = By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div/div[3]/div/article[1]/div/a");
    public String gethrefproduct2(){
        String hrefproduct2 = driver.findElement(product2).getAttribute("innerText");
        return hrefproduct2;
    }

    @FindBy(xpath = "//*[@id='app']//div[2]//article[1]//div[3]/p[3]/a")
    private WebElement addproduct1tobasket;

    @FindBy(xpath = "//*[@id='app']//div[2]//article[2]//div[3]/p[3]/a")
    private WebElement addproduct2tobasket;

    @FindBy(xpath = "//a[@data-wba-header-name='Cart']")
    private WebElement gotobasket;


    public void addProductsToBasketAndGoToBasket() {
        PageFactory.initElements(driver, this);
        addproduct1tobasket.click();
        addproduct2tobasket.click();
        gotobasket.click();
    }
}


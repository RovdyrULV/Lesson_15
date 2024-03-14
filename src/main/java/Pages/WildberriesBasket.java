package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WildberriesBasket extends BasePage {
    public WildberriesBasket(WebDriver driver) {
        super(driver);
    }

    private final By product1hrefinbasket = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/a");
    private final By product1nameinbasket = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/a/span[1]");
    public String getProduct1NameInBasket(){
        String product1nameinbasketstring = driver.findElement(product1nameinbasket).getAttribute("innerText");
        return product1nameinbasketstring;
    }

    private final By product2hrefinbasket = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/a");
    private final By product2nameinbasket = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/a/span[1]");
    public String getProduct2NameInBasket(){
        String product2nameinbasketstring = driver.findElement(product2nameinbasket).getAttribute("innerText");
        return product2nameinbasketstring;
    }
    private final By priceoftheproduct1 = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[3]/div[2]");
    public String getProduct1PriceInBasket(){
        String Product1NameInBasketstring = driver.findElement(priceoftheproduct1).getAttribute("textContent");
        return Product1NameInBasketstring;
    }
    private final By priceoftheproduct2 = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[3]/div[2]");
    public String getProduct2PriceInBasket(){
        String Product2NameInBasketstring = driver.findElement(priceoftheproduct2).getAttribute("textContent");
        return Product2NameInBasketstring;
    }
    public String getHrefProduct1(){
        String hrefproduct1 = driver.findElement(product1hrefinbasket).getAttribute("href");
        return hrefproduct1;
    }
    public String getHrefProduct2(){
        String hrefproduct2 = driver.findElement(product2hrefinbasket).getAttribute("href");
        return hrefproduct2;
    }

    private final By totalpriceofproducts = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[2]/div/div/div/div[2]/p/span[2]/span");
    private final By quantityofproduct1 = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[2]/div/div/input");
    public String getquantityofproduct1(){
        String getquantityofproduct1string = driver.findElement(quantityofproduct1).getAttribute("value");
        return getquantityofproduct1string;
    }
    private final By quantityofproduct2 = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div/input");
    public String getquantityofproduct2(){
        String getquantityofproduct2string = driver.findElement(quantityofproduct2).getAttribute("value");
        return getquantityofproduct2string;
    }
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WildberriesProduct extends BasePage{
    public WildberriesProduct(WebDriver driver) {
        super(driver);
    }

    private  By product1name = By.xpath("//h1");
    public String getProductNameInPage(){
        String getProduct1NameInpagestring = driver.findElement(product1name).getAttribute("innerText");
        return getProduct1NameInpagestring;
    }

    private By thepriceoftheproduct = By.xpath("//div[@class='product-page__price-block-wrap']//span[@class='price-block__wallet-price']");
    public String getProductPriceInPage(){
        String getProduct1PriceInpagestring = driver.findElement(thepriceoftheproduct).getAttribute("innerText");
        return getProduct1PriceInpagestring;
    }

    public WildberriesProduct clickOnTheAddToCartButton(){
        driver.findElement(product1name).click();
        return this;
    }
}

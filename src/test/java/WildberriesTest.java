import Pages.WildberriesBasket;
import Pages.WildberriesHomePage;
import Pages.WildberriesProduct;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WildberriesTest {

        WebDriver driver;

        @BeforeAll
        static void setupAll() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        }

        @AfterEach
        void teardown() {
            driver.quit();
        }

        @Test
        public void wildberriesAddToBasketTest(){
            WildberriesHomePage wildberriesHomePage = new WildberriesHomePage(driver);
            WildberriesProduct wildberriesProduct1 = new WildberriesProduct(driver);
            WildberriesProduct wildberriesProduct2 = new WildberriesProduct(driver);
            WildberriesBasket wildberriesBasket = new WildberriesBasket(driver);
            wildberriesHomePage.open("https://www.wildberries.ru/");
            wildberriesHomePage.addProductsToBasketAndGoToBasket();
            wildberriesBasket.open("https://www.wildberries.ru/lk/basket");
            Assertions.assertEquals("1", wildberriesBasket.getquantityofproduct1());
            Assertions.assertEquals("1", wildberriesBasket.getquantityofproduct2());
            String product1nameinbasket = wildberriesBasket.getProduct1NameInBasket();
            String product1priceinbasket = wildberriesBasket.getProduct1PriceInBasket();
            String product2nameinbasket = wildberriesBasket.getProduct2NameInBasket();
            String product2priceinbasket = wildberriesBasket.getProduct2PriceInBasket();
            String hrefProduct1 = wildberriesBasket.getHrefProduct1();
            String hrefProduct2 = wildberriesBasket.getHrefProduct2();
            wildberriesProduct1.open(hrefProduct1);
            String product1nameinpage = wildberriesProduct1.getProductNameInPage();
            String product1priceinpage =wildberriesProduct1.getProductPriceInPage();
            wildberriesProduct2.open(hrefProduct2);
            String product2nameinpage =wildberriesProduct2.getProductNameInPage();
            String product2priceinpage =wildberriesProduct2.getProductPriceInPage();
            Assertions.assertEquals(product1nameinbasket, product1nameinpage);
            Assertions.assertEquals(product2nameinbasket, product2nameinpage);
            Assertions.assertEquals(product1priceinbasket, product1priceinpage);
            Assertions.assertEquals(product2priceinbasket, product2priceinpage);
            //Тест может упасть из-за того что один из рандомных товаров которые будут добавляться в корзину из базовой страницы может иметь дополнительную кнопку для указания конкретной спецификации продутка.
            // Вторая причина в незначительном отличии названии продуктов в корзине и на странице продукта
        }
}


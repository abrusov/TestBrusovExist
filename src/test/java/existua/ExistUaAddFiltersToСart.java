package existua;

import core.BaseSeleniumTest;
import io.qameta.allure.Allure;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;

public class ExistUaAddFiltersToСart extends BaseSeleniumTest {

    @Test
    public void addFiltersToCart() {

        //Добавление товаров в корзину

        A_ChampionFilter championFilter = new A_ChampionFilter();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement CFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний C124606']")));
        CFname.isDisplayed();
        WebElement CFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '81')])[2]")));
        CFprice.isDisplayed();
        WebElement buyButtonC = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Купити'])[2]")));
        buyButtonC.click();
        WebElement inCartC = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='В кошику'])[2]")));
        inCartC.isDisplayed();
        WebElement cart1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'HeaderUserMenuBadge') and contains(text(), '1')]")));
        cart1.isDisplayed();


        B_MannFilter b_mannFilter = new B_MannFilter();
        WebElement MFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний W9142']")));
        MFname.isDisplayed();
        WebElement MFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '336')])[2]")));
        MFprice.isDisplayed();
        WebElement buyButtonM = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Купити'])[2]")));
        buyButtonM.click();
        WebElement inCartM = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='В кошику'])[2]")));
        inCartM.isDisplayed();
        WebElement cart2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'HeaderUserMenuBadge') and contains(text(), '2')]")));
        cart2.isDisplayed();

        C_WixFilter c_wixFilter = new C_WixFilter();
        WebElement WFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний WL7168']")));
        WFname.isDisplayed();
        WebElement WFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '162')])[2]")));
        WFprice.isDisplayed();
        WebElement buyButtonW = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Купити'])[2]")));
        buyButtonW.click();
        WebElement inCartW = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='В кошику'])[2]")));
        inCartW.isDisplayed();
        WebElement cart3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'HeaderUserMenuBadge') and contains(text(), '3')]")));
        cart3.isDisplayed();

        D_BoschFilter d_boschFilter = new D_BoschFilter();
        WebElement BFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний 0986452044']")));
        BFname.isDisplayed();
        WebElement BFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '211')])[2]")));
        BFprice.isDisplayed();
        WebElement buyButtonB = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Купити'])[2]")));
        buyButtonB.click();
        WebElement inCartB = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='В кошику'])[2]")));
        inCartB.isDisplayed();
        WebElement cart4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'HeaderUserMenuBadge') and contains(text(), '4')]")));
        cart4.isDisplayed();

        E_FramFilter e_framFilter = new E_FramFilter();
        WebElement FFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний PH2857A']")));
        FFname.isDisplayed();
        WebElement FFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '180')])[2]")));
        FFprice.isDisplayed();
        WebElement buyButtonE = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Купити'])[2]")));
        buyButtonE.click();
        WebElement inCartE = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='В кошику'])[2]")));
        inCartE.isDisplayed();
        WebElement cart5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'HeaderUserMenuBadge') and contains(text(), '5')]")));
        cart5.isDisplayed();

        //Открытие корзины и переход на страницу с добавленными товарами

        WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@aria-label, 'dropdown-cart')]")));
        cartButton.click();
        WebElement goToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@aria-label, 'Перейти до кошика')]")));
        goToCart.click();
        WebElement cartPage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(@class, 'PageTitleHeader') and contains(text(), 'Кошик')]")));
        cartPage.isDisplayed();

        //Делам скриншот всех товаров в корзине
        Allure.addAttachment("SUM", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        //Подсчет суммы товаров и сравнение с общей суммой

        List<WebElement> elements = driver.findElements(By.xpath("//div[contains(@class, 'CartTotal-sc')]"));
        int sum = 0;
        for (WebElement element : elements) {
            String priceText = element.getText().replaceAll("\\D+", "");
            int price = Integer.parseInt(priceText);
            sum += price;
        }
        int total =
        Integer.parseInt(driver.findElement(By.xpath("//div[contains(@class, 'CartFooterTotal-sc') and contains(text(),'')]"))
                .getText().replaceAll("\\D+", ""));
        if (sum == total) {
            System.out.println("Сумма цен товаров равна общей сумме!"+"  "+ sum +" = "+ total);
        } else {
            System.out.println("Сумма цен товаров не равна общей сумме!"+"  "+ sum +" = "+ total);
        }
    }
}


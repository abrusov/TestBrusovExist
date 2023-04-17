package existua;

import core.BaseSeleniumTest;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;


//Проверям есть ли товар на сайте, а именно название и его цена.
public class ExistUaCheckFiltersTest extends BaseSeleniumTest {

    @Test
    public void checkFilters() {
        //Проверка фильтра фирмы Champion
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String nameChampFilter = "Фільтр масляний C124606";
        String priceOfChampFilter = "81";
        A_ChampionFilter championFilter = new A_ChampionFilter();
        WebElement CFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний C124606']")));
        CFname.isDisplayed();
        WebElement CFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '81')])[2]")));
        CFprice.isDisplayed();
        Assert.assertTrue(championFilter.getName().contains(nameChampFilter));
        Assert.assertTrue(championFilter.getPrice().contains(priceOfChampFilter));
        Allure.addAttachment("CF", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        //Проверка фильтра фирмы Mann
        String nameMannFilter = "Фільтр масляний W9142";
        String priceOfMannFilter = "336";
        B_MannFilter b_mannFilter = new B_MannFilter();
        WebElement MFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний W9142']")));
        MFname.isDisplayed();
        WebElement MFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '336')])[2]")));
        MFprice.isDisplayed();
        Assert.assertTrue(b_mannFilter.getName().contains(nameMannFilter));
        Assert.assertTrue(b_mannFilter.getPrice().contains(priceOfMannFilter));
        Allure.addAttachment("MF", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        //Проверка фильтра фирмы Mann
        String nameWixFilter = "Фільтр масляний WL7168";
        String priceOfWixFilter = "162";
        C_WixFilter c_wixFilter = new C_WixFilter();
        WebElement WFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний WL7168']")));
        WFname.isDisplayed();
        WebElement WFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '162')])[2]")));
        WFprice.isDisplayed();
        Assert.assertTrue(c_wixFilter.getName().contains(nameWixFilter));
        Assert.assertTrue(c_wixFilter.getPrice().contains(priceOfWixFilter));
        Allure.addAttachment("WF", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

        ////Проверка фильтра фирмы Bosch
        String nameBoschFilter = "Фільтр масляний 0986452044";
        String priceBoschFilter = "211";
        D_BoschFilter d_boschFilter = new D_BoschFilter();
        WebElement BFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний 0986452044']")));
        BFname.isDisplayed();
        WebElement BFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '211')])[2]")));
        BFprice.isDisplayed();
        Assert.assertTrue(d_boschFilter.getName().contains(nameBoschFilter));
        Assert.assertTrue(d_boschFilter.getPrice().contains(priceBoschFilter));

        ////Проверка фильтра фирмы Fram
        String nameFramFilter = "Фільтр масляний PH2857A";
        String priceFramFilter = "180";
        E_FramFilter e_framFilter = new E_FramFilter();
        WebElement FFname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Фільтр масляний PH2857A']")));
        FFname.isDisplayed();
        WebElement FFprice = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class, 'ProductPriceValue') and contains(text(), '180')])[2]")));
        FFprice.isDisplayed();
        Assert.assertTrue(e_framFilter.getName().contains(nameFramFilter));
        Assert.assertTrue(e_framFilter.getPrice().contains(priceFramFilter));
    }
}
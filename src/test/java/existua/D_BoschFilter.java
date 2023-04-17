package existua;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class D_BoschFilter extends BaseSeleniumPage {

    @FindBy(xpath = "//h1[text()='Фільтр масляний 0986452044']")
    private WebElement nameOfBoschFilter;

    @FindBy(xpath = "(//div[contains(@class, 'ProductPriceValue') and contains(text(), '211')])[2]")
    private WebElement priceOfBoschFilter;

    public D_BoschFilter(){
        driver.get("https://exist.ua/uk/bosch-brand/filtr-masljanyj-0-986-452-044-1923945/");
        PageFactory.initElements(driver,this);
    }

    public String getName() {
        return nameOfBoschFilter.getText();
    }

    public String getPrice() {
        return priceOfBoschFilter.getText();
    }

}

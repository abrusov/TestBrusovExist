package existua;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class C_WixFilter extends BaseSeleniumPage {

    @FindBy(xpath = "//h1[text()='Фільтр масляний WL7168']")
    private WebElement nameWixFilter;

    @FindBy(xpath = "(//div[contains(@class, 'ProductPriceValue') and contains(text(), '162')])[2]")
    private WebElement priceOfWixFilter;

    public C_WixFilter(){
        driver.get("https://exist.ua/uk/wix-brand/filtr-masljanyj-wl7168-11658768/");
        PageFactory.initElements(driver,this);
    }

    public String getName() {
        return nameWixFilter.getText();
    }

    public String getPrice() {
        return priceOfWixFilter.getText();
    }

}

package existua;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class E_FramFilter extends BaseSeleniumPage {

    @FindBy(xpath = "//h1[text()='Фільтр масляний PH2857A']")
    private WebElement nameOfFramFilter;

    @FindBy(xpath = "(//div[contains(@class, 'ProductPriceValue') and contains(text(), '180')])[2]")
    private WebElement priceOfFramFilter;

    public E_FramFilter(){
        driver.get("https://exist.ua/uk/fram-brand/filtr-masljanyj-ph2857a-11900067/");
        PageFactory.initElements(driver,this);
    }

    public String getName() {
        return nameOfFramFilter.getText();
    }

    public String getPrice() {
        return priceOfFramFilter.getText();
    }

}

package existua;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class B_MannFilter extends BaseSeleniumPage {

    @FindBy(xpath = "//h1[text()='Фільтр масляний W9142']")
    private WebElement nameMannFilter;

    @FindBy(xpath = "(//div[contains(@class, 'ProductPriceValue') and contains(text(), '336')])[2]")
    private WebElement priceOfMannFilter;

    public B_MannFilter(){
        driver.get("https://exist.ua/uk/mann-filter-brand/filtr-masljanyj-w-914-2-23340494/");
        PageFactory.initElements(driver,this);
    }

    public String getName() {
        return nameMannFilter.getText();
    }

    public String getPrice() {
        return priceOfMannFilter.getText();
    }

}

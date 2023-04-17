package existua;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class A_ChampionFilter extends BaseSeleniumPage {

    @FindBy(xpath = "//h1[text()='Фільтр масляний C124606']")
    private WebElement nameChampFilter;

    @FindBy(xpath = "(//div[contains(@class, 'ProductPriceValue') and contains(text(), '81')])[2]")
    private WebElement priceOfChampFilter;

    public A_ChampionFilter(){
        driver.get("https://exist.ua/uk/champion-brand/filtr-masljanyj-c124-606-373459/");
        PageFactory.initElements(driver,this);
    }

    public String getName() {
        return nameChampFilter.getText();
    }

    public String getPrice() {
        return priceOfChampFilter.getText();
    }

}

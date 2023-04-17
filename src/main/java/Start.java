import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","G:\\work\\tools\\drivers\\chromedriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.quit();
}}
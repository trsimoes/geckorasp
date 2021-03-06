package pt.eden.geckorasp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author : trsimoes
 */
public class MainApp {
    public static void main(String[] args) {
//        FirefoxBinary firefoxBinary = new FirefoxBinary();
//        firefoxBinary.addCommandLineOptions("--headless");
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setBinary(firefoxBinary);
//        WebDriver driver = new FirefoxDriver(firefoxOptions);

        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("http://www.google.com");
        System.out.println("Application title is: " + driver.getTitle());

        // https://www.mkyong.com/selenium/many-chromedriver-exe-are-left-hanging-on-windows-selenium/
        driver.quit();
    }
}

package pt.eden.geckorasp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        System.out.println("Application title is: " + driver.getTitle());
        driver.quit();
    }
}

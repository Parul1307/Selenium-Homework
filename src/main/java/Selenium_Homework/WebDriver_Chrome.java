package Selenium_Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Chrome {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/en/demo");


    }
}

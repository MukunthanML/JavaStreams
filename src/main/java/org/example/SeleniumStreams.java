package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;


public class SeleniumStreams {
    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\91809\\Documents\\chromedriver-win32\\chromedriver.exe");

        // Initialize the WebDriver (in this case, Chrome)
        WebDriver driver = new ChromeDriver();

        // Navigate to a web page
        driver.get("https://the-internet.herokuapp.com/status_codes");

        // Find all the links on the page using Selenium
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Use Java streams to process the list of links
        List<String> linkTexts = links.stream().map(WebElement::getText) // Extract the text from each WebElement
                .filter(text -> !text.isEmpty()) // Filter out empty text
                .collect(Collectors.toList()); // Collect the non-empty text into a list
        // Print the link texts
        linkTexts.forEach(System.out::println);

        // Close the WebDriver
        driver.quit();
    }


}

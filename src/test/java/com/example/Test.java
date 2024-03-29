package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Internship\\Barclays\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a URL in the browser
        driver.get("https://www.google.com");

        // Perform actions on the web page
        // Example: Get the title of the page and print it
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        // Close the browser
        driver.quit();
    }
}

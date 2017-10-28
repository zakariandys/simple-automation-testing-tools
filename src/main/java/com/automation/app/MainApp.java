package com.automation.app;

import com.automation.app.domain.Transaction;
import com.automation.database.TransactionDatabase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.testng.Assert;

/**
 * Created by zakariandys on 28/10/17.
 */
public class MainApp {
    private static WebDriver driver = chromeDriverInit();

    // Initialization chrome web driver
    public static WebDriver chromeDriverInit() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        return new ChromeDriver();
    }

    @Test
    public void testTransactionData() throws Exception {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        // Get all transactions data based on date range
        TransactionDatabase db = new TransactionDatabase();
        List<Transaction> listOfTransactions = db.selectTransactionData("15/08/2016", "30/08/2016");

        // Run test for each transaction data
        SoftAssert Assert = new SoftAssert();
        for (Transaction transaction : listOfTransactions) {
            // Go to the specific page url (transaction page)
            driver.get("https://bukalapak.com/transaction?transaction_id=" + transaction.getTransactionId());

            // Get the element which is want to be tested
            WebElement elTransactionId = driver.findElement(By.id("transaction-id"));
            WebElement elSeller = driver.findElement(By.id("seller-name"));
            WebElement elDelivery = driver.findElement(By.id("delivery-service"));
            WebElement elDateOrder = driver.findElement(By.id("date-order"));
            WebElement elAddress = driver.findElement(By.id("address-shipment"));


            // Check the
            Assert.assertEquals(transaction.getTransactionId(), elTransactionId);
            Assert.assertEquals(transaction.getSellerName(), elSeller);
            Assert.assertEquals(transaction.getDeliveryService(), elDelivery);
            Assert.assertEquals(transaction.getDateOrder(), elDateOrder);
            Assert.assertEquals(transaction.getAddressShip(), elAddress);
        }
        Assert.assertAll();
    }
}
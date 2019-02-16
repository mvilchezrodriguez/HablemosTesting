package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Suma {

    @Parameters({"deviceName", "version", "platformName", "appPackage", "appActivity"})
    @Test
    public void testSuma(String p1,String p2,String p3,String p4,String p5) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver;
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", p1);
        cap.setCapability(CapabilityType.VERSION, p2);
        cap.setCapability("platformName", p3);
        cap.setCapability("appPackage", p4);
        cap.setCapability("appActivity", p5);

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);


//Suma
        driver.findElement(By.id("bt_05")).click();
        driver.findElement(By.id("bt_add")).click();
        driver.findElement(By.id("bt_02")).click();
        driver.findElement(By.id("bt_equal")).click();

        String ResObtenido =driver.findElement(By.id("txtCalc")).getText();
        Assert.assertEquals(ResObtenido,"7");
        driver.quit();



    }
}

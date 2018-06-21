

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidKeyCode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SampleTest {
	public boolean a = true;
    @SuppressWarnings("rawtypes")
	private AndroidDriver driver;

    @SuppressWarnings("rawtypes")
	@Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities  desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("app", "/Users/tanaysinghania/Downloads/uber2.apk");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.0");
        desiredCapabilities.setCapability("deviceName", "Android Emulator");
        desiredCapabilities.setCapability("device", "selendroid");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void a_registerTest_asCustomer() {
    	
      
        MobileElement el3 =(MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "I'M A CUSTOMER")) ;
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("email"));
        el4.sendKeys("helloworld@abc.com");
        MobileElement el5 = (MobileElement) driver.findElement(By.id("password"));
        el5.sendKeys("abcd12345");
        MobileElement el6 = (MobileElement) driver.findElement(By.id("registration"));
        el6.click();
    }
    
    @Test
    public void a_registerTest_asDriver() {
    	
      
        MobileElement el3 =(MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "I'M A DRIVER")) ;
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("email"));
        el4.sendKeys("helloworld2@abc.com");
        MobileElement el5 = (MobileElement) driver.findElement(By.id("password"));
        el5.sendKeys("abcd12345");
        MobileElement el6 = (MobileElement) driver.findElement(By.id("registration"));
        el6.click();
    }
//        MobileElement el1 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SIGN UP")) ;
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElement(By.id("fullname"));
//        el2.sendKeys("Test");
//        MobileElement el3 = (MobileElement) driver.findElement(By.id("username"));
//        el3.sendKeys("Test123");
//        MobileElement el4 = (MobileElement) driver.findElement(By.id("email"));
//        el4.sendKeys("nil"+uuid+"@gmail.com");
//        MobileElement el5 = (MobileElement) driver.findElement(By.id("password"));
//        el5.sendKeys("Test1234");
//        MobileElement el6 = (MobileElement) driver.findElement(By.id("address"));
//        el6.sendKeys("Sample Address");
//        driver.pressKeyCode(AndroidKeyCode.BACK);
//        MobileElement el7 = (MobileElement) driver.findElement(By.id("phone_number"));
//        el7.sendKeys("9999999999");
//        driver.pressKeyCode(AndroidKeyCode.BACK);
//        MobileElement el8 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SIGN UP")) ;
//        el8.click();
//        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
//        el9.click();
//        MobileElement el10 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Ecommerce Shop\"])[3]");
//        el10.click();
    
    @Test// (dependsOnMethods = { "registerTest_asCustomer" })
    public void b_loginTest_asCustomer() throws InterruptedException {
        MobileElement el12 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "I'M A CUSTOMER")) ;
        el12.click();
       // MobileElement el1 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SIGN IN")) ;
        //el1.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("email"));
        el4.sendKeys("helloworld@abc.com");
        MobileElement el5 = (MobileElement) driver.findElement(By.id("password"));
        el5.sendKeys("abcd12345");
        MobileElement el6 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "LOGIN"));
        el6.click();
//        MobileElement el20 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el20.click();
        TimeUnit.SECONDS.sleep(10);
        MobileElement el17 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SETTINGS")) ;
        el17.click();
        MobileElement el8 = (MobileElement) driver.findElement(By.id("name"));
        el8.sendKeys("Hello Customer");
        MobileElement el9 = (MobileElement) driver.findElement(By.id("phone"));
        el9.sendKeys("1234567890");
       
    }

    @Test
    public void ba_loginTest_asDriver() throws InterruptedException {
        MobileElement el12 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "I'M A DRIVER")) ;
        el12.click();
       // MobileElement el1 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SIGN IN")) ;
        //el1.click();
        if(a) {
        MobileElement el4 = (MobileElement) driver.findElement(By.id("email"));
        el4.sendKeys("helloworld2@abc.com");
        MobileElement el5 = (MobileElement) driver.findElement(By.id("password"));
        el5.sendKeys("abcd12345");
        }
        MobileElement el6 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "LOGIN"));
        el6.click();
//        MobileElement el16 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el16.click();
        TimeUnit.SECONDS.sleep(10);
        MobileElement el17 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SETTINGS")) ;
        el17.click();
        MobileElement el4 = (MobileElement) driver.findElement(By.id("name"));
        el4.sendKeys("Hello Driver");
        MobileElement el5 = (MobileElement) driver.findElement(By.id("phone"));
        el5.sendKeys("9876543210");
        
    }

//    @Test
//    public void c_setting_asCustomer() throws InterruptedException {
//    	b_loginTest_asCustomer();
//    	TimeUnit.SECONDS.sleep(10);
//    	MobileElement el12 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SETTINGS")) ;
//        el12.click();
//        MobileElement el4 = (MobileElement) driver.findElement(By.id("name"));
//        el4.sendKeys("Hello Customer");
//        MobileElement el5 = (MobileElement) driver.findElement(By.id("phone"));
//        el5.sendKeys("1234567890");
//        MobileElement el16 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el16.click();
//        
//    }
//    
//    @Test
//    public void c_setting_asDriver() throws InterruptedException, MalformedURLException {
//    	a = false;
//    	b_loginTest_asDriver();
//    	TimeUnit.SECONDS.sleep(5);
//    //	setUp();
//    //	b_loginTest_asDriver();
//    //	TimeUnit.SECONDS.sleep(5);
//    	MobileElement el12 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "SETTINGS")) ;
//        el12.click();
//        MobileElement el4 = (MobileElement) driver.findElement(By.id("name"));
//        el4.sendKeys("Hello Driver");
//        MobileElement el5 = (MobileElement) driver.findElement(By.id("phone"));
//        el5.sendKeys("9876543210");
//        
//    }
//    
    @Test
    public void z_logout() {
    	MobileElement el12 = (MobileElement) driver.findElementByAndroidUIAutomator(String.format("new UiSelector().text(\"%s\")", "LOGOUT")) ;
        el12.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
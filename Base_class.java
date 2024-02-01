package org.Maven_Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver browser_Launch(String w) {

		if (w.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (w.equalsIgnoreCase("firefox")) {

			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("disabel-Notifications");

			driver = new FirefoxDriver(option);
			driver.manage().window().maximize();

		} else if (w.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void url(String s) { // url
		driver.get(s);
	}
	
	public static void screenshot(String s) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File screenshotAs1 = ts1.getScreenshotAs(OutputType.FILE);
		File f1 = new File("E:\\Manish Java\\Demo_Selenium\\src\\TakesScreenshot\\'" + s + ".png");
		FileUtils.copyFile(screenshotAs1, f1);
	}

	public static void select_byindex(int i, WebElement w) {
		Select b = new Select(w);
		b.selectByIndex(i);
		//driver.findElement(By.partialLinkText(null))
	}

	public static void select_byvalue(String i, WebElement w) {
		Select v = new Select(w);
		v.selectByValue(i);
	}

	public static void select_bytext(String i, WebElement w) {
		Select t = new Select(w);
		t.deselectByVisibleText(i);
	}

	public static void action_Demo() {
		// TODO Auto-generated method stub
		Actions a = new Actions(driver);
		a.doubleClick().build().perform();

	}

	public static void robot() throws AWTException {
		// TODO Auto-generated method stub
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void JavascriptExecuter(String s) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scroll(" + s + ")");

	}

	public static void sendeys(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void click(WebElement w) {
		w.click();
	}

	public static void Clear(WebElement w) {
		w.clear();
	}

	public static void Quick() {
		driver.quit();
	}

	public static void Webtable(List<WebElement> w) {
		List<WebElement> data = w;
		for (WebElement webElement : data) {
			String text = webElement.getText();
		}
	}

	public static void simplealert(String s) {
		if (s.equalsIgnoreCase("Accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		} // one alert pending
	}

	public static void promptalert(String s, WebElement w) {
		if (s.equalsIgnoreCase("Accept")) {
			driver.switchTo().alert().accept();
			w.sendKeys(s);
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void framein(int intex) {
		driver.switchTo().frame(intex);
	}

	public static void frameout() {
		driver.switchTo().defaultContent();
	}

	public static void Explicitwait(int i) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(i));
		wait.until(ExpectedConditions.alertIsPresent());

	}

	public static void implicity(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));

	}

}

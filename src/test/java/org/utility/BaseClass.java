package org.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert b;
	public static JavascriptExecutor js;
	public static Select s;
	public static TakesScreenshot ts;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadurl(String url) {
		driver.get(url);

	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void passValues(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void toclick(WebElement element) {
		element.click();
	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();
	}

	public static void Togettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static String toGetWindowHandle() {
		String ref1 = driver.getWindowHandle();
		return ref1;
	}

	public static Set<String> toGetWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public static String toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static void moveToElement(WebElement f) {
		a = new Actions(driver);
		a.moveToElement(f).perform();
	}

	public static void moveToOracle(WebElement r) {
		a.moveToElement(r).perform();

	}

	public static void doubleClick(WebElement d) {
		a = new Actions(driver);
		a.doubleClick(d).perform();
	}

	public static void contextClick(WebElement c) {
		a = new Actions(driver);
		a.contextClick(c).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement des) {
		a = new Actions(driver);
		a.dragAndDrop(src, des);

	}

	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void tab() {

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void simpleAlert() {
		b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
	}

	public static void confirmAlert() {
		b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
	}

	public static void promptAlert() {
		b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.sendKeys("vanitha");
		b.accept();
	}

	public static void executeScriptMethod(String s, WebElement url) {
		js = (JavascriptExecutor) driver;
		js.executeScript(s, url);
		System.out.println(url);
	}

	public static void frame(String url) {
		driver.switchTo().frame(url);
	}

	public static void ToCheckIsMultiple(WebElement element) {
		s = new Select(element);
		if (s.isMultiple()) {
			System.out.println("Multiple Options Can Be Selected");
		}
	}

	public static void PrintAllOptions(WebElement element) {
		s = new Select(element);
		System.out.println(s.getOptions());
	}

	public static void PrintAllSelectedOptions(WebElement element) {
		s = new Select(element);
		System.out.println(s.getAllSelectedOptions());
	}

	public static void PrintFirstSelectedOption(WebElement element) {
		s = new Select(element);
		System.out.println(s.getFirstSelectedOption());
	}

	public static void deselectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void DeselectByValue(WebElement element, String text) {
		s = new Select(element);
		s.deselectByValue(text);
	}

	public static void DeselectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void DeselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public static void Waits() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void fluent() {
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
	}

	public static void alertSendKeys(String text) {
		b = driver.switchTo().alert();
		b.sendKeys(text);
	}

	public static void alertGetText() {
		b.getText();
	}

	public static void toTakeScreenshot() {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
	}

	public static void printParentId() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void printAllWindowId() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}

	public static void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver.switchTo().window(list.get(index));
	}

	public static void printParticularWindowId(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		System.out.println(list.get(index));
	}

	public static void SelectByIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	public static String excelRead(int rowNo, int cellNo) throws IOException {
		// location path
		File f = new File("C:\\Users\\nnanb\\eclipse-workspace\\Sample\\excel\\excel.xlsx");
		// to read file
		FileInputStream fin = new FileInputStream(f);
		// workbook instantiation
		Workbook book = new XSSFWorkbook(fin);
		// to get a sheet from the workbook
		Sheet sh = book.getSheet("sheet1");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		// To check the format 0 or 1-----value==0-number/date value==1----string
		int cellType = c.getCellType();
		String value = "";
		if (cellType == 1) {
			// current cell value is string
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			// current cell value is in date format
			Date d = c.getDateCellValue();
			// dd-mm-yyyy=======24.0.2022
			SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyyy");
			value = sim.format(d);

		} else {
			// current cell value is in number format
			double dd = c.getNumericCellValue();
			long l = (long) dd;// 1234
			value = String.valueOf(l);

		}
		return value;
	}

	public static void screenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\nnanb\\eclipse-workspace\\CucumberTask\\target\\screenshot" + name + ".jpg");
		FileUtils.copyFile(src, des);
	}
	public static void selectByValue(WebElement element, String text) {
		s = new Select(element);
		s.selectByValue(text);
		System.out.println("changed");
	}

}

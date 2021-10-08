package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	            public static WebDriver driver;
	            public static File f;
	            public static Workbook work;

	            public static void getDriver(String url) {
		            WebDriverManager.chromedriver().setup();
		            driver = new ChromeDriver();
		            driver.get(url);
					
				    }

	          
		        public static void maximise() {
		        	driver.manage().window().maximize();
		        }

	          	public static String Titlename() {
			        String title = driver.getTitle();
			        return title;
		        }

		        public static void Sendtext(WebElement element,String data) {
			        element.sendKeys(data);
		        }
		        

				public static WebElement Xpath(String xpath) {
					WebElement element = driver.findElement(By.xpath(xpath));
					return element;
				}
//6
				public static void selectbyAttribute(WebElement element,String data) {
					Select select = new Select(element);
					select.selectByValue(data);
				}	
//7
				public static void selectbyIndex(WebElement element,int i) {
					Select select = new Select(element);
					select.selectByIndex(i);
				}
//8
				public static void selectByText(WebElement element,String data) {
					
					Select select = new Select(element);
					select.selectByVisibleText(data);
				}
//9
				public static String getOptionsText(WebElement element ,int i) {
					Select select = new Select(element);
					List<WebElement> options = select.getOptions();
					WebElement webElement = options.get(i);
					String text = webElement.getText();
					return text;
					
				}
			
//10
				public static void deselectAllOptions(WebElement element) {
					Select select = new Select(element);
				    select.deselectAll();
				}
//11
				public static void deselectByIndex(WebElement element,int i) {
					Select select = new Select(element);
				    select.deselectByIndex(i);
				}
//12
				public static void deselectByText(WebElement element,String data) {
					Select select = new Select(element);
				    select.deselectByVisibleText(data);
				}
//13
				public static void deselectbyAttributeValue(WebElement element, String data) {
					Select select = new Select(element);
				    select.deselectByValue(data);
					
				}
//14
				public static String getAllSelectedOptionsText(WebElement element , int i) {
					Select select = new Select(element);
				    List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
				    WebElement webElement = allSelectedOptions.get(i);
				    String text = webElement.getText();
				    return text;
				}
//15
				public static String getFirstSelectedOptionsText(WebElement element) {
					Select select = new Select(element);
					WebElement firstSelectedOption = select.getFirstSelectedOption();
					String text = firstSelectedOption.getText();
					return text;
				}
//16
				public static boolean checkIsMultiple(WebElement element) {
					Select select = new Select(element);
					boolean multiple = select.isMultiple();
					return multiple;
				}
//17
				public static String CurrentUrl() {
					String currentUrl = driver.getCurrentUrl();
					return currentUrl;
				}
//18
				public static String pageSource() {
					String pageSource = driver.getPageSource();
					return pageSource;
				}
//19
				public static String windowHandle() {
					String windowHandle = driver.getWindowHandle();
					return windowHandle;
				}
//20
				public static Set<String> windowHandles() {
					Set<String> windowHandles = driver.getWindowHandles();
					return windowHandles;
					
				}
//21
				public static void alertAccept() {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}
//22
				public static void alertDismiss() {
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
				}
//23
				public static String alertGetText() {
					Alert alert = driver.switchTo().alert();
					String text = alert.getText();
					return text;
				}
//24
				public static void alertSendText(String data) {
					Alert alert = driver.switchTo().alert();
					alert.sendKeys(data);
				}
//25
				public static void screeShotElement(WebElement element, String  data) throws IOException {
				TakesScreenshot screenshot = element;
					File s = screenshot.getScreenshotAs(OutputType.FILE);
					File d = new File(data);
					FileUtils.copyFile(s, d);
				}
//26
				public static void screenshotDriver(WebDriver driver, String data) throws IOException {
					TakesScreenshot screenshot = (TakesScreenshot) driver;
					File s = screenshot.getScreenshotAs(OutputType.FILE);
					File d = new File(data);
					FileUtils.copyFile(s, d);
				}
//27
				public static void click(WebElement element) {
					
					element.click();
				}
//28
				public static String getattributeValue(WebElement element) {
					String attribute = element.getAttribute("value");
					return attribute;
					
				}
//29
				
//30
				public static void back() {
					driver.navigate().back();
				}
//31
				public static void forward() {
					driver.navigate().forward();
				}
//32
				public static void refresh() {
					driver.navigate().refresh();
				}
//33
				public static void navigateUrl(String Url) {
					driver.navigate().to(Url);
				}
//34
				public static WebElement byId(String id) {
					WebElement findElement = driver.findElement(By.id(id));
					return findElement;
				}
//35
				public static WebElement byName(String name) {
					WebElement findElement = driver.findElement(By.name(name));
					return findElement;
					
				}
					
//36
				public static WebElement byTagName(String tagName) {
					WebElement findElement = driver.findElement(By.tagName(tagName));
					return findElement;
				}
//37
				public static WebElement byLinkText(String linkText) {
					WebElement findElement = driver.findElement(By.linkText(linkText));
					return findElement;
				}
//38
				public static WebElement byClassName(String className) {
					WebElement findElement = driver.findElement(By.className(className));
					return findElement;
				}
//39
				public static  WebElement  byPartialLinkText(String partialLinkText) {
					WebElement findElement = driver.findElement(By.partialLinkText(partialLinkText));
					return findElement;
				}
//40
				
				public static void actionClick(WebElement element) {
					Actions actions = new Actions(driver);
					actions.click(element).perform();
				}
//41
				public static void rightClick(WebElement element) {
					Actions actions = new Actions(driver);
					actions.contextClick(element).perform();
				}
//42
				public static void actiondoubleClick() {
					Actions actions = new Actions(driver);
					actions.doubleClick().perform();
				}
//43
				public static void actiondragAndDrop(WebElement source, WebElement target) {
					Actions actions = new Actions(driver);
					actions.dragAndDrop(source, target).perform();
				}
//44
				public static void actionMove(WebElement target) {
					Actions actions = new Actions(driver);
					actions.moveToElement(target).perform();
				}
//45
				public static void actionText(String text,WebElement element) {
					Actions actions = new Actions(driver);
					actions.sendKeys(element,text).perform();
				}
//46
				public static void setAttribute(String script,WebElement element) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript(script, element);
				}
//47
				public static Object scriptGetAttribute(WebElement element) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					Object attributeText = executor.executeScript("return arguments[0].getAttribute('value')", element);
					return attributeText;
				}
//48
				public static void scrollDown(WebElement element) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].scrollIntoView(true)", element);
				}
//49
				public static void scrollUp(WebElement element) {
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].scrollIntoView(false)", element);
				}

//50
				public static void quit() {
					driver.quit();
				}
//51
				public static void close() {
					driver.close();
				}
				
//52
				public static void switchtoFrame(WebElement frameElement) {
					driver.switchTo().frame(frameElement);
					
				}
//53
			    public static void switchtodefault() {
					driver.switchTo().defaultContent();
				}
//54
				public static void switchtoframe(int index) {
					driver.switchTo().frame(index);
				}
//55
				public static void switchtoframe(String nameOrId) {
					driver.switchTo().frame(nameOrId);
				}
		        public static String getCellvalue(String path,String sheetname,int rowindex,int columnindex) throws IOException {
		            	String text = null;
		            	File f = new File(path);
		            	FileInputStream stream = new FileInputStream(f);
		            	Workbook work = new XSSFWorkbook(stream);
		            	Sheet sheet = work.getSheet(sheetname);
		            	Row row = sheet.getRow(rowindex);
		            	Cell cell = row.getCell(columnindex);
		            	int cellType = cell.getCellType();
		            	if(cellType==1) {
		            		text = cell.getStringCellValue();
		            		return text; }	
		            	else if (cellType==0) {
		            		if (DateUtil.isCellDateFormatted(cell)) {
		            			Date date = cell.getDateCellValue();
		            			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		            			text = dateFormat.format(date);
		            			return text;}
		            			else {
		            				double dd = cell.getNumericCellValue();
		            				long l =(long)dd;
		            				text = String.valueOf(l);
		            				return text;}}
						            return text;}	
		            
				
		        public static void setCellvalue(String path,int rowindex,int columnindex,String value) throws IOException {	
	            	f = new File(path);
	                work = new XSSFWorkbook();
	            	Sheet sheet = work.createSheet();
	            	Row row = sheet.createRow(rowindex);
	            	Cell cell = row.createCell(columnindex);
	            	cell.setCellValue(value);
					
		        }
		        public static void write() throws IOException {
                FileOutputStream stream = new FileOutputStream(f);
                work.write(stream);
				}
		        public static String getConfigData(String pathofConfigFile, String data) throws IOException {
		        	FileReader fileReader = new FileReader(pathofConfigFile);
		    		
		    		Properties properties = new Properties();
		    		properties.load(fileReader);
		    		String string = properties.get(data).toString();
		    		
					return string;
		            
		        	
		        	
		        }
				
				
				
				
				
				
				
				
				
				
				

}

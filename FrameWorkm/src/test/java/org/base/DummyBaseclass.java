package org.base;

import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyBaseclass {
		            public WebDriver driver;
		            public WebElement findElement ;
	//1 
		            public void getDriver(String url) {

		            	WebDriverManager.chromedriver().setup();
		            	driver = new ChromeDriver();
			            driver.get(url);
					
						
					    }
	//2
		            public void Url(String url) {
			        driver.get(url);
		            }
	//3
			        public void maximise() {
				        driver.manage().window().maximize();
			        }
	//4
		          	public String titlename() {
				        String title = driver.getTitle();
				        return title;
			        }
			
	//5
			        public void text(String locator,String element,String data) {
			        	WebElement findelement = locator(locator, element);
				        findelement.sendKeys(data);
			        }
			        
	//6
					public WebElement Xpath(String xpath) {
						WebElement element = driver.findElement(By.xpath(xpath));
						return element;
					}
	//6
					public void selectOptionsByAttribute(String locator,String findelement,String data) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
						select.selectByValue(data);
					}	
	//7
					public void selectOptionsByIndex(String locator,String findelement,int index) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
						select.selectByIndex(index);
					}
	//8
					public void selectOptionsByText(String locator,String findelement,String data) {
						WebElement element = locator(locator, findelement);
						
						Select select = new Select(element);
						select.selectByVisibleText(data);
					}
	//9
					public String getOptionsText(String locator,String findelement ,int i) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
						List<WebElement> options = select.getOptions();
						WebElement webElement = options.get(i);
						String text = webElement.getText();
						return text;
						
					}
	//10
					public void deselectAllOptions(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
					    select.deselectAll();
					}
	//11
					public void deselectOptionsByIndex(String locator,String findelement,int i) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
					    select.deselectByIndex(i);
					}
	//12
					public void deselectOptionsByText(String locator,String findelement,String data) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
					    select.deselectByVisibleText(data);
					}
	//13
					public void deselectOptionsByAttributeValue(String locator,String findelement, String data) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
					    select.deselectByValue(data);
						
					}
	//14
					public String allSelectedOptionsText(String locator,String findelement , int i) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
					    List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
					    WebElement webElement = allSelectedOptions.get(i);
					    String text = webElement.getText();
					    return text;
					}
	//15
					public String firstSelectedOptionsText(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
						WebElement firstSelectedOption = select.getFirstSelectedOption();
						String text = firstSelectedOption.getText();
						return text;
					}
	//16
					public boolean isMultiple(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Select select = new Select(element);
						boolean multiple = select.isMultiple();
						return multiple;
					}
	//17
					public String currentUrl() {
						String currentUrl = driver.getCurrentUrl();
						return currentUrl;
					}
	//18
					public String pageSource() {
						String pageSource = driver.getPageSource();
						return pageSource;
					}
	//19
					public String windowHandle() {
						String windowHandle = driver.getWindowHandle();
						return windowHandle;
					}
	//20
					public Set<String> windowHandles() {
						Set<String> windowHandles = driver.getWindowHandles();
						
						return windowHandles;
						
					}
	//21
					public void alertAccept() {
						Alert alert = driver.switchTo().alert();
						alert.accept();
					}
	//22
					public void alertDismiss() {
						Alert alert = driver.switchTo().alert();
						alert.dismiss();
					}
	//23
					public String alertGetText() {
						Alert alert = driver.switchTo().alert();
						String text = alert.getText();
						return text;
					}
	//24
					public void alertSendText(String data) {
						Alert alert = driver.switchTo().alert();
						alert.sendKeys(data);
					}
	//25
					public void getScreeShotElement(String locator,String findelement, String  data) throws IOException {
						WebElement element = locator(locator, findelement);
					TakesScreenshot screenshot = element;
						File s = screenshot.getScreenshotAs(OutputType.FILE);
						File d = new File(data);
						FileUtils.copyFile(s, d);
					}
	//26
					public void getScreenshotDriver(String data) throws IOException {
						
						TakesScreenshot screenshot = (TakesScreenshot) driver;
						File s = screenshot.getScreenshotAs(OutputType.FILE);
						File d = new File(data);
						FileUtils.copyFile(s, d);
					}
	//27
					public void click(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						element.click();
					}
	//28
					public String getattributeValue(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						String attribute = element.getAttribute("value");
						return attribute;
						
					}
	//29
					public String gettext(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						String text = element.getText();
						return text;
					}
	//30
					public void navigateBack() {
						driver.navigate().back();
					}
	//31
					public void navigateForward() {
						driver.navigate().forward();
					}
	//32
					public void navigateRefresh() {
						driver.navigate().refresh();
					}
	//33
					public void navigateUrl(String Url) {
						driver.navigate().to(Url);
					}
	//34
					public WebElement byId(String id) {
						
						WebElement findElement = driver.findElement(By.id(id));
						return findElement;
					}
	//35
					public WebElement byName(String name) {
						WebElement findElement = driver.findElement(By.name(name));
						return findElement;
						
					}
						
	//36
					public WebElement byTagName(String tagName) {
						WebElement findElement = driver.findElement(By.tagName(tagName));
						return findElement;
					}
	//37
					public WebElement byLinkText(String linkText) {
						WebElement findElement = driver.findElement(By.linkText(linkText));
						return findElement;
					}
	//38
					public WebElement byClassName(String className) {
						WebElement findElement = driver.findElement(By.className(className));
						return findElement;
					}
	//39
					public WebElement  byPartialLinkText(String partialLinkText) {
						WebElement findElement = driver.findElement(By.partialLinkText(partialLinkText));
						return findElement;
					}
	//40
					
					public void actionClick(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Actions actions = new Actions(driver);
						actions.click(element).perform();
					}
	//41
					public void rightClick(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Actions actions = new Actions(driver);
						actions.contextClick(element).perform();
					}
	//42
					public void doubleClick() {
						Actions actions = new Actions(driver);
						actions.doubleClick().perform();
					}
	//43
					public void dragAndDrop(String sourcelocator,String sourcefindelement, String targetlocator,String targetfindelement) {
						WebElement source = locator(sourcelocator, sourcefindelement);
						WebElement target = locator(targetlocator, targetfindelement);
						Actions actions = new Actions(driver);
						actions.dragAndDrop(source, target).perform();
					}
	//44
					public void move(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Actions actions = new Actions(driver);
						actions.moveToElement(element).perform();
					}
	//45
					public void actionText(String text,String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						Actions actions = new Actions(driver);
						actions.sendKeys(element,text).perform();
					}
	//46
					public void textscript(String locator,String findelement,String script) {
						WebElement element = locator(locator, findelement);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						executor.executeScript(script, element);
					}
	//47
					public Object getAttributeScript(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						Object attributeText = executor.executeScript("return arguments[0].getAttribute('value')", element);
						return attributeText;
					}
	//48
					public void scrollDown(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						executor.executeScript("arguments[0].scrollIntoView(true)", element);
					}
	//49
					public void scrollUp(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						JavascriptExecutor executor = (JavascriptExecutor) driver;
						executor.executeScript("arguments[0].scrollIntoView(false)", element);
					}

	//50
					public void quit() {
						driver.quit();
					}
	//51
					public void close() {
						driver.close();
					}
					
	//52
					public void switchtoFrame(String locator,String findelement) {
						WebElement element = locator(locator, findelement);
						driver.switchTo().frame(element);
						
					}
	//53
				    public void switchtodefault() {
						driver.switchTo().defaultContent();
					}
	//54
					public void switchtoframe(int index) {
						driver.switchTo().frame(index);
					}
	//55
					public void switchtoframe(String nameOrId) {
						driver.switchTo().frame(nameOrId);
					}
	//56					            
		            
		            public WebElement locator(String locator,String name) {
		       		        
		      		  if(locator.equals("id")){findElement = driver.findElement(By.id(name));}
		      		  if (locator.equals("name")){findElement = driver.findElement(By.name(name));}
		      		if (locator.equals("class")){findElement = driver.findElement(By.className(name));}
		      		  if (locator.equals("xpath")){findElement = driver.findElement(By.xpath(name));}
		      		  if (locator.equals("tagname")){findElement = driver.findElement(By.xpath(name));}
		      		
		      		     return findElement;
		      		}
		            
		            
	//57            
		            public void switchtoWindow(String name) {
		            	driver.switchTo().window(name);
		            	
					}
	//58	 
		            public String getCellvalue(String path,String sheetname,int rowindex,int columnindex) throws IOException {
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
		            		return text;
		            	                 }	
		            	
		            	else if (cellType==0) {
		            		if (DateUtil.isCellDateFormatted(cell)) {
		            			Date date = cell.getDateCellValue();
		            			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		            			text = dateFormat.format(date);
		            			return text;
		            		}
		            			else {
		            				
		            				double dd = cell.getNumericCellValue();
		            				long l =(long)dd;
		            				text = String.valueOf(l);
		            				return text;
		            			
		            				}
		            		
		            			}
						
						return text;
						
					}	
		            
		            
		            
		            
		            
		            			
		            		}
		            		
		            		
		            		
		            		
		            		
		            		
		            		
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            	
		            
		            
		            
		            
		            
		            
		            
					

	




package org.excel;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WebtablePOM extends BaseClass {
	
	public  WebtablePOM() {
		 
		PageFactory.initElements(driver, this);
	}

	     @FindBys({@FindBy(xpath = "//div[@class='panel panel-primary']"),@FindBy(tagName  = "th")})
	     private List<WebElement> data ;
	   
	     @FindBys({@FindBy(xpath = "//div[@class='panel panel-primary']"),@FindBy(tagName  = "tr"),@FindBy(tagName  = "td") })
		 private List<WebElement> rowsData;
	 

	public List<WebElement> getRowsData() {
		return rowsData;
	}


	public List<WebElement> getData() {
		return data;
	}

	
	

}
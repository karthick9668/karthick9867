package org.frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framework {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		driver.manage().window().maximize();
		
	}
	
public static void Chromebrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();

}
	
	public static void geturl(WebDriver driver,String url) {
		driver.get(url);
	}
		
	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public TargetLocator switchto() {
		
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
			}
		
	
	
	public void quit(WebDriver driver) {
		driver.quit();

	}
		
	public void close(WebDriver driver) {
		driver.close();
		
	}
	
	public String getwindowhandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	
	public Set<String> getwindowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
            return windowHandles;
	}
	
	//webelements interface:
	
	public String gettext(WebElement g) {
		String text = g.getText();
		return text;
	}
	
	
	
	public boolean isDisplayed(WebElement i) {
		boolean displayed = i.isDisplayed();
		return displayed;
		

	}
		
	public boolean isselected(WebElement is) {
		boolean selected = is.isSelected();
		return selected;
		
		
	}
	
	public boolean isenabled(WebElement is) {
		boolean enabled = is.isEnabled();
		return enabled;
		
	}
	
	public String getattribute(WebElement get,String data) {
		String attribute = get.getAttribute(data);
		return attribute;
		

	}
	
	//Navigation:
	
	public void getto(String url) {
		Navigation navigate = driver.navigate();
		navigate.to(url);
		

	}
		
	public void refresh() {
		Navigation navigate = driver.navigate();
		navigate.refresh();
	

	}
	
	public void forward() {
		Navigation navigate = driver.navigate();
		navigate.forward();
		

	}
	
	public void back() {
		Navigation navigate = driver.navigate();
		navigate.back();
		
	}
	
	//alert interface
	
	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

	}
	
	public void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	//dropdown:
	
	public void selectByindex(WebElement se,int index) {
		Select sel = new Select(se);
		sel.selectByIndex(index);
		
	}
	
	public void selectbyvalue(WebElement se,String value) {
		Select sel = new Select(se);
		sel.selectByValue(value);
	}
	
	public void selectbyvisibletext(WebElement se,String text) {
		Select sel = new Select(se);
		sel.selectByVisibleText(text);
		
	}
	
	public List<WebElement> getoptions(WebElement se) {
		Select sel = new Select(se);
		List<WebElement> options = sel.getOptions();
		return options;
		
	}
	
	public boolean ismultiple(WebElement se) {
		Select sel = new Select(se);
		boolean multiple = sel.isMultiple();
		return multiple;
		
	}
	
	public List<WebElement> getallselectedoptions(WebElement se) {
		Select sel = new Select(se);
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		return allSelectedOptions;
		

	}
	
	public WebElement getFirstselectedoption(WebElement se) {
		Select sel = new Select(se);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		return firstSelectedOption;
		

	}
	
	public WebElement findelementbyid(String data) {
		WebElement find = driver.findElement(By.id(data));
		return find;

	}
	
	public WebElement findelementbyname(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
		
		

	}
	
	public void sendkeys(WebElement s,String data) {
		s.sendKeys(data);
		

	}
	
	public static void click(WebElement c) {
		
		c.click();
	}
	
	public String getdatafromexcel(String Sheetname,int row,int cell) throws IOException {
		
		String string=null;
		File excelloc = new File("C:\\Users\\Karthik\\Framework\\Maven\\Excel\\exceldata.xlsx");
		FileInputStream stream = new FileInputStream(excelloc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(Sheetname);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		
		if (type==1) {
			 string = c.getStringCellValue();
			
			if (type==0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("string");
					 string = sim.format(dateCellValue);
					
				}else {
					double d = c.getNumericCellValue();
					long l = (long)d;
					 string = string.valueOf(l);
					
				}
				
			}
			
		}
		return string;
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	}
	
	
		
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	



package org.frame;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junitexe extends Framework {
	
	@BeforeClass
	public static void browsersetup() {
		Chromebrowser();
		geturl(driver, "https://adactinhotelapp.com/");
		String getcurrenturl = getcurrenturl();
		System.out.println(getcurrenturl);
		

	}
	
	@Test
	public void junitcallmethod() throws IOException {
		
		String username = getdatafromexcel("TC_001", 1, 0);
		String password = getdatafromexcel("TC_001", 1, 1);
		String location = getdatafromexcel("TC_002", 1, 0);
		String searchhotel = getdatafromexcel("TC_002", 1, 1);
		String roomtype = getdatafromexcel("TC_002", 1, 2);
		String noofrooms = getdatafromexcel("TC_002", 1, 3);
		String adultsroom = getdatafromexcel("TC_002", 1, 6);
		String childroom = getdatafromexcel("TC_002", 1, 7);
		
		String firstname = getdatafromexcel("TC_003", 1, 0);
		String lastname = getdatafromexcel("TC_003", 1, 1);
		String address = getdatafromexcel("TC_003", 1, 2);
		String creditcardnumber = getdatafromexcel("TC_003", 1, 3);
		String cctype = getdatafromexcel("TC_003", 1, 4);
		String expmonth = getdatafromexcel("TC_003", 1, 5);
		String expyear = getdatafromexcel("TC_003", 1, 6);
		String cvvdata = getdatafromexcel("TC_003", 1, 7);
		
		
		Logindetails loginpage = new Logindetails();
				loginpage.login(username, password);
				
				
				
		
		
		Searchhotell srchhotel = new Searchhotell();
		srchhotel.searchhotel(adultsroom, childroom, searchhotel, noofrooms, location, roomtype);
		
		
		Bookahotel book = new Bookahotel();
		book.bookahotel(address, firstname, lastname, creditcardnumber, cctype, expmonth, expyear, cvvdata);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	}
	
	
	



package org.Maven_Demo;

import java.io.IOException;

import amazon_tas.Amazon_in;

public class Amazon_runnerclass extends Base_class {
	
	public static void main(String[] args) throws IOException {
		
		browser_Launch("Chrome");
		url("https://www.amazon.in/");
		implicity(3000);
		
		Amazon_in ai = new Amazon_in(driver);
		ai.getNav_cs_5().click();
		ai.getIphone().click();
		implicity(3000);
		ai.getCart_iphone().click();
		implicity(2000);
		ai.getClose().click();
		implicity(5000);
		JavascriptExecuter("0,500");
		
		
		ai.getNav_cs_5().click();
		implicity(3000);
		ai.getOneplus().click();
		implicity(2000);
		ai.getCart_iphone().click();
		implicity(3000);
		ai.getClose().click();
		implicity(5000);
		JavascriptExecuter("0,500");
		
		ai.getNav_cs_5().click();
		implicity(3000);
		ai.getIQOO().click();
		implicity(2000);
		ai.getCart_iphone().click();
		implicity(2000);
		ai.getClose().click();
		implicity(5000);
		JavascriptExecuter("0,500");
		
		ai.getNav_cs_5().click();
		ai.getOneplus_11_R().click();
		implicity(2000);
		ai.getCart_iphone().click();
		implicity(2000);
		ai.getClose().click();
		implicity(5000);
		JavascriptExecuter("0,500");
		
		ai.getNav_cs_5().click();
		ai.getHONOR().click();
		implicity(2000);
		click(ai.getHome());
		
//		ai.getCart_iphone().click();
//		implicity(2000);
//		ai.getClose().click();
//		implicity(5000);
//		//JavascriptExecuter("0,500");
//		
		ai.getAllcart().click();
		implicity(2000);
		screenshot("amazon");
		
	}

}
;
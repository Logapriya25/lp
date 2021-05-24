package com.datadriven.framework.Test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.datadriven.framework.base.BaseUI;

public class TestClass extends BaseUI {
	@Test
	public void testOne() throws InterruptedException 
	{

		invokeBrowser("browserName");
		openURL("websiteURL");
		clearText("location_xpath");
		enterText("reqLocation_xpath","Bangalore");
		click("hospital_xpath");
		enterText("hospital_xpath","Hospital");
		Thread.sleep(2000);
		click("select_hospital_xpath");
		click("open_24X7_xpath");
		/*List<WebElement> names = driver.findElements(By.xpath("//div[@data-qa-id='star_rating']/ancestor::div[@data-qa-id='hospital_card']/child::div[@class='c-card']/child::div[@class='pure-g c-card_body u-spacer--bottom-less']/child::div[@class='pure-u-18-24']/child::div[@class='o-media']/child::div[@class='o-media_body u-cushion--right']/child::div[@class='c-card-info']/child::a/child::h2"));
		List<WebElement> listRating = driver.findElements(By.xpath("//span[@class='common_star-rating_value']"));
		int size=listRating.size();
		for(int i=0;i<size;i++)
			{
				Double x=Double.parseDouble(listRating.get(i).getText());
				if(x>3.5)
				{
					System.out.println("done");
					System.out.println(names.get(i).getText());
				}
				
			}*/
		
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[4]/a/div[2]")));
		select.selectByVisibleText("Diagnostics");
		System.out.println("done");
		click("topcities_xpath");
		System.out.println("done");
		List<WebElement> topcitiesname = driver.findElements(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div[3]/ul"));
		for(WebElement topcities:topcitiesname) {
			System.out.println(topcities);
		}
			
		quitBrowser(); 

	}
}

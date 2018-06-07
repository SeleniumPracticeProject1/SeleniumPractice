package com.practiceActiTime.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.handler.codec.http.websocketx.WebSocket00FrameDecoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class YahooCaptureTopTenLinksUnderTrendingDivision {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://in.yahoo.com/");

		String x = "//li[@class='trending-list selected']/ul/li[*]/a/span[2]";
		List<WebElement> list = driver.findElements(By.xpath(x));
		
		int i=1;
		for(WebElement w : list)
		{
			System.out.println(i++ + " " + w.getText());
		}
		
		driver.close();
	}

}

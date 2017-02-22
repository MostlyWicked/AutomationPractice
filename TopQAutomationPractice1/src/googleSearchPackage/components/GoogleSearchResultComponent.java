package googleSearchPackage.components;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import googleSearchPackage.MyAssert;

public class GoogleSearchResultComponent extends AutoComponent {
	
	private String linkXpath;
	
	/**
	 * A specific search result.
	 * 
	 */
	public GoogleSearchResultComponent(WebElement elem) {
		super(elem);
		MyAssert.myAssert(elem.getAttribute("class").equals("rc"), "Error: attempted to create SearchResultComponent with something other than a search result.");
		this.linkXpath = "//div[@data-hveid='" + this.elem.getAttribute("data-hveid") + "']/h3/a";
		
	}
	
	@Override
	public void click(){
		System.out.format("About to click on search result link '%s'.\n",this.getTitle());
		this.elem.findElement(By.xpath(this.linkXpath)).click();
		System.out.println("Clicked on search result link.");
	}
	
	public String getTitle(){
		System.out.println(this.elem.getAttribute("outerHTML"));
		return this.elem.findElement(By.xpath(this.linkXpath + "/span")).getText();
	}

}

package googleSearchPackage.components;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import googleSearchPackage.MyAssert;


public class TextboxComponent extends AutoComponent {

	public TextboxComponent(WebElement elem) {
		super(elem);
		MyAssert.myAssert(elem.getTagName().equals("input"),"Error: attempted to create TextboxComponent out of a WebElement that is not a textbox");
		//TODO: An exception would be preferable, although regular assert doesn't do the job here 	
	}

	public void enterText(String text) {
		System.out.format("About to enter text: \"%s\" into field \"%s\"\n", text, this.getID());
		this.elem.sendKeys(text);
		System.out.println("Text entered successfully.");
		System.out.format("Textbox \"%s\" now reads \"%s\".\n", this.getID(), this.elem.getAttribute("value"));

	}

	public void pressEnter() {
		System.out.format("About to press the return/enter key on field \"%s\".\n", this.getID());
		this.elem.sendKeys(Keys.RETURN);
		System.out.println("Enter/return key pressed.");
	}

	public void pressBack() {
		this.elem.sendKeys(Keys.BACK_SPACE);
	}

	public void pressBack(int x) {
		for (int i = 0; i < x; i++)
			this.pressBack();
	}
}

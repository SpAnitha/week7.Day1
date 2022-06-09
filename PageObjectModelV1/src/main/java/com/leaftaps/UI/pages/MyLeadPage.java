package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class MyLeadPage extends ProjectSpecficMethod {
	public MyLeadPage() {

	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
}

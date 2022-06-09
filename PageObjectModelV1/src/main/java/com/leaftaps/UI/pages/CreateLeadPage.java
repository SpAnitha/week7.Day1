package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class CreateLeadPage extends ProjectSpecficMethod {
	public CreateLeadPage() {

	}
	public CreateLeadPage typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	public CreateLeadPage typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	public CreateLeadPage typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}

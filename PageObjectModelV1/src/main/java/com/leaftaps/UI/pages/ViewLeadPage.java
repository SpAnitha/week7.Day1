package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class ViewLeadPage extends ProjectSpecficMethod{
	public ViewLeadPage() {

	}
	
	public ViewLeadPage verifyLeadId() {
		String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println(leadID);
		return this;
	}
}

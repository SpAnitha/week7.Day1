package com.leaftaps.UI.pages;
import org.openqa.selenium.By;
import com.leaftaps.UI.base.ProjectSpecficMethod;
public class LoginPages extends ProjectSpecficMethod {
	public LoginPages() {

	}
	public LoginPages typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPages typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePages clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePages();
	}
}

package com.qa.demopages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Negativelogin {
	 WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By login  =By.id("login-button");
	
	public Negativelogin(WebDriver driver) {
		this.driver=driver;
	}
	public void user(String Manikanta) {
		driver.findElement(username).sendKeys(Manikanta);
	}
	public void pass(String Somala) {
		driver.findElement(password).sendKeys(Somala);
	}
	public void log() {
		driver.findElement(login).click();
	}

}

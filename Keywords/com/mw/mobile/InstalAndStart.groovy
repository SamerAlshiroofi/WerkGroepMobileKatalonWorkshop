package com.mw.mobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.mobile.driver.MobileDriverType

//import internal.GlobalVariable

public class InstalAndStart {

	DesiredCapabilities dc = new DesiredCapabilities();

	@Keyword
	def startInstalledApplication(String mobileType, Map deviceInformation, String appPackage, String appActivity) {
		dc.setCapability("appPackage", appPackage);
		dc.setCapability("appActivity", appActivity);
		deviceInformation.each{ key, value ->
			dc.setCapability("${key}", "${value}");
		}
		if (mobileType == "Android"){
			AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
		else if (mobileType == "iOS") {
			AppiumDriverManager.createMobileDriver(MobileDriverType.IOS_DRIVER, dc, new URL("http://localhost:4723/wd/hub"));
		}
	}
}

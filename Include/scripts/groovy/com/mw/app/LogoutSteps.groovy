package com.mw.app
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LogoutSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I navigate to the side menu")
	def I_navigate_to_the_side_menu() {
		device_Height = Mobile.getDeviceHeight
		device_Width = Mobile.getDeviceWidth
		int startX = device_Width / 2
		int endX = startX
		int startY = device_Height * 0.30
		int endY = device_Height * 0.70
		Mobile.swipe(startX, startY, endX, endY)
		Mobile.scrollToText('Salves Test app')
		println "swipe and tap"
	}

	@When("I scroll down")
	def I_scroll_downp() {
		Mobile.tap(findTestObject('AppWerkGroep/toolbar/menu button'), 0)
		Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Side menu/MW icon'), 0)
		Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Side menu/Logout'), 0)
		println "verify"
	}

	@And("I tap on Logout button")
	def I_tap_on_Logout_button() {
		Mobile.tap(findTestObject('AppWerkGroep/Side menu/Logout'), 0)
		println "tap"
	}

	@Then("I see login screen")
	def I_see_login_screen() {
		Mobile.waitForElementPresent(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 0)
		println "verify"
	}
}
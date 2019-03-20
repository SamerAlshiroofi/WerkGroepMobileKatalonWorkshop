import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.waitForElementPresent(findTestObject('AppWerkGroep/Cards tab/Cards tab'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/Cards tab'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Dialogs tab/tab dialogs'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Dialogs tab/tab dialogs'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Widgets tab/tab Widgets'), 10, FailureHandling.CONTINUE_ON_FAILURE)

device_Height = Mobile.getDeviceHeight(FailureHandling.CONTINUE_ON_FAILURE)

device_Width = Mobile.getDeviceWidth(FailureHandling.CONTINUE_ON_FAILURE)

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

Mobile.swipe(startX, startY, endX, endY, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/toolbar/contextual menu'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/toolbar/menu button'), 10, FailureHandling.CONTINUE_ON_FAILURE)


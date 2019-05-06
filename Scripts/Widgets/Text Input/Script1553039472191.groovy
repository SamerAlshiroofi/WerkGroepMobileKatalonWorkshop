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

Mobile.tap(findTestObject('AppWerkGroep/Widgets tab/tab Widgets'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 'leuke oefening', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 'leuke oefening', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 'minder leuke oefenin', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('AppWerkGroep/Widgets tab/EditText field'), 'minder leuke oefenin', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)


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

'maakt gebruik van Globale variabelen\r\n'
not_run: Mobile.startApplication(GlobalVariable.app, false, FailureHandling.CONTINUE_ON_FAILURE)

'supreet account Kobiton'
not_run: Mobile.startApplication('kobiton-store:33786', false)

'Samer Salves account Kobiton'
not_run: Mobile.startApplication('kobiton-store:33069', false)

'Samer Salves account iOS App Kobiton'
not_run: Mobile.startApplication('kobiton-store:35028', false)

'Samer Gmail account Kobiton'
not_run: Mobile.startApplication('kobiton-store:v36723', false)

'supreet account iOS App Kobiton'
Mobile.startApplication('kobiton-store:42560', false)

Mobile.waitForElementPresent(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 10, FailureHandling.CONTINUE_ON_FAILURE)

'send key'
Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), '12345678', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), 'qwertyuio', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)


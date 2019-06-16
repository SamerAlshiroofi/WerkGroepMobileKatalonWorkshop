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

//Mobile.closeApplication()

WebUI.openBrowser('https://play-accept.primephonic.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.verifyTextPresent('Home', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Browse', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('My Music', false, FailureHandling.CONTINUE_ON_FAILURE)

'get current url\r\n'
CurrentUrL = WebUI.getUrl(FailureHandling.CONTINUE_ON_FAILURE)

'match current url with expected url\r\n'
WebUI.verifyMatch(CurrentUrL, GlobalVariable.url, false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()


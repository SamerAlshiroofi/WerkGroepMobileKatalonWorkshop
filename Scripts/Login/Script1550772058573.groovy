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
Mobile.startApplication(GlobalVariable.app, false, FailureHandling.CONTINUE_ON_FAILURE)

//if (true) {
//    Mobile.verifyElementNotVisible(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 15, FailureHandling.CONTINUE_ON_FAILURE)
//} else if (true) {
//    Mobile.waitForElementPresent(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 15, FailureHandling.CONTINUE_ON_FAILURE)
//} else {
//    Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), GlobalVariable.UserName, FailureHandling.CONTINUE_ON_FAILURE)
//}

Mobile.waitForElementPresent(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 15, FailureHandling.CONTINUE_ON_FAILURE)

'maakt gebruik van Globale variabelen'
Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), GlobalVariable.UserName, FailureHandling.CONTINUE_ON_FAILURE)

'maakt gebruik van Globale variabelen'
Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), GlobalVariable.Wachtwoord, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 15)

Mobile.clearText(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), 15)

'Herbruik bestaande methode'
Login(GlobalVariable.UserName, GlobalVariable.Wachtwoord)

'send key'
not_run: Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), '4455667889999', FailureHandling.CONTINUE_ON_FAILURE)

'send key'
not_run: Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), 'dasdasdas', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)

'Login methode'

def Login(def userName, def password) {
    Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), GlobalVariable.UserName)

    Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), 'password')
}


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

//not_run: CustomKeywords.'com.mw.mobile.InstallAndStart'(findTestObject(null), '')

'kobiton desired capabilities'
//String kobitonServerUrl = "https://Gmail1:cfb7a268-0eee-485b-89c7-13ac92e489cb@api.kobiton.com/wd/hub";
//DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability("sessionName", "Automation test session");
//capabilities.setCapability("sessionDescription", "Kobiton cloud");
//capabilities.setCapability("deviceOrientation", "portrait");
//capabilities.setCapability("captureScreenshots", true);
//capabilities.setCapability("browserName", "chrome");
//capabilities.setCapability("deviceGroup", "KOBITON");
//capabilities.setCapability("deviceName", "moto z3 play");
//capabilities.setCapability("platformVersion", "8.1.0");
//capabilities.setCapability("platformName", "Android");
//capabilities.setCapability('app', 'kobiton-store:34549')
//AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(kobitonServerUrl))
		
'Samer Salves account Kobiton'
not_run: Mobile.startApplication('kobiton-store:33069', false)

'Samer Gmail account Kobiton'
Mobile.startApplication('kobiton-store:v36723', false)

'supreet account Kobiton'
not_run: Mobile.startApplication('kobiton-store:33786', false)

//if (false) {
//    Mobile.verifyElementNotVisible(findTestObject('AppWerkGroep/Cards tab/Cards tab'), 0, FailureHandling.CONTINUE_ON_FAILURE)
//} else if (true) {
//    WebUI.callTestCase(findTestCase('Test Cases/Log out'), 0)
//} else {
//    Mobile.pressHome()
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

Mobile.pressBack(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 15, FailureHandling.CONTINUE_ON_FAILURE)

'Login methode'

def Login(def userName, def password) {
    Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), userName)

    Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), password)
}


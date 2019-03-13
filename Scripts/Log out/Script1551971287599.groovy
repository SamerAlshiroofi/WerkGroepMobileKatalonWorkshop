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

'voor enkel test alleen\r\n'
Mobile.startApplication('D:\\Mijn Documenten\\Salves\\WerkGroep Mobile\\KatalonAndroidTest\\MwApp.apk', false)

'voor enkel test alleen'
Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/userNameField'), '1234567892', FailureHandling.CONTINUE_ON_FAILURE)

'voor enkel test alleen'
Mobile.sendKeys(findTestObject('AppWerkGroep/LoginScherm/wachtwoordField'), 'dasdasdas', FailureHandling.CONTINUE_ON_FAILURE)

'voor enkel test alleen'
Mobile.pressBack(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'voor enkel test alleen'
Mobile.tap(findTestObject('AppWerkGroep/LoginScherm/LoginButton'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'

// Mobile.swipe(startX, endY, endX, startY)
'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

Mobile.scrollToText('Salves Test app', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/toolbar/menu button'), 0)

Mobile.tap(findTestObject('AppWerkGroep/toolbar/menu button'), 0)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Side menu/MW icon'), 0)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Side menu/Logout'), 0)

Mobile.tap(findTestObject('AppWerkGroep/Side menu/Logout'), 0)

Mobile.waitForElementPresent(findTestObject('AppWerkGroep/LoginScherm/userNameField'), 0)

Mobile.closeApplication()


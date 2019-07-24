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

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Widgets tab/tab Widgets'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Widgets tab/tab Widgets'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Date Picker', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Widgets tab/Calender header - Date Picker'), 5, FailureHandling.CONTINUE_ON_FAILURE)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight(FailureHandling.CONTINUE_ON_FAILURE)

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth(FailureHandling.CONTINUE_ON_FAILURE)

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.70

'Storing the endY value'
int endY = device_Height * 0.30

'Swipe Vertical from bottom to top'

// Mobile.swipe(startX, endY, endX, startY)
'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Widgets tab/DatePickerDay - 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get item\'s label DateHeader'
itemTextTabDialog = Mobile.getText(findTestObject('AppWerkGroep/Widgets tab/DateHeader'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify if item\'s label is equal to "Dialog"'
Mobile.verifyMatch(itemTextTabDialog, 'Ma 1 jul.', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Widgets tab/DatePickerDay - 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get item\'s label DateHeader'
itemTextTabDialog = Mobile.getText(findTestObject('AppWerkGroep/Widgets tab/DateHeader'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify if item\'s label is equal to "Dialog"'
Mobile.verifyMatch(itemTextTabDialog, 'Di 2 jul.', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Widgets tab/DatePickerDay - 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get item\'s label DateHeader'
itemTextTabDialog = Mobile.getText(findTestObject('AppWerkGroep/Widgets tab/DateHeader'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify if item\'s label is equal to "Dialog"'
Mobile.verifyMatch(itemTextTabDialog, 'Wo 3 jul.', false, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject(day), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Get item\'s label DateHeader'
itemTextTabDialog = Mobile.getText(findTestObject('AppWerkGroep/Widgets tab/DateHeader'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Verify if item\'s label is equal to "Dialog"'
Mobile.verifyMatch(itemTextTabDialog, date, false, FailureHandling.CONTINUE_ON_FAILURE)


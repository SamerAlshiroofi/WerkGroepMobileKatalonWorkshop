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

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/Cards tab'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Subtitle here', FailureHandling.CONTINUE_ON_FAILURE)

//Scroll.scrollListToElementWithText(findTestObject('AppWerkGroep/Cards tab/card 2'), 0)
//Scroll.scrollListToElementWithText('Michigan', 1)
Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/card 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/action button 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/action button 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/action button 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.scrollToText('Details here', FailureHandling.CONTINUE_ON_FAILURE)

//Scroll.scrollListToElementWithText(findTestObject('AppWerkGroep/Cards tab/card 2'), 0)
//Scroll.scrollListToElementWithText('Michigan', 1)
Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/card 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/card 4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/card 5'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/favorite button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/share button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Cards tab/bookmark button tegen 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

'Voorbeeld van een Index\r\n'
Mobile.tap(findTestObject('AppWerkGroep/Cards tab/favorite button', [('INDEX') : 2]), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/bookmark button tegen 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/bookmark button tegel 4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/bookmark button tegel 4'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Cards tab/bookmark button tegel 4'), 0, FailureHandling.CONTINUE_ON_FAILURE)


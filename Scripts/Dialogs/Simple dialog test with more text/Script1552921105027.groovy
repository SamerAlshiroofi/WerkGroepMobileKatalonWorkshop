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

Mobile.tap(findTestObject('AppWerkGroep/Dialogs tab/tab dialogs'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Dialogs tab/Simple dialog 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Dialogs tab/PopUp/PopUp TextView'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('AppWerkGroep/Dialogs tab/PopUp/Title popup'), 'A simple dialog', FailureHandling.CONTINUE_ON_FAILURE)

'Extra lange string'
Mobile.verifyElementText(findTestObject('AppWerkGroep/Dialogs tab/PopUp/PopUp TextView'), 'A material metaphor is the unifying theory of a rationalized space and a system of motion.  \nThe material is grounded in tactile reality, inspired by the study of paper and ink, yet technologically advanced and open to imagination and magic.', 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Dialogs tab/PopUp/Button - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Dialogs tab/PopUp/Button - Neutral'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('AppWerkGroep/Dialogs tab/PopUp/Button - Cancel'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('AppWerkGroep/Dialogs tab/PopUp/Button - OK'), 0, FailureHandling.CONTINUE_ON_FAILURE)


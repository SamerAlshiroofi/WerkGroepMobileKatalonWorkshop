
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.Map

import com.kms.katalon.core.testobject.TestObject


def static "com.mw.mobile.InstalAndStart.startInstalledApplication"(
    	String mobileType	
     , 	Map deviceInformation	
     , 	String appPackage	
     , 	String appActivity	) {
    (new com.mw.mobile.InstalAndStart()).startInstalledApplication(
        	mobileType
         , 	deviceInformation
         , 	appPackage
         , 	appActivity)
}

def static "com.mw.mobile.SwipeToElement.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new com.mw.mobile.SwipeToElement()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

def static "com.mw.mobile.SwipeUp.scrolUp"() {
    (new com.mw.mobile.SwipeUp()).scrolUp()
}

def static "com.mw.mobile.SwipeUp.getCurrentSessionMobileDriver"() {
    (new com.mw.mobile.SwipeUp()).getCurrentSessionMobileDriver()
}

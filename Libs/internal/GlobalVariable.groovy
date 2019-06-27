package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object Wachtwoord
     
    /**
     * <p>Profile Kobiton : Samer Salves account Kobiton</p>
     */
    public static Object SamerAndroidApp
     
    /**
     * <p>Profile Kobiton : Supreet Android app</p>
     */
    public static Object SupreetAndroidApp
     
    /**
     * <p>Profile Kobiton : Supreet iOS app</p>
     */
    public static Object SupreetiOSApp
     
    /**
     * <p>Profile Kobiton : Gmail iOS app</p>
     */
    public static Object GmailiOSApp
     
    /**
     * <p></p>
     */
    public static Object app
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            url = selectedVariables['url']
            UserName = selectedVariables['UserName']
            Wachtwoord = selectedVariables['Wachtwoord']
            SamerAndroidApp = selectedVariables['SamerAndroidApp']
            SupreetAndroidApp = selectedVariables['SupreetAndroidApp']
            SupreetiOSApp = selectedVariables['SupreetiOSApp']
            GmailiOSApp = selectedVariables['GmailiOSApp']
            app = selectedVariables['app']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

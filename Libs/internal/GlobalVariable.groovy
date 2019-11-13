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
    public static Object PrimeMWAndroidApp
     
    /**
     * <p></p>
     */
    public static Object PrimeiOSApp
     
    /**
     * <p>Profile Kobiton : KoffieTimeApp</p>
     */
    public static Object Prime7iOS
     
    /**
     * <p>Profile Kobiton : WikiApp Android</p>
     */
    public static Object Prime7WikiAndroid
     
    /**
     * <p>Profile Kobiton : MyMW Android</p>
     */
    public static Object Prime7MyMWApp
     
    /**
     * <p></p>
     */
    public static Object app
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object Wachtwoord
     

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
            SamerAndroidApp = selectedVariables['SamerAndroidApp']
            SupreetAndroidApp = selectedVariables['SupreetAndroidApp']
            SupreetiOSApp = selectedVariables['SupreetiOSApp']
            GmailiOSApp = selectedVariables['GmailiOSApp']
            PrimeMWAndroidApp = selectedVariables['PrimeMWAndroidApp']
            PrimeiOSApp = selectedVariables['PrimeiOSApp']
            Prime7iOS = selectedVariables['Prime7iOS']
            Prime7WikiAndroid = selectedVariables['Prime7WikiAndroid']
            Prime7MyMWApp = selectedVariables['Prime7MyMWApp']
            app = selectedVariables['app']
            UserName = selectedVariables['UserName']
            Wachtwoord = selectedVariables['Wachtwoord']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

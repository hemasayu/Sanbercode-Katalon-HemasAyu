import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.setViewPortSize(GlobalVariable.viewPortWidth, GlobalVariable.viewPortHeight)

WebUI.click(findTestObject('demoblaze/homepage/product_Iphone_6_32gb'))

WebUI.verifyElementText(findTestObject('demoblaze/cart/h2_product_name'), product_iphone_6_32gb)

WebUI.click(findTestObject('demoblaze/cart/add_to_cart_btn'))

if (WebUI.verifyAlertPresent(0) == true) {
    //    WebUI.delay(3)
    //
    //    alertText = WebUI.getAlertText(FailureHandling.OPTIONAL)
    //
    //    WebUI.verifyMatch(alertText, alert_success_add_to_cart, false)
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('demoblaze/homepage/cart_menu_btn'))

WebUI.waitForElementPresent(findTestObject('demoblaze/cart/delete_cart_btn'), 0)

WebUI.verifyElementText(findTestObject('demoblaze/cart/td_Samsung'), product_iphone_6_32gb)


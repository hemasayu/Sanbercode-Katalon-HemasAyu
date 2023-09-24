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

WebUI.callTestCase(findTestCase('TC_demolaze/TC_Add_to_cart/TC_add_one_product'), [('product_iphone_6_32gb') : 'Iphone 6 32gb'
        , ('alert_success_add_to_cart') : 'Product added'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('demoblaze/cart/Place_Order_btn'))

WebUI.verifyElementPresent(findTestObject('demoblaze/purchase_form/h5_Place_order'), 0)

WebUI.click(findTestObject('demoblaze/purchase_form/purchase_btn'))

WebUI.waitForAlert(0)

WebUI.verifyAlertPresent(0)

if (WebUI.verifyAlertPresent(0) == true) {
    alertPurchase = WebUI.getAlertText()

    WebUI.verifyMatch(alertPurchase, alert, false)

    WebUI.acceptAlert()
}

WebUI.click(findTestObject('demoblaze/purchase_form/close_form_btn'))

WebUI.closeBrowser()


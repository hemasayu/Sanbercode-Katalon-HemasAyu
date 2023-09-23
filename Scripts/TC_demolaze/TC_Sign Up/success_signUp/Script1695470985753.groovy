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
import com.github.javafaker.Faker as Faker

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.setViewPortSize(GlobalVariable.viewPortWidth, GlobalVariable.viewPortHeight)

WebUI.click(findTestObject('demoblaze/homepage/signup_menu_btn'))

WebUI.waitForElementPresent(findTestObject('demoblaze/SignUp/h5_signup'), 0)

WebUI.setText(findTestObject('demoblaze/SignUp/input_username'), newUser )

WebUI.setText(findTestObject('demoblaze/SignUp/input_password'), newPassword)

WebUI.click(findTestObject('demoblaze/SignUp/signup_btn'))

if (WebUI.verifyAlertPresent(0) == true) {
    alertSuccess = WebUI.getAlertText()

    WebUI.verifyMatch(alertSuccess, registerSuccess, false)

    WebUI.acceptAlert()
}

WebUI.refresh()


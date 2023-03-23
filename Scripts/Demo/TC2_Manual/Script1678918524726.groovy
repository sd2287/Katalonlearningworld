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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Manual_Repo/BookAppointment'))

WebUI.sendKeys(findTestObject('Manual_Repo/username'), 'John Doe')

WebUI.sendKeys(findTestObject('Manual_Repo/password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Manual_Repo/loginbutton'))

WebUI.click(findTestObject('Manual_Repo/radiobutton_re-admission'))

WebUI.click(findTestObject('Manual_Repo/healthcareprogram'))

WebUI.sendKeys(findTestObject('Manual_Repo/date'), '20/02/2022')

WebUI.sendKeys(findTestObject('Manual_Repo/appointment_commentbox'), 'Testing')

WebUI.click(findTestObject('Manual_Repo/confirmappointment'))

String Actualtext = WebUI.getText(findTestObject('Manual_Repo/facilitytextverify'))

String ExpectedTest = 'Tokyo CURA Healthcare Center'

if (Actualtext.equalsIgnoreCase(ExpectedTest)) {
    println('Text Matched')
}

WebUI.click(findTestObject('Manual_Repo/homebutton'))

WebUI.closeBrowser()


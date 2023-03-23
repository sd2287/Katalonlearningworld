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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

OrangeHRMtitle = WebUI.getWindowTitle()

String FirstName = 'TestUser'

String LastName = '1008'

String utext = WebUI.getText(findTestObject('OrangeHRM/LoginPage_Functionality/username_text'))

String[] utext1 = utext.split(' : ')

String username = utext1[1]

println(username)

String ptext = WebUI.getText(findTestObject('OrangeHRM/LoginPage_Functionality/password_text'))

String[] ptext1 = ptext.split(' : ')

String password = ptext1[1]

println(password)

WebUI.setText(findTestObject('OrangeHRM/LoginPage_Functionality/Username'), username)

WebUI.setText(findTestObject('OrangeHRM/LoginPage_Functionality/Password'), password)

WebUI.click(findTestObject('OrangeHRM/LoginPage_Functionality/Loginsubmit'))

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/PIM_tab'))

WebUI.click(findTestObject('OrangeHRM/reusableobjects/Add User'))

WebUI.setText(findTestObject('OrangeHRM/PIM_Functionality/Add_Employee/Employee_Firstname'), FirstName)

WebUI.setText(findTestObject('OrangeHRM/PIM_Functionality/Add_Employee/Employee_Lastname'), LastName)

WebUI.setText(findTestObject('OrangeHRM/PIM_Functionality/Add_Employee/EmployeeID'), LastName)

WebUI.click(findTestObject('OrangeHRM/reusableobjects/Save'))

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/PIM_tab'))

String EmployeeName = (FirstName + ' ') + LastName

WebUI.setText(findTestObject('OrangeHRM/PIM_Functionality/Search_Employee/EmployeeName'), EmployeeName)

WebUI.click(findTestObject('OrangeHRM/reusableobjects/Search User'))

String EmpID = WebUI.getText(findTestObject('OrangeHRM/PIM_Functionality/Search_Employee/Search_EmployeeID'))

println(EmpID)

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/Edit_Employee'))

not_run: WebUI.click(findTestObject('null'))

not_run: WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/Employee_AdditionalDetails/Nationality_American'))

WebUI.click(findTestObject('Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/Employee_AdditionalDetails/Nationality_American'))

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/Employee_AdditionalDetails/MaritalStatus_dropdown'))

WebUI.click(findTestObject('OrangeHRM/PIM_Functionality/Employee_AdditionalDetails/MatitalStatus_Married'))

WebUI.click(findTestObject('OrangeHRM/reusableobjects/Save'))


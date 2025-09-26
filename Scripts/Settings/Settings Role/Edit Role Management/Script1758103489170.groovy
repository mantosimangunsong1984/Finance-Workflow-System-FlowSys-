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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// Login & navigasi
WebUI.callTestCase(findTestCase('Login/Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/Settings Role/Edit Setting Role/Page_FlowSys/Btn_Menu_Setting'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys My Approval/a_Setting-Role'))

WebUI.click(findTestObject('Setting/Settings Role/View Detail User Mapping/Page_FlowSys/a_UAT User_Mapping_Detail'))

WebUI.click(findTestObject('Setting/Settings Role/View Detail User Mapping/Page_FlowSys/Btn_Assign User_UATUser'))

// buka dropdown
WebUI.click(findTestObject('Setting/Settings Role/View Detail User Mapping/Page_FlowSys/span_Select User_AssignUser_2'))

// definisikan opsi user (gunakan contains agar lebih aman)
TestObject pilihUser = new TestObject('UserOption')

pilihUser.addProperty('xpath', ConditionType.EQUALS, '//li[contains(@class,\'select2-results__option\') and contains(text(),\'Manto\')]')

// tunggu sampai opsi terlihat
WebUI.waitForElementVisible(pilihUser, 5)

// klik user
WebUI.click(pilihUser)

WebUI.click(findTestObject('Setting/Settings Role/View Detail User Mapping/Page_FlowSys/button_Assign_UserMapping'))

WebUI.click(findTestObject('Setting/Settings Role/View Detail User Mapping/Page_FlowSys/button_YES_Confirm_AssignUser'))

// screenshot hasil
WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


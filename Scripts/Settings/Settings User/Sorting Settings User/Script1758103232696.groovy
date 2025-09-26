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

WebUI.callTestCase(findTestCase('Login/Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Setting/Settings Role/Edit Setting Role/Page_FlowSys/Btn_Menu_Setting'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/a_Setting_USer_Sub-Menu'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th__sorting_Name'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th_sorting_Name'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th_sorting_Role'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th_sorting_Status'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th_sorting_LastLogin'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/th_sorting_Actions'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/i_Next'))

WebUI.click(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/i_Back'))

WebUI.selectOptionByLabel(findTestObject('Setting/Settings User/Page_FlowSys Purchase Invoices Upload History/select_Showentries__Setting-User'), 
    '100', false)

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Approvals/My Approval/Page_FlowSys Purchase Invoices Upload History/Btn_Approvals'))

WebUI.click(findTestObject('Approvals/My Approval/a_My-Approvals'))

WebUI.selectOptionByLabel(findTestObject('Approvals/My Approval/select_Showentries_My-Approval'), '50', false)

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/input_Search_check_all-My-Approval'))

WebUI.click(findTestObject('Approvals/My Approval/input_Search_check_all-My-Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/th_Sorting_Date-Submitted_My-Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/th_Sorting_Vendor-Name_My-Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/th_Sorting_Description_My-Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/th_Sorting_Amount_My-Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Approvals/My Approval/th_Sorting_Status_My-Approval'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


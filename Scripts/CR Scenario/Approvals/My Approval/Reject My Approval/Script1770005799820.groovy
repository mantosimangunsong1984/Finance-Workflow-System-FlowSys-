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

WebUI.click(findTestObject('Approvals/My Approval/Page_FlowSys My Approval/a_INV-CR-000901'))

WebUI.click(findTestObject('Approvals/Sample Approve My Approval/Page_FlowSys Purchase Invoice Detail/button_Reject_MyApproval'))

WebUI.setText(findTestObject('Approvals/Sample Approve My Approval/Page_FlowSys Purchase Invoice Detail/textarea_Notes_ApprovePurchaseInvoice'), 
    'REJECTED : MISSING FILES')

WebUI.takeFullPageScreenshot()

WebUI.delay(2)

WebUI.closeBrowser()


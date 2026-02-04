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

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys/a_Purchase_Invoice'))

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys/a_Purchase_Invoice_List'))

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys Purchase Invoices/PIL_Draft'))

WebUI.setText(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys Purchase Invoices/input_search_Draft'), 
    'INV-HJ-041')

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys Purchase Invoices/input_Draft_Check_All'))

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys Purchase Invoices/button_Submit Selected_Draft'))

WebUI.selectOptionByValue(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Submit For Approval/Page_FlowSys Purchase Invoices/select__workflow_Approval-Routing_Submit for Approvel'), 
    '4', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Submit For Approval/Page_FlowSys Purchase Invoices/Notes_Submit for Approval'), 
    'OK DARI MANTO')

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Submit For Approval/Page_FlowSys Purchase Invoices/button_Submit for Approvel'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_Draft/Page_FlowSys Purchase Invoices/PIL_ALL'))

WebUI.setText(findTestObject('Purchase Invoice/Purchase Invoice List/PIL_ALL/Page_FlowSys Purchase Invoices/input_search_ALL'), 
    'INV-HJ-031')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


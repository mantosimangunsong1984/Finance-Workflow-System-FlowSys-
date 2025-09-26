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

WebUI.delay(3)

WebUI.click(findTestObject('Setting/Document Type/Page_FlowSys/Btn_Document-Type-Sub_Menu'))

WebUI.click(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/Btn_Active_Edit_OTH5'))

WebUI.setText(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/input_Code_EditDocumentType'), 
    'OTH8910')

WebUI.setText(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/input_Name_EditDocumentType'), 
    'OTH88')

WebUI.setText(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/textarea_Description_EditDocumentType'), 
    'EDIT NAMA JADI OTH8910')

WebUI.click(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/button_Save_EditDocumentType'))

WebUI.click(findTestObject('Setting/Document Type/Edit Document Type/Page_FlowSys Purchase Invoices Upload History/button_Confirm_Yes'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


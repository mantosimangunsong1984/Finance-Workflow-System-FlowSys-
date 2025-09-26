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

WebUI.click(findTestObject('Setting/Workflow Setup/Page_FlowSys Purchase Invoices Upload History/Btn_Workflow-Setup'))

WebUI.click(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/button_Add_Workflow Setup'))

WebUI.setText(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/input__approval_routing_name'), 'TESTUAT999')

WebUI.selectOptionByLabel(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/select_Reminder-Enabled'), 
    'No', false)

WebUI.setText(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/input_Minimum-Amount'), '1000000')

WebUI.setText(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/input_Maximum-Amount'), '20000000')

WebUI.setText(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/Input_Description'), 'Device IT')

WebUI.selectOptionByLabel(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/select_Status'), 'Active', 
    false)

WebUI.click(findTestObject('Setting/Workflow Setup/Page_FlowSys Workflow Setup/button_Save_AddWorkflowSetup'))

WebUI.click(findTestObject('Setting/Workflow Setup/Edit Workflow Setup/Add Approval Routing/Page_FlowSys Workflow Setup/button_YES_Confirmation_AddWorkflowSetup'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


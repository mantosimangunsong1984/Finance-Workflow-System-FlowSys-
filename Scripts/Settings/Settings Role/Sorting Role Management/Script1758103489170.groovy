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

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys My Approval/a_Setting-Role'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/th_Sorting_Role-ID'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/th_Sorting_Role-Name'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/th_Sorting_User-Mapping'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/th_Sorting_Menu-Mapping'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/th_Sorting_Action'))

WebUI.selectOptionByLabel(findTestObject('Setting/Settings Role/Page_FlowSys/select_Showentries_Settings-Role'), '50', false)

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/Btn_Next'))

WebUI.click(findTestObject('Setting/Settings Role/Page_FlowSys/Btn_Back'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()


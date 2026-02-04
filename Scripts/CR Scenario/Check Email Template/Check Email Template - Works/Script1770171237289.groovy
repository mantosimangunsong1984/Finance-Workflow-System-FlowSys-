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
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*

// ==============================
// CONFIG
// ==============================
String outlookUrl = 'https://outlook.office.com/mail/'

String emailSubject = 'INV-TESTREGRES-00900014'

// ==============================
// OPEN OUTLOOK WEB
// ==============================
openBrowser('')

navigateToUrl(outlookUrl)

maximizeWindow()

// ==============================
// SEARCH EMAIL
// ==============================
TestObject searchBox = findTestObject('Email/Page_Mail - Manto - Outlook/input_topSearchInput')

waitForElementVisible(searchBox, 30)

setText(searchBox, 'One IT [Finance Workflow System] Purchase Invoice Fully Approved - ' + emailSubject)

sendKeys(searchBox, Keys.chord(Keys.ENTER))

// ==============================
// CLICK EMAIL BY SUBJECT
// ==============================
TestObject emailItem = new TestObject('dynamicEmailSubject')

emailItem.addProperty('xpath', ConditionType.EQUALS, "//span[contains(text(),'$emailSubject')]")

waitForElementClickable(emailItem, 30)

click(emailItem)

// ==============================
// WAIT EMAIL CONTENT OPEN
// ==============================
TestObject emailBody = new TestObject('emailBody')

emailBody.addProperty('xpath', ConditionType.EQUALS, '//div[@role=\'document\']')

waitForElementVisible(emailBody, 30)

WebUI.delay(2)

// ==============================
// SCREENSHOT
// ==============================
takeFullPageScreenshot()

WebUI.delay(2)

// ==============================
// CLOSE BROWSER
// ==============================
closeBrowser()


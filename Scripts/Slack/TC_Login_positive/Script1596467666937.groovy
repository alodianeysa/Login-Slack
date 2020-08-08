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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('www.slack.com')

WebUI.verifyMatch(WebUI.getUrl(), 'https://slack.com/intl/en-id/', false)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Slack/Logo'), 0)

WebUI.click(findTestObject('Slack/Sign_in'))

WebUI.delay(2)

WebUI.setText(findTestObject('Slack/Field Text'), 'sekolahqa4')

WebUI.click(findTestObject('Slack/Btn_Continue'))

WebUI.verifyElementPresent(findTestObject('Slack/Txt_sekolahqa4'), 0)

WebUI.setText(findTestObject('Slack/Field Text_email Login'), 'nurivahalodia0001@gmail.com')

WebUI.setEncryptedText(findTestObject('Slack/Field Text_pass Login'), 'O4je174kpW+idHpk4X1AGA==')

WebUI.click(findTestObject('Slack/Btn_Signin'))


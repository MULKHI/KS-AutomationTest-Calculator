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

Mobile.comment('Story: do calculation 10 plus 2 multiplication 5')

Mobile.comment('Given that user has started an application')

Mobile.startApplication('MobileApp/Calculator_v8.1.apk', false)

Mobile.comment('When user do Calculation')

Mobile.tap(findTestObject('Mobile/Button_1'), 0)

Mobile.tap(findTestObject('Mobile/Button_0'), 0)

Mobile.tap(findTestObject('Mobile/Button_Plus'), 0)

Mobile.tap(findTestObject('Mobile/Button_2'), 0)

Mobile.tap(findTestObject('Mobile/Button_Multiplication'), 0)

Mobile.tap(findTestObject('Mobile/Button_5'), 0)

Mobile.getText(findTestObject('TextView_TCC_01'), 0)

Mobile.comment('Then user should see the result')

Mobile.tap(findTestObject('Mobile/Button_Result'), 0)

Mobile.getText(findTestObject('TextView_Result_TCC_01'), 0)

Mobile.takeScreenshotAsCheckpoint('screenshot', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


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

Mobile.waitForElementPresent(findTestObject('Medicine Menu/ChooseMedicine/titleview_MedicineType'), 0)

Mobile.takeScreenshot('ChooseMedicine.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Medicine Menu/ChooseMedicine/txtview_ProductName6'), 0)

Mobile.tap(findTestObject('Medicine Menu/ChooseMedicine/btn_AddMedicineDet'), 0)

Mobile.takeScreenshot('MedicineDetail.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Aturan pakai', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Medicine Menu/ChooseMedicine/btn_CloseDetailMed'), 0)

Mobile.swipe(10, 10, 20, 240)

Mobile.takeScreenshot('AfterChooseMedicine.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Medicine Menu/ChooseMedicine/btn_Cart'), 0)


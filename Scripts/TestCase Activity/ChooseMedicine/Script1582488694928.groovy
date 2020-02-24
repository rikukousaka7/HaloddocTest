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

def titleMedicineType = findTestObject('Medicine Menu/ChooseMedicine/titleview_MedicineType')

def Item6 = findTestObject('Medicine Menu/ChooseMedicine/txtview_ProductName6')

def btnAddItem = findTestObject('Medicine Menu/ChooseMedicine/btn_AddMedicineDet')

def btnClose = findTestObject('Medicine Menu/ChooseMedicine/btn_CloseDetailMed')

def btnCart = findTestObject('Medicine Menu/ChooseMedicine/btn_Cart')

Mobile.waitForElementPresent(titleMedicineType, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\ChooseMedicine.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(Item6, 0)

Mobile.tap(btnAddItem, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\MedicineDetail.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Aturan pakai', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnClose, 0)

Mobile.swipe(0, 0, 20, 240)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\AfterChooseMedicine.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnCart, 0)


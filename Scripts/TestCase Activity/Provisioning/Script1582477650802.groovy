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

def TitleNomorPonsel = findTestObject('Provisioning/txtview_NomorPonsel')

def BtnInputNumber = findTestObject('Provisioning/edittxt_NomorPonsel')

def InsertNumber = findTestObject('Provisioning/edittxt_PhoneNumVerif')

def btnVerif = findTestObject('Provisioning/btn_Verif')

Mobile.startApplication(GlobalVariable.APK, false)

Mobile.waitForElementPresent(TitleNomorPonsel, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\OpenApps.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(BtnInputNumber, 0)

Mobile.hideKeyboard()

Mobile.setText(InsertNumber, GlobalVariable.PhoneNum, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\Provisioning.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnVerif, 0)


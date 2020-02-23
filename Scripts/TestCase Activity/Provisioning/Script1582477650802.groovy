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

Mobile.startExistingApplication('C:\\Users\\admin\\Documents\\Prepare for New Job\\halodoc\\Halodoc Doctors Medicine Appointments_v6.600_apkpure.com.apk', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Provisioning/txtview_NomorPonsel'), 0)

Mobile.tap(findTestObject('Provisioning/edittxt_NomorPonsel'), 0)

Mobile.waitForElementPresent(findTestObject('Provisioning/titletxt_InsertNumber'), 0)

Mobile.setText(findTestObject('Provisioning/edittxt_PhoneNumVerif'), '081239301331', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Provisioning/btn_TermNCond'), 0)

Mobile.waitForElementPresent(findTestObject('Provisioning/titleview_TermNCond'), 0)

Mobile.tap(findTestObject('Provisioning/btn_BackTermView'), 0)

Mobile.tap(findTestObject('Provisioning/btn_Verif'), 0)


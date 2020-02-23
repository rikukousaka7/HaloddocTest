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

Mobile.waitForElementPresent(findTestObject('Medicine Menu/CartAndPayment/titleview_Keranjang'), 0)

Mobile.waitForElementPresent(findTestObject('Medicine Menu/CartAndPayment/btn_ItemCart1'), 0)

Mobile.waitForElementPresent(findTestObject('Medicine Menu/CartAndPayment/txtview_CurrentAddress'), 0)

Mobile.tap(findTestObject('Medicine Menu/CartAndPayment/btn_ContinueOrder'), 0)

Mobile.waitForElementPresent(findTestObject('Medicine Menu/CartAndPayment/titleview_Payment'), 0)

Mobile.waitForElementPresent(findTestObject('Medicine Menu/CartAndPayment/txtview_TotalPrice'), 0)

Mobile.tap(findTestObject('Medicine Menu/CartAndPayment/btn_GopayPayment'), 0)

Mobile.tap(findTestObject('Medicine Menu/btn_Back'), 0)

Mobile.tap(findTestObject('Medicine Menu/CartAndPayment/btn_MoreOption'), 0)

Mobile.tap(findTestObject('Medicine Menu/CartAndPayment/btn_EmptyCart'), 0)

Mobile.tap(findTestObject('Medicine Menu/btn_Back'), 0)

Mobile.tap(findTestObject('Medicine Menu/btn_Back'), 0)


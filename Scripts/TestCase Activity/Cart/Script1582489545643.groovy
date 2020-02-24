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

def titleCart = findTestObject('Medicine Menu/CartAndPayment/titleview_Keranjang')

def Item1 = findTestObject('Medicine Menu/CartAndPayment/btn_ItemCart1')

def currentAddress = findTestObject('Medicine Menu/CartAndPayment/txtview_CurrentAddress')

def btnContinue = findTestObject('Medicine Menu/CartAndPayment/btn_ContinueOrder')

def titlePayment = findTestObject('Medicine Menu/CartAndPayment/titleview_Payment')

def totalPrice = findTestObject('Medicine Menu/CartAndPayment/txtview_TotalPrice')

def btnGopay = findTestObject('Medicine Menu/CartAndPayment/btn_GopayPayment')

def btnMoreOption = findTestObject('Medicine Menu/CartAndPayment/btn_MoreOption')

def btnEmpty = findTestObject('Medicine Menu/CartAndPayment/btn_EmptyCart')

def btnBack = findTestObject('Medicine Menu/btn_Back')

Mobile.waitForElementPresent(titleCart, 0)

Mobile.waitForElementPresent(Item1, 0)

Mobile.waitForElementPresent(currentAddress, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\CartDetail.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnContinue, 0)

Mobile.waitForElementPresent(titlePayment, 0)

Mobile.waitForElementPresent(totalPrice, 0)

Mobile.takeScreenshot('C:\\Users\\admin\\git\\HaloddocTest\\CaptureImage\\Payment.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnGopay, 0)

Mobile.tap(btnBack, 0)

Mobile.tap(btnMoreOption, 0)

Mobile.tap(btnEmpty, 0)

Mobile.tap(btnBack, 0)

Mobile.tap(btnBack, 0)


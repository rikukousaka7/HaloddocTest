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

def btnMore = findTestObject('Dashboard/btn_More')
def btnLogout = findTestObject('Logout/btn_Logout')
def titleLogout = findTestObject('Logout/txtview_LogoutTitle')
def btnYes = findTestObject('Logout/btn_Yes')

Mobile.tap(btnMore, 0)

Mobile.takeScreenshot('MoreMenu.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnLogout, 0)

Mobile.waitForElementPresent(titleLogout, 0)

Mobile.takeScreenshot('LogoutConfirm.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(btnYes, 0)

Mobile.takeScreenshot('AfterLogout.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/flx/warn/?u=https%3A%2F%2Fkatalon-demo-cura.herokuapp.com%2F%3Ffbclid%3DIwAR2FPHNSQBq6aZhGIJAUI9jcZiECVyjDHmtgsJMD4m2CQlh0rFYQ86rpaIQ&h=AT1ljVsmlbI29jnWBFika5VCGw3xYQIz4nJpETV4RlyUFSvDN6eJmjNd1oaupaB3iAaIDBVjfNtrHzQIJks-hDdtLOeIHcL-6QMnsqS7_CPIhpUIxq8qn3AkyFk2VzK6uKn53I74WzHR4BqMjwiTe5eCHVuTobRchyR4s33jdf0cKF-rH0Z65mP4sag9Dg6KcE_yTLuy8Iok_O5oV9LSQRNwDn-pLEIJTN1y_jbAccr3CUd9ECT7nhDlSzFGM0FxZZ83i9YE-_NbtIZ2dsmXHkvyVPCv2yzDN4kIie7U6GEJQUlaQg')

WebUI.click(findTestObject('Object Repository/TC-006/Page_ang ri khi Facebook/a_Truy cp vo lin kt'))

WebUI.click(findTestObject('Object Repository/TC-006/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/TC-006/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/TC-006/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/TC-006/Page_CURA Healthcare Service/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/TC-006/Page_CURA Healthcare Service/button_Login'))

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 30)

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), '"Make Appointment"')

WebUI.closeBrowser()


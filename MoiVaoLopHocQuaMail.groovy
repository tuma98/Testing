import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'darkest158@gmail.com')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'FWtW+Qi/v8/rGa4uwARoGQ==')

WebUI.delay(2)

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_TestClass'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/i_Thng bo_fa fa-lg fa-bars'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Danh sch ngi hc'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/button_Gi thng bo mi tham gia lp'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/textarea_Nhp danh sch email (mi email trn 1 dng)_form-control ng-untouched ng-dirty ng-valid'), 
    'darkest158@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ni dung thng bo_btn btn-primary'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_Hc liu - Sch Mm/div_Gi thng bo thnh cng'), 0)

WebUI.getText(findTestObject('Page_Hc liu - Sch Mm/div_Gi thng bo thnh cng'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Gi thng bo thnh cng'))

WebUI.delay(2)

WebUI.closeBrowser()


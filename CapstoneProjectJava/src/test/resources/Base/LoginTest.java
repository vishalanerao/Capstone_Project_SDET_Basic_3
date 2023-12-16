
public class LoginTest {
	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataReader.class)
	public void loginTest(String username, String password, String expectedTitle) {
		// Test login functionality
	}

	@DataProvider(name = "loginData")
	public Object[][] loginDataProvider() {
		return new ExcelDataReader().readData("loginData.xlsx");
	}
}

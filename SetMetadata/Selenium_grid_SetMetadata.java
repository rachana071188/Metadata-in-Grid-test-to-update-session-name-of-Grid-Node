public class Selenium_grid_SetMetadata {
	WebDriver driver;
	
	@Test
	public void test1() throws MalformedURLException {
		ChromeOptions fos=new ChromeOptions();
		fos.setCapability("se:name", "My simple test"); 
		
    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://172.19.16.1:4444"), fos);

  
    Capabilities capabilities = driver.getCapabilities();
    System.out.println("Capabilities: " + capabilities);
    String sessionName = (String) capabilities.getCapability("se:name");
    System.out.println("Session Name: " + sessionName);
    driver.get("https://www.flipkart.com");
	
}
}

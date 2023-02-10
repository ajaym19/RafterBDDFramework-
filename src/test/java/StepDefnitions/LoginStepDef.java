package StepDefnitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	WebDriver driver;
	
	@Before
	public void beforeHooks() {
		System.out.println("Before Hooks");
	}
	
	@After
	public void afterHooks() {
		System.out.println("After Hooks");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username")
	public void user_enters_username() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@When("^user enters username as (.+) and password as (.+)$")
	public void user_enters_username_as_and_password_as(String username, String password) throws Throwable {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("the tile of the page should be OrangeHRM")
	public void validate_Title() {
		System.out.println(driver.getTitle());
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		driver.close();
	}
}

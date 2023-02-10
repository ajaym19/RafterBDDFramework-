package StepDefnitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableDemo {

	@Given("user has logged in")
	public void user_has_logged_in() {
		System.out.println("User has logged in");
	}

	@When("user selects a product and add to cart")
	public void user_selects_a_product_and_add_to_cart(io.cucumber.datatable.DataTable dataTable) {
		List<String> productName = dataTable.asList();
		for (String element : productName) {
			System.out.println(element);
		}
	}

	@When("user checkouts")
	public void user_checkouts() {
		System.out.println("User checkout");
	}

	@Then("Order should be placed successfully")
	public void order_should_be_placed_successfully() {
		System.out.println("Order placed");
	}

}

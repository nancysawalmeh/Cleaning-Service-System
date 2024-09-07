package Test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.ProdectSteps;

public class prodect {
	ProdectSteps p=new ProdectSteps();
	@Given("that I am on the carpet page")
	public void that_i_am_on_the_carpet_page() {
			System.out.println("");
			System.out.println("Welcome To Product Information Page   ");

	}

	@When("I view the product information section")
	public void i_view_the_product_information_section() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter 1 to view carpet information or 2 to enter cover information  ");
		int a = sc.nextInt();
		if (a == 1 ) {
			p.carpetpage();
		}
		else if(a == 2) {

			p.coverpage();
		}
		else {
            System.out.println("Invalid choice, please try again");
			int b = sc.nextInt();
			if (b == 1 ) {
				p.carpetpage();
			}
			else if(b == 2) {
				p.coverpage();
			}

		}
	}
	


	

	@Then("I should see the following details:")
	public void i_should_see_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> productinformation = dataTable.asMaps(String.class, String.class);
	    for (Map<String, String> detail : productinformation) {
	      String Name = detail.get("name");
	      String expectedValue = detail.get("Oriental Rug ");
	      String actualValue = p.getName();
	      assertEquals(expectedValue, actualValue);


	      String Picture  = detail.get("image");
	      String expectedValue1 = detail.get("Carpet Image ");
	      String actualValue1 = p.getPicture();
	      assertEquals(expectedValue1, actualValue1);
	      
	      String Description  = detail.get("Description");
	      String expectedValue2 = detail.get("Handmade Polyester Rug ");
	      String actualValue2 = p.getDescriptions();
	      assertEquals(expectedValue2, actualValue2);
	      
	     
	      String Material  = detail.get("Material");
	      String expectedValue4 = detail.get("100% Polyester  ");
	      String actualValue4 = p.getMaterial();
	      assertEquals(expectedValue4, actualValue4);
	      
	      String Cleaning  = detail.get("Cleaning");
	      String expectedValue5 = detail.get("Professional Cleaning ");
	      String actualValue5 = p.getCleaning( );
	      assertEquals(expectedValue5, actualValue5);

	     
	      
	    }
	  }
	

	@Given("that I am on the cover page")
	public void that_i_am_on_the_cover_page() {
		System.out.println("");
	}

}

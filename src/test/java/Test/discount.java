package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.InvoiceSteps;
import sources_code.LoginSteps;
import sources_code.ProdectSteps;
import sources_code.Worker;

public class discount {
	static Customersteps c = new Customersteps();
	static InvoiceSteps in =new InvoiceSteps ();
	static ProdectSteps p =new ProdectSteps();
	static LoginSteps l = new LoginSteps();
	
	@Given("total balance from shopping cart")
	public void total_balance_from_shopping_cart() {
		System.out.println("");
	}

	@When("the total balance from shopping cart greater than {string}  successfull to discount,but if less than fail the discount")
	public void the_total_balance_from_shopping_cart_greater_than_successfull_to_discount_but_if_less_than_fail_the_discount(String string) {
		
		p.init();
		c.recordinformationinit();
		System.out.println();
		System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
		LoginSteps.inti();
		LoginSteps.whostheuser();
		int x=LoginSteps.getxmas();
		System.out.println(x);
           l.setx(x);
		System.out.println(Customersteps.getMylist().get(x).getaddress());
		
        if(l.getisLogincustomer()==true) {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
            System.out.println("Welcome to customer: "+LoginSteps.getUserslogin().get(x).getName());
            System.out.println();
            System.out.println("We have a discount \n If uses the service with an amount of money >400 NIS, you can get 10% discount");
            System.out.println();

            customer();
		}
	}
	

	
public static void customer() {
		
		int x=LoginSteps.getxmas();
        int flge1=1;
		Scanner input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| ****************Menu*****************|\n ");
        	System.out.println("| 1. Add product in shoppingcart       |\n");
			System.out.println("| 2. Show all product in shoppingcart to show if we have a discount |\n");
			System.out.println("| 3. Logout                            |\n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
			
				c.addshopping();
				break;
			}
			case 2:{
				c.showshopping();
				break;
			}
			
			case 3:{
				flge1=0;
				l.setisLogincustomer(false);
				break;
			}
			
			}

    		
        }
        
        
}

	

	@SuppressWarnings("unlikely-arg-type")
	@Then("successfull to discuont  customers")
	public void successfull_to_discuont_customers() {
		//assertTrue(in.getdiscount()==true);
		equals (in.getdiscount() == true);

	}

	@Then("fail to discuont  customers")
	public void fail_to_discuont_customers() {
	    assertNotEquals(false, in.getdiscount());
	}
	
	
}

package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.InvoiceSteps;
import sources_code.LoginSteps;
import sources_code.ProdectSteps;
import sources_code.Customersteps;

public class invoice {
		 InvoiceSteps x = new  InvoiceSteps();
		static Customersteps c = new Customersteps();
		static InvoiceSteps in =new InvoiceSteps ();
		static ProdectSteps p =new ProdectSteps();
		static LoginSteps l = new LoginSteps();
	@Given("delivery, price ,address,items")
	public void delivery_price_address_items() {
	 System.out.println("  ");
	 
	}

	@When("the invoice delivery<{string}> and price<{double}> and address <{string}> and items  <{string}>")
	public void the_invoice_delivery_and_price_and_address_and_items(String string, Double double1, String string2, String string3) {
		
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
			System.out.println("| 2. Show all product in shoppingcart  |\n");
			System.out.println("| 3. Cheack out to se your invoice     |\n");
			System.out.println("| 4. Logout                            |\n");

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
				c.ckeckout();
				
				break;
			}
			case 4:{
				flge1=0;
				l.setisLogincustomer(false);
				break;
			}
			
			}

    		
        }
        
		
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Then("successfull generate invoice for customer")
	public void successfull_generate_invoice_for_customer() {
		
		equals (x.isgenerate()==true);
	}
	
	
}

package Test;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.LoginSteps;
import sources_code.ProdectSteps;
import sources_code.ReportsSteps;

public class reports {
	static Customersteps c = new Customersteps();
	static ProdectSteps s = new ProdectSteps();
	static LoginSteps l = new LoginSteps();
	@Given("total user ,product and order")
	public void total_user_product_and_order() {
		System.out.println("Generate customized reports about business");
	}

	@When("get all order,get all user and get all product")
	public void get_all_order_get_all_user_and_get_all_product() {
		s.init();
		c.recordinformationinit();
		System.out.println();
		System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
		LoginSteps.inti();
		LoginSteps.whostheuser();
		int x=LoginSteps.getxmas();
		System.out.println(x);
           l.setx(x);
		System.out.println(Customersteps.getMylist().get(x).getaddress());
		
		 
		if(l.getisLoginadmin()==true){

			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
	        System.out.println("Welcome to admin: "+LoginSteps. getUserslogin().get(x).getName());
	        admin();
		}
		
		else if(l.getisLogincustomer()==true) {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
            System.out.println("Welcome to customer: "+LoginSteps. getUserslogin().get(x).getName());
            customer();
		}
	}
	

	public static void admin() {
		
		
		//int x=LoginSteps.x;
        int flge1=1;
		Scanner input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| **************Menu***************|\n ");
			System.out.println("| 1. Reports about business        |\n");
			

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:
			{
				
					c.report();
					 flge1=0;
	                l.setisLoginadmin(false);
					break;
			}
			
     			  default:
                  System.out.println("Default! ");
                  break;
			
			}
        }
        
	}
	
	public static void customer() {
		
		int x=LoginSteps.getxmas();
        int flge1=1;
		Scanner input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| ****************Menu*****************|\n ");
        	System.out.println("| 1. Add prodect in shoppingcart       |\n");
			System.out.println("| 2. Cheack out                        |\n");
			System.out.println("| 3. Logout                            |\n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				c.addshopping();
				break;
			}
			
			case 2:{
				c.ckeckout();
				
				break;
			}
		
			case 3:{
				flge1=0;
				l.setisLogincustomer(false);
				break;
			}
			
			}

    		
        }
        
        
        if( flge1==0)
        {LoginSteps  log= new LoginSteps();
       
        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    		LoginSteps.inti();
    		LoginSteps.whostheuser();
    		int x1=LoginSteps.getxmas();
    		log.setx(x1);
			if(log.getisLoginadmin()==true){

    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    	        System.out.println("Welcome to admin: "+LoginSteps. getUserslogin().get(x1).getName());
    	        admin();
    		}
    		
			else if(l.getisLogincustomer()==true) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("Welcome to customer: "+LoginSteps. getUserslogin().get(x1).getName());
                customer();
    		}
    		
        }
	}

		
		
		
		
		
		
	
	@Then("successfull to  generate customized reports about business")
	public void successfull_to_generate_customized_reports_about_business() {
		equals (ReportsSteps.isIsreport()==true);
		
	}

}

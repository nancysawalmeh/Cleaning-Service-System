package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.LoginSteps;
import sources_code.ProdectSteps;
import sources_code.Worker;

public class availableworker {
	static Worker W = new Worker();;
	static Customersteps c = new Customersteps();
	static ProdectSteps p = new ProdectSteps();
	static LoginSteps l = new LoginSteps();
	@Given("a list of available workers")
	public void a_list_of_available_workers() {
	  
	  System.out.println();
	}

	@When("the system receives a new order")
	public void the_system_receives_a_new_order() {
		p.init();
		c.recordinformationinit();
		W.informationworker();
		
		System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
		LoginSteps.inti();
		LoginSteps.whostheuser();
		int x=LoginSteps.getxmas();
		
           l.setx(x);
		
	
		 if (l.getisLoginworker()==true) {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			
			System.out.println("welacome to worker: "+LoginSteps. getWorkerlogin().get(x).getName());
            worker();

		}
		else if(l.getisLogincustomer()==true) {
			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
            System.out.println("welacome to customer: "+LoginSteps. getUserslogin().get(x).getName());
            customer();
		}
	}
	

	public static void worker() {
		 int flge1=1;
			Scanner input = new Scanner(System.in);

	        while(flge1==1) {
	        	System.out.println("| *************Menu******************|\n ");
	        	System.out.println("| 1. Show order                      |\n");
	        	System.out.println("| 2. Log out		                |\n");
			

				int number=Integer.parseInt(input.nextLine());
				switch(number) {
				case 1:{
					c.showorderw();
					 flge1=1;
					 l.setisLoginworker(false);
					break;
				}
				case 2 :{
					flge1=0;
				}
				
				default:
				{
		        	System.out.println("Default!");
		        	break;

				}
				
				}
	        }
	}
	public static void customer() {
		
		int x=LoginSteps.getxmas();
        int flge1=1;
		Scanner input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| **************Menu*************    |\n ");
        	System.out.println("| 1. Add prodect in shoppingcart     |\n");
			System.out.println("| 2. Show all prodect in shoppingcart|\n");
			System.out.println("| 3. Check out                       |\n");
			System.out.println("| 4. Logout                          |\n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				c.addshopping();
				break;
			}//case1
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
        if( flge1==0)
        {LoginSteps  log= new LoginSteps();
       
        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    		LoginSteps.inti();
    		LoginSteps.whostheuser();
    		int x1=LoginSteps.getxmas();
    		log.setx(x1);
			
    		if (log.getisLoginworker()==true) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welcome to worker: "+LoginSteps.getWorkerlogin().get(x1).getName());
                worker();
    		}
    		else if((log.getisLogincustomer()==true)) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welcome to customer: "+ LoginSteps. getUserslogin().get(x1).getName());
                customer();
    		}
    		
        }
		
		
	}

	

	@SuppressWarnings("unlikely-arg-type")
	@Then("the system should assign the order to an available worker")
	public void the_system_should_assign_the_order_to_an_available_worker() {
		equals(Worker.isAvailable() == true);
	}

	@Then("no available worker")
	public void no_available_worker() {
	    assertNotEquals(false, Worker.isAvailable());
	}
}

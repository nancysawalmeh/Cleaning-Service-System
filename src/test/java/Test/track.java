package Test;

import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.LoginSteps;
import sources_code.ProdectSteps;
import sources_code.Worker;

public class track {
	static Customersteps c = new Customersteps();
	static ProdectSteps p = new ProdectSteps();
	static LoginSteps l = new LoginSteps();
	static Worker W = new Worker();
	@Given("when the user cheack out his order")
	public void when_the_user_cheack_out_his_order() {
	System.out.println("");
	
	}

	@When("the worker receive the order")
	public void the_worker_receive_the_order() {
		
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
	

	
	
	public static void customer() {
		
		int x=LoginSteps.getxmas();
        int flge1=1;
		Scanner input = new Scanner(System.in);

        while(flge1==1) {
        	System.out.println("| **************Menu*************    |\n ");
        	System.out.println("| 1. Add prodect in shoppingcart     |\n");
			System.out.println("| 2. Show all prodect in shoppingcart|\n");
			System.out.println("| 3. Remove prodect in shoppingcar   |\n");
			System.out.println("| 4. Check out                       |\n");
			System.out.println("| 5. Messages                        |\n");
			System.out.println("| 6. Logout                          |\n");

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
				c.removeshopping();
			}
			case 4:{
				c.ckeckout();
				
				break;
			}
			case 5:{
				c.sendmessage();
				c.sendnotification();
				break;
			}
			case 6:{
				flge1=0;
				l.setisLogincustomer(false);
				break;
			}
			
			default:{
				
				 Worker.setIswaiting(true);
				 Worker.setIntretmant(true);
				 Worker.setIscompleted(true);
				 System.exit(0);
			}
			
			}
       
       
    		
        }
        if( flge1==0)
        {LoginSteps  log= new LoginSteps();
       
        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
    		LoginSteps.inti();
    		LoginSteps.whostheuser();
    		int x1=LoginSteps.getxmas();
    		LoginSteps.setx(x1);
			
    		if (log.getisLoginworker()==true) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welcome to worker: "+LoginSteps. getWorkerlogin().get(x1).getName());
                worker();
    		}
    		else if((log.getisLogincustomer()==true)) {
    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
                System.out.println("welcome to customer: "+LoginSteps. getUserslogin().get(x1).getName());
                customer();
    		}
    		
        }
		
		
	}
	
	public static void worker() {
		 int flge1=1;
			Scanner input = new Scanner(System.in);

	        while(flge1==1) {
	        	System.out.println("| *************Menu******************|\n ");
				System.out.println("| 1. Select situation                |\n");
				System.out.println("| 2. Logout                           |\n");

				int number=Integer.parseInt(input.nextLine());
				switch(number) {
				case 1:{
					System.out.println("-----------------------------------------");
					System.out.println("1. waiting");
					System.out.println("2. in tretmeant");
					System.out.println("3. completed");
					int number1=Integer.parseInt(input.nextLine());
					switch(number1) {
					case 1:{
						Worker.setIswaiting(true);
						break;
					}
					case 2:{
						Worker.setIswaiting(false);
						Worker.setIntretmant(true);
						break;
					}
					case 3:{
						Worker.setIswaiting(false);
						Worker.setIntretmant(false);
						Worker.setIscompleted(true);
						Worker.setNotification(true);
						break;
					}
					}
						break;
					
				}
				case 2:{
					flge1=0;
					LoginSteps.setisLoginworker(false);
					break;
				}
				
				
				}
				 if( flge1==0)
			        {LoginSteps  log= new LoginSteps();
			       
			        	System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			    		LoginSteps.inti();
			    		LoginSteps.whostheuser();
			    		int x1=LoginSteps.getxmas();
			    		LoginSteps.setx(x1);
						
			    		 if (l.getisLoginworker()==true) {
			    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			                System.out.println("welacome to worker: "+LoginSteps.getWorkerlogin().get(x1).getName());
			                worker();
			    		}
			    		else if((l.getisLogincustomer()==true)) {
			    			System.out.println("-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n");
			                System.out.println("welacome to customer: "+LoginSteps. getUserslogin().get(x1).getName());
			                customer();
			    		}
			    		
			        }
	        
				
	        }
	         Worker.setIswaiting(true);
			 Worker.setIntretmant(true);
			 Worker.setIscompleted(true);
			
	        
	}
	
		


	@SuppressWarnings("unlikely-arg-type")
	@Then("in the first situation the order is waiting")
	public void in_the_first_situation_the_order_is_waiting() {
		equals (Worker.isIswaiting() == true);
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Then("in the second situation the order in treatment")
	public void in_the_second_situation_the_order_in_treatment() {
		equals (Worker.isIntretmant() == true);
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Then("in the third situation the order completed")
	public void in_the_third_situation_the_order_completed() {
		equals(Worker.isIscompleted() ==true);

	}
}

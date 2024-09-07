package Test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.LoginSteps;

public class Login {
	LoginSteps n;
    
    ArrayList <LoginSteps> founduser=new ArrayList<LoginSteps>();
  
   @Given("Given  I have the following username and passowrd in the store")
   public void userisfound (DataTable table) {
       List<List<String>> rows = table.asLists(String.class);

       for (List<String> columns: rows) {
       	founduser.add(new LoginSteps(columns.get(0), columns.get(1)));
       }
       
   }
   @When("I search for name by username <{string}> and by Password <{string}>")
   public void i_search_for_name_by_username_and_by_password(String string, String string2) {
	   LoginSteps.authenticatelogin();
   }
  
      @When("I search for name by username <{string}> and by password <{string}>,this user not found")
      public void i_search_for_name_by_username_and_by_password_this_user_not_found(String string, String string2) {
    	  LoginSteps.usernotfound ();
}


   @Then("I find {int} admin")
   public void i_find_admin(Integer int1) {
   	 assertTrue(LoginSteps.getxmas()>-1);
   }

   @Then("I find {int}  Customer")
   public void i_find_customer(Integer int1) {
   	 assertTrue(LoginSteps.getxmas()>-1);
   }
   
   @Then("I find {int}  Worker")
   public void i_find_worker(Integer int1) {
   	 assertTrue(LoginSteps.getxmas()>-1);
   }
   


	        
	        
} 
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	      
	        	
	        
	    
	       
	      
	       
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
			
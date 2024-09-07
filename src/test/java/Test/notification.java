package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;
import sources_code.Order;
import sources_code.Worker;

public class notification {
	Customersteps c = new Customersteps();
	Worker w =new Worker();
	Order o = new Order();
	
	@Given("when order with the status {string}")
	public void when_order_with_the_status(String string) {

	System.out.println("The worker sends a notification to the customer it may be: ");
	System.out.println("1. waiting");
	System.out.println("2. in treatment");
	System.out.println("3. completed"); 
	Scanner input2 = new Scanner(System.in);
	int number=input2 .nextInt();
	switch(number) {
	case 1:{
		Worker.setIswaiting(true);
		break;
	}
	case 2:{
		Worker.setIntretmant(true);
		break;
	}
	case 3:{
		Worker.setIscompleted(true);
		c.sendnotification();
		break;
	}
	
	}
	}
	@When("the worker sends a notification email to the customer")
	public void the_worker_sends_a_notification_email_to_the_customer() {
		c.sendmessage();
		
		}
	

	@SuppressWarnings("unlikely-arg-type")
	@Then("the customer should receive the email")
	public void the_customer_should_receive_the_email() {
		equals (c.receivenotification() == true);

	}
}

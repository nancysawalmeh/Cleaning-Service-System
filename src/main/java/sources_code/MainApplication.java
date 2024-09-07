package sources_code;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApplication {
	
    private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());

    private static final String MAIN = "-----------------------------------==Cleaning Services Application ==---------------------------------------------------\n";
    private static final String WELCCUST =   "welacome to customer: {0}";
    private static final String WELC =    "welacome to worker:{0} ";
    private static final String WELCADMIN =     "welacome to admin:{0} ";
    private static final String DEFAULT =    "Default! ";
	static ArrayList <Order>order;
	static ArrayList <LoginSteps> userslogin;
	static ArrayList<Customersteps> mylist;
	static ArrayList<ProdectSteps> rugDetails;
	static ArrayList<Worker> workerlist;
	static  LoginSteps  log= new LoginSteps();
	static ProdectSteps pro=new ProdectSteps();
	
	static Order ord=new Order();
	static Worker wrkr=new Worker();
	private static Scanner input;
	private static Scanner input1;
	private static Customersteps cus=new Customersteps();
	
	public static void main(String[] args) {
		pro.init();
		cus.recordinformationinit();
		wrkr.informationworker();
		

		
		LOGGER.log(Level.INFO,MAIN);
		LoginSteps.inti();
		LoginSteps.whostheuser();
		int x=LoginSteps.getxmas();
		
           LoginSteps.setx(x);
		
		
		 
		if(log.getisLoginadmin()){

			LOGGER.log(Level.INFO,MAIN);
			LOGGER.log(Level.INFO,WELCADMIN,LoginSteps. getUserslogin().get(x).getName());
	        admin();
		}
		else if (log.getisLoginworker()) {
			LOGGER.log(Level.INFO,MAIN);
			
			LOGGER.log(Level.INFO,WELC,LoginSteps. workerlogin.get(x).getName());
            worker();

		}
		else {
			LOGGER.log(Level.INFO,MAIN);
			LOGGER.log(Level.INFO,WELCCUST,LoginSteps. getUserslogin().get(x).getName());
            customer();
		}
	}
	

	public static void admin() {
		
		
		
        int flge1=1;
		input = new Scanner(System.in);

        while(flge1==1) {
        	LOGGER.log(Level.INFO," *****Menu***** \n ");
        	LOGGER.log(Level.INFO," 1. prodect                      \n");
        	LOGGER.log(Level.INFO," 2. customer                     \n");
        	LOGGER.log(Level.INFO," 3. worker                       \n");
        	LOGGER.log(Level.INFO," 4.reports_about_business        \n");
        	LOGGER.log(Level.INFO," 5.all order                     \n");
        	LOGGER.log(Level.INFO," 6.logout                        \n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				 int flge2=1;
		        input1 = new Scanner(System.in);
				while(flge2==1) {
					LOGGER.log(Level.INFO," *****Menu*****\n ");
					LOGGER.log(Level.INFO," 1. show all prodect             \n");
					LOGGER.log(Level.INFO," 2.Add new prodect               \n");
					LOGGER.log(Level.INFO," 3. update prodect               \n");
					LOGGER.log(Level.INFO," 4.delete prodect                \n");
					LOGGER.log(Level.INFO," 5.close                         \n");

	    			int number1=Integer.parseInt(input1.nextLine());
	    			switch(number1) {
	    			case 1:{
	    				int count=0;
	    				pro.carpetdetails();
	    				pro.coverdetails();
	    				
				        for (int i=0;i<ProdectSteps.rugDetails.size();i++) {
				        	count++;
				        }
				        LOGGER.log(Level.INFO,"\n");
				        LOGGER.log(Level.INFO,"number of prodect= {0}",count+"");
				        LOGGER.log(Level.INFO,"\n \n");

	    				break;
	    			}
	    			
                   case 2:{
	    				
	    				pro.addproduct();
	    				
	    				break;
	    			}
                   case 3:{
                	   		pro.carpetdetails();
	    				   pro.coverdetails();
	    				   pro.updateProduct();
	    				
	    				
	    				
	    				break;
	    			}
	    			
                   case 4:{
                	   pro.carpetdetails();
	    				   pro.coverdetails();
                	   pro.deleteProduct();
	    				
	    				
	    				
	    				break;
	    			}	
	    			
                   case 5:{
                	 
       				 flge2=0;
       				 
       				break;}
	    				
	    				
                   default:
                	   LOGGER.log(Level.INFO,DEFAULT);
                       break;
	    			
	    			}}
	    			
				break;
			}
			
			
			
			case 2:{
				 int flge3=1;
 		        input1 = new Scanner(System.in);
 				while(flge3==1) {
 					LOGGER.log(Level.INFO," *****Menu***** \n ");
 					LOGGER.log(Level.INFO," 1. show all customer             \n");
 					LOGGER.log(Level.INFO," 2.Add new customer               \n");
 					LOGGER.log(Level.INFO," 3. update customer               \n");
 					LOGGER.log(Level.INFO," 4.delete customer                \n");
 					LOGGER.log(Level.INFO," 5.close                          \n");
 	    			int number1=Integer.parseInt(input1.nextLine());
 	    			switch(number1) {
 	    			case 1:{
 	    				for(int i=0;i<Customersteps.getMylist().size();i++) {
 	    					Customersteps.getMylist().get(i).showcustomer();
 	    				}
 	    				
 	    				break;
 	    			}
 	    			case 2:{
 	    				cus.saveinformationcustmer();
 	    				log.addnewlogin();
 	    			
 	    				break;
 	    			}
 	    			
 	    			case 3:{
 	    				
 	    				cus.updetecustomer();
 	    				break;
 	    				}
 	    			
 	    			
             case 4:{
 	    	      cus.deletecustomer();
 	    	      break;     
             }
 	    				
             case 5:{
	    	     flge3=0;
	    	     break;
	    	     }		
 	    			
             default:
          	   LOGGER.log(Level.INFO,DEFAULT);

 	    			
 	    			}
 				}
 				
 			break;	
			}
			
			case 3:{
				for(Worker w:wrkr.workerlist) {
				w.showWorker();}
				break;
			}
			case 4:{
				cus.report();
				break;
			}
			case 5:{
				cus.allorder();
				break;
			}
			case 6:{
  				 flge1=0;
                LoginSteps.setisLoginadmin(false);
				break;
			}
			
			 default:
          	   LOGGER.log(Level.INFO,DEFAULT);

			}
        }
        if( flge1==0) {
        	
			LOGGER.log(Level.INFO,MAIN);
    		LoginSteps.inti();
    		LoginSteps.whostheuser();
    		int x1=LoginSteps.getxmas();
     	   LOGGER.log(Level.INFO,"{0}",x1);
               LoginSteps.setx(x1);
    		 
    		if(log.getisLoginadmin()){

    			LOGGER.log(Level.INFO,MAIN);
    			LOGGER.log(Level.INFO,WELCADMIN,LoginSteps. getUserslogin().get(x1).getName());
    	        admin();
    		}
    		else if (log.getisLoginworker()) {
    			LOGGER.log(Level.INFO,MAIN);
    			LOGGER.log(Level.INFO,WELC,LoginSteps. workerlogin.get(x1).getName());
                worker();
    		}
    		else {
    			LOGGER.log(Level.INFO,MAIN);
    			LOGGER.log(Level.INFO,WELCCUST,LoginSteps. getUserslogin().get(x1).getName());
                customer();
    		}
    		
        }
	}
	
	public static void customer() {
		
        int flge1=1;
		input = new Scanner(System.in);

        while(flge1==1) {
        	LOGGER.log(Level.INFO," *****Menu****** \n ");
        	LOGGER.log(Level.INFO," 1. Add prodect in shoppingcart       \n");
        	LOGGER.log(Level.INFO," 2. Show all prodect in shoppingcart  \n");
        	LOGGER.log(Level.INFO," 3. Remove prodect in shoppingcar     \n");
        	LOGGER.log(Level.INFO," 4. Cheack out                        \n");
        	LOGGER.log(Level.INFO," 5. Messages                          \n");
        	LOGGER.log(Level.INFO," 6. Logout                            \n");

			int number=Integer.parseInt(input.nextLine());
			switch(number) {
			case 1:{
				cus.addshopping();
				break;
			}
			case 2:{
				cus.showshopping();
				break;
			}
			case 3:{
				cus.removeshopping();
				break;

			}
			case 4:{
				cus.ckeckout();
				
				break;
			}
			case 5:{
				cus.sendmessage();
				cus.sendnotification();
				break;
			}
			case 6:{
				flge1=0;
				LoginSteps.setisLogincustomer(false);
				break;
			}
			
			 default:
          	   LOGGER.log(Level.INFO,DEFAULT);

			
			}
       
       
    		
        }
        if( flge1==0)
        {LoginSteps  log= new LoginSteps();
       
		LOGGER.log(Level.INFO,MAIN);
    		LoginSteps.inti();
    		LoginSteps.whostheuser();
    		int x1=LoginSteps.getxmas();
    		LoginSteps.setx(x1);
			if(log.getisLoginadmin()){

				LOGGER.log(Level.INFO,MAIN);
				LOGGER.log(Level.INFO,WELCADMIN,LoginSteps. getUserslogin().get(x1).getName());
    	        admin();
    		}
    		else if (log.getisLoginworker()) {
    			LOGGER.log(Level.INFO,MAIN);
    			LOGGER.log(Level.INFO,WELC,LoginSteps. workerlogin.get(x1).getName());
                worker();
    		}
    		else {
    			LOGGER.log(Level.INFO,MAIN);
    			LOGGER.log(Level.INFO,WELCCUST,LoginSteps. getUserslogin().get(x1).getName());
                customer();
    		}
    		
        }
		
		
	}
	
	public static void worker() {
		 int flge1=1;
			input = new Scanner(System.in);

	        while(flge1==1) {
	        	LOGGER.log(Level.INFO," *************Menu******************\n ");
	        	LOGGER.log(Level.INFO," 1. show order                      \n");
	        	LOGGER.log(Level.INFO," 2. select situation                \n");
	        	LOGGER.log(Level.INFO," 3.logout                           \n");

				int number=Integer.parseInt(input.nextLine());
				switch(number) {
				case 1:{
					cus.showorderw();
					break;
				}
				case 2:{
					cus.trackorder();
					break;
				}
				case 3:{
					flge1=0;
					LoginSteps.setisLoginworker(false);
					break;
				}
				
				 default:
              	   LOGGER.log(Level.INFO,DEFAULT);

				}
				 if( flge1==0)
			        {LoginSteps  log= new LoginSteps();
			       
	    			LOGGER.log(Level.INFO,MAIN);
			    		LoginSteps.inti();
			    		LoginSteps.whostheuser();
			    		int x1=LoginSteps.getxmas();
			    		LoginSteps.setx(x1);
						if(log.getisLoginadmin()){

			    			LOGGER.log(Level.INFO,MAIN);
							LOGGER.log(Level.INFO,WELCADMIN,LoginSteps. getUserslogin().get(x1).getName());
			    	        admin();
			    		}
			    		else if (log.getisLoginworker()) {
			    			LOGGER.log(Level.INFO,MAIN);
			    			LOGGER.log(Level.INFO,WELC,LoginSteps. workerlogin.get(x1).getName());
			                worker();
			    		}
			    		else {
			    			LOGGER.log(Level.INFO,MAIN);
			    			LOGGER.log(Level.INFO,WELCCUST,LoginSteps. getUserslogin().get(x1).getName());
			                customer();
			    		}
			    		
			        }
	        
	        
	        }
	}
	
}
package sources_code;

import static sources_code.ProdectSteps.rugDetails;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Customersteps {
	
    private static final Logger LOGGER = Logger.getLogger(Customersteps.class.getName());
   

	static LoginSteps  log= new LoginSteps();
	static InvoiceSteps in=new InvoiceSteps();
	
	static Worker w =new Worker();
    static Order o=new Order();
    static int x=log.getx();
    double count=0.0;
	private static boolean grer=false;

	public final List<ProdectSteps> shoppingcart=new ArrayList<ProdectSteps>();
	public final List<Order> order=new ArrayList<Order>();
	ProdectSteps pro=new ProdectSteps();
	private int id;
	private String name;
	private Integer phone;
	private String address;
	private boolean issavee=false; 
	private static boolean issave;
    private double  balance;
  
	public Customersteps(int ids, String names, Integer phones,String addres){
		this.id=ids;
		this.name=names;
		this.phone=phones;
		this.address=addres;
	
	}
	
	public boolean grer() {
		return grer;
	}
	
	public static void setGenerate(boolean grer) {
		Customersteps.grer=grer;
	}
	
	public Customersteps(){}
	public int getid() {
		return id ;	
	}
	public double getbalance() {
		return  balance;
		
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	
	public boolean getissavee() {
		return issavee ;	
	}
	public void setissavee(boolean issave) {
		this.issavee = issave;		
	}
	
	public void setid(int id) {
		this.id = id;		
	}
	public String getname() {
		return name ;	
	}
	public void setname(String name) {
		this.name = name ;		
	}
	public int getphone() {
		return phone;	
	}
	
	public void setphone(int phone) {
		this.phone= phone;		
	}
	public String getaddress() {
		return address ;	
	}
	public void setaddress(String address) {
		this.address = address ;		
	}
	
	public static boolean isIssave() {
		return issave;
	}
	public static void setIssave(boolean issave) {
		Customersteps.issave = issave;
	}
	
	private static final  List <Customersteps> mylist =new ArrayList<Customersteps>();
	private Scanner input2;
	

	public void recordinformationinit() {
			mylist.add(new Customersteps(1,"nancy",0555,"nublse"));
			mylist.add(new Customersteps(2,"masa",0222,"tullkarem"));
			mylist.add(new Customersteps(4,"noor shole",1778,"hebron"));
			mylist.add(new Customersteps(5,"noor sawalmeh",1778,"hebron north"));
			mylist.add(new Customersteps(6,"noor sawalmeh",1778,"Gase"));

		setIssave(true);
	}
	


	
public void saveinformationcustmer(){
	
	LOGGER.log(Level.INFO,"enter id =");
	  input2 = new Scanner(System.in);
	 int idd=input2.nextInt();  
	  
	  for(int i=0; i<mylist.size();i++) {
		  if(mylist.get(i).id != idd) {
			  this. issavee=true;
			  setIssave(issavee);
		  }}
		
	  
	  if(issavee) {
		  LOGGER.log(Level.INFO,"{0}",issavee);

		  LOGGER.log(Level.INFO,"Enter name =");
	  input2 = new Scanner(System.in);
		String n =input2.next();
		
		LOGGER.log(Level.INFO,"Enter phone =");
		  input2 = new Scanner(System.in);
		int ph =input2.nextInt();
			
	
		LOGGER.log(Level.INFO,"Enter address =");
			  input2 = new Scanner(System.in);
				String ad =input2.next();
				
	mylist.add(new Customersteps(idd,n,ph,ad));
	LOGGER.log(Level.INFO,"successfull to save information");
	}
		

}
	  
	  
	
public void showcustomer() {
	LOGGER.log(Level.INFO," id :{0}  ",getid()+"");
	LOGGER.log(Level.INFO," Name customer :{0}",getname());
	LOGGER.log(Level.INFO," phone customer :{0} ",getphone()+"");
	LOGGER.log(Level.INFO,"Address customer :{0}",getaddress()+"\n");




}

public void updetecustomer() {
	int flag=0;
	for (Customersteps c:mylist) {
			c.showcustomer();
	}
	LOGGER.log(Level.INFO," ENTER ID =");
	input2 = new Scanner(System.in);
	 int id1=input2.nextInt(); 
	 for(int i=0;i<mylist.size();i++) {
		 if(mylist.get(i).getid()==id1) {
			 flag=1;
				LOGGER.log(Level.INFO,"Enter new name");
			 input2 = new Scanner(System.in);
			String namenew=input2.nextLine();
			LOGGER.log(Level.INFO,"Enter new phone");
			 input2 = new Scanner(System.in);
			int phonenew=input2.nextInt();
			
			LOGGER.log(Level.INFO,"Enter new address");
			 input2 = new Scanner(System.in);
			String adderssnew=input2.nextLine();
			mylist.get(i).updatecustomrer(id1,namenew,phonenew,adderssnew);
            
			LOGGER.log(Level.INFO,"customer updated successfully.");
			
		 }
		 
	 }
	 if (flag==0) {
			LOGGER.log(Level.INFO,"NOT FOUNG CUSTOMER.");

	 }
}


private void updatecustomrer(int id1, String namenew, int phonenew, String adderssnew) {
	this.id=id1;
	this.name=namenew;
	this.phone=phonenew;
	this.address=adderssnew;
	
}
public void deletecustomer() {
	int decus = 0;
	for (Customersteps c:mylist) {
		c.showcustomer();
}
	LOGGER.log(Level.INFO,"ENTER ID =");
input2 = new Scanner(System.in);
 int id1=input2.nextInt(); 
 for(int i=0;i<mylist.size();i++) {
	 if(mylist.get(i).getid()==id1) {
		
		decus = i;
		LOGGER.log(Level.INFO,"Customer deleted successfully.");

	 }
	 }
 		mylist.remove(decus) ;
	
}



int copy=0;
int flage=0;
int f=1;
int number;
public void addshopping() {
	
	pro.carpetdetails();
	pro.coverdetails();
	
	input2 = new Scanner(System.in);
	LOGGER.log(Level.INFO,"Enter ID=");

	int idprodrct=(input2.nextInt());
	 if(mylist.get(log.getx()).shoppingcart != null) {
		 for(int i=0;i<mylist.get(log.getx()).shoppingcart.size();i++) {
	    		if(mylist.get(log.getx()).shoppingcart.get(i).getid()==(idprodrct)) {
	    			LOGGER.log(Level.INFO,"the prodect  is found\n");
	    			LOGGER.log(Level.INFO,"DO you want to change Quantity\n");
	    			while(f==1) {
	    				LOGGER.log(Level.INFO,"yes: Enter number 1 to increase\n");
	    				LOGGER.log(Level.INFO,"yes: Enter number 2 to reduce\n");
	    				LOGGER.log(Level.INFO,"NO: Enter number 3 \n");
	    			 number=input2.nextInt();
	    			switch(number) {
	    			case 1:{
	    				
						  copy =mylist.get(log.getx()).shoppingcart.get(i).getQuantity() +1;
						  for(int j=0;j<ProdectSteps.rugDetails.size();j++) {
							  if(rugDetails.get(j).getid()==(idprodrct )) {
						    
							   mylist.get(log.getx()).shoppingcart.get(i).setQuantity(copy);
							  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*1));
    						 flage=1;
    						   break;}

						  }
						  if(flage==0) {
								LOGGER.log(Level.INFO,"not available\n");
                                
	    					   }	
						  break;  }
	    			 
	    		case 2:{
    				
					  copy = mylist.get(log.getx()).shoppingcart.get(i).getQuantity() -1;
					  for(int j=0;j<ProdectSteps.rugDetails.size();j++) {
						  if(rugDetails.get(j).getid()==(idprodrct )) {
							   mylist.get(log.getx()).shoppingcart.get(i).setQuantity(copy);
								  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()-(rugDetails.get(j).getprice()*1));
								  flage=1;
						   break;
					   
					    
					    }}
					  if(flage==0) {
							LOGGER.log(Level.INFO,"not available\n");
                       
					   }	
				  break; 
					  
	    		}
	    		case 3:{
	    			f=0;
	    			break;}
	    		
    			default:{
    				LOGGER.log(Level.INFO,"Default! ");
                    break;}
    		  
	    			}
	    			}
	    		   
	    			}}
		 if(flage==0) {
			 for(int j=0;j<rugDetails.size();j++) {
				 if(rugDetails.get(j).getid()==(idprodrct)) {
						LOGGER.log(Level.INFO,"Enter number of quantity=");
					   copy =(input2.nextInt());
						  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*copy));
					   mylist.get(log.getx()).shoppingcart.add(new ProdectSteps(rugDetails.get(j).getCategory(),rugDetails.get(j).getid(),rugDetails.get(j).getName(),rugDetails.get(j).getDescriptions(),
							  rugDetails.get(j).getprice(),rugDetails.get(j).getMaterial(),copy));
				   
				 }
				 
			 }
			
		 }
		 }
	 else {
		 for(int j=0;j<rugDetails.size();j++) {
			 if(rugDetails.get(j).getid()==(idprodrct)) {
					LOGGER.log(Level.INFO,"Enter number of quantity=");
				   copy =Integer.parseInt(input2.nextLine());
					  mylist.get(log.getx()). setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(j).getprice()*copy));
				   mylist.get(log.getx()).shoppingcart.add(new ProdectSteps(rugDetails.get(j).getCategory(),rugDetails.get(j).getid(),rugDetails.get(j).getName(),rugDetails.get(j).getDescriptions(),
						  rugDetails.get(j).getprice(),rugDetails.get(j).getMaterial(),copy));
			   
			 }
			 
		 }
	 }
	    		}	      
								   
public void showshopping() {
	
	LOGGER.log(Level.INFO,"{0}",log.getx());
	
	for(int k=0;k<mylist.get(log.getx()).shoppingcart.size();k++) {
    	for(int i=0;i<rugDetails.size();i++) {
    		if(mylist.get(log.getx()).shoppingcart.get(k).getid()==rugDetails.get(i).getid()) {
    			mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()-(mylist.get(log.getx()).shoppingcart.get(k).getprice()*mylist.get(log.getx()).shoppingcart.get(k).getQuantity()));
    			mylist.get(log.getx()).shoppingcart.get(k).setprice(rugDetails.get(i).getprice());
    			mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()+(rugDetails.get(i).getprice()*mylist.get(log.getx()).shoppingcart.get(k).getQuantity()));
				
    		}}}
	
	 for(ProdectSteps pr :mylist.get(log.getx()).shoppingcart) {
		   pr.print();}
		LOGGER.log(Level.INFO,"balance= ");
		LOGGER.log(Level.INFO,"{0}",mylist.get(log.getx()).getbalance()+"");
        
       
         if(mylist.get(log.getx()).getbalance()>=400) {
        	 InvoiceSteps.setdiscount(true);
        		LOGGER.log(Level.INFO,"balance after discount=");
	        mylist.get(log.getx()).setbalance(mylist.get(log.getx()).getbalance()-(mylist.get(log.getx()).getbalance()*(.1)));
	    	LOGGER.log(Level.INFO,"{0}",mylist.get(log.getx()).getbalance()+"");
	         }
         else {
        	 InvoiceSteps.setdiscount(false);
         }
}
							   
public void removeshopping() {
	int remv = 0;
	 for(ProdectSteps prosteps :mylist.get(log.getx()).shoppingcart) {
		 prosteps.print();}

	 if(mylist.get(log.getx()).shoppingcart.isEmpty()) {
			LOGGER.log(Level.INFO,"the arraylist is null ");}
	 else {
			LOGGER.log(Level.INFO,"Enter Id of prodect = ");
		  int idprodect=input2.nextInt();
		  for(int j=0;j<mylist.get(log.getx()).shoppingcart.size();j++) {
				 if(mylist.get(log.getx()).shoppingcart.get(j).getid()==idprodect) {
					 remv = j;
				 mylist.get(log.getx()).setbalance((mylist.get(log.getx()).getbalance())-(mylist.get(log.getx()).shoppingcart.get( remv).getprice()*mylist.get(log.getx()).shoppingcart.get( remv).getQuantity()));
			
		  }
	 }
		  mylist.get(log.getx()).shoppingcart.remove(remv);
	 }
	 
}
public void ckeckout()	{
	w.informationworker();
	int infor=1;
	int counter=0;
	LOGGER.log(Level.INFO,"{0}",log.getx());
if(mylist.get(log.getx()).shoppingcart .isEmpty() ) {
	 InvoiceSteps.setisgenerate(false);
		LOGGER.log(Level.INFO,"shopping cart is null");
		infor=0;
	}
	if(infor==1) {
		
		InvoiceSteps.setisgenerate(true);
		LOGGER.log(Level.INFO,"\n -----------------------------------------------------");
		LOGGER.log(Level.INFO,"                -------Receipt ---------        ");
		LOGGER.log(Level.INFO," Address :{0} ",mylist.get(log.getx()).getaddress()+"");
	LOGGER.log(Level.INFO,"\n -----------------------------------------------------");

	for(ProdectSteps promas :mylist.get(log.getx()).shoppingcart) {
		   promas.print();
		   counter++;
		   }
	LOGGER.log(Level.INFO,"Total balance={0}",mylist.get(log.getx()).getbalance()+"");
		LOGGER.log(Level.INFO,"  -----------------------------------------------------");

		if(counter>=1||counter<=5) {
			LOGGER.log(Level.INFO,"Delivery = from 1 to 5 days");
		}
		else if(counter>=6||counter<=15) {
			LOGGER.log(Level.INFO,"Delivery = from 5 to 10 days");
		}
		
		LOGGER.log(Level.INFO,"Enter ok= ");
		 String check=input2.next();
		 if(check.equals("ok")) {
			 
			Worker.setIswaiting(true);
			Worker.setAvailable(true);
	             for(int j=0;j<mylist.get(log.getx()).shoppingcart.size();j++) {
	            	
	            	 order.add(new Order(log.getx() ,mylist.get(log.getx()).shoppingcart.get(j).getCategory(),mylist.get(log.getx()).shoppingcart.get(j).getid(),mylist.get(log.getx()).shoppingcart.get(j).getName(),
							 mylist.get(log.getx()).shoppingcart.get(j).getprice(),mylist.get(log.getx()).shoppingcart.get(j).getMaterial(),mylist.get(log.getx()).shoppingcart.get(j).getQuantity()));
					
					w.workerlist.get(log.getx()).l.add(new Order(log.getx() ,mylist.get(log.getx()).shoppingcart.get(j).getCategory(),mylist.get(log.getx()).shoppingcart.get(j).getid(),mylist.get(log.getx()).shoppingcart.get(j).getName(),
							 mylist.get(log.getx()).shoppingcart.get(j).getprice(),mylist.get(log.getx()).shoppingcart.get(j).getMaterial(),mylist.get(log.getx()).shoppingcart.get(j).getQuantity()));
				 }
	            
	            
	         mylist.get(log.getx()).shoppingcart.clear();
			 mylist.get(log.getx()).setbalance(0);
			}
	}
	
}
public void allorder() {
	
	setGenerate(true);
	int t=0;
	for(int i=0;i<order.size();i++) {
		
		count=count+(order.get(i).getPrice()*order.get(i).getQuantity());
			order.get(i).printorder();
			t++;
		}
	LOGGER.log(Level.INFO,"\n--------------------------------------------------------- ");
		
		
		
	LOGGER.log(Level.INFO,"-------------Generate statistics------------------ ");
	LOGGER.log(Level.INFO,"Total Paid = {0}",count+"");
	LOGGER.log(Level.INFO,"Total orders  = {0}",t+"");
	if(count>0) {
		LOGGER.log(Level.INFO,"Total Debts  = 0");}
	else {
		LOGGER.log(Level.INFO,"Caution, the application does not deal in debt");

	}

	LOGGER.log(Level.INFO,"--------------------------------------------------- ");

 
	
}
public void report() {
	ReportsSteps.setIsreport(true);
	int t=0;
	int t1=0;
	int t2=0;
	int t3=0;
	for(int i=0;i<order.size();i++) {
		
		count=count+(order.get(i).getPrice()*order.get(i).getQuantity());
			
			t++;
		}
		
		for (int i=0;i< mylist.size();i++) {
			t1++;
		}
		for (int i=0;i<rugDetails.size();i++) {
            if (rugDetails.get(i).getCategory() .equals("carpet")) {
            	t2++;
            }
            }
		for (int i=0;i<rugDetails.size();i++) {
            if (rugDetails.get(i).getCategory() .equals("cover")) {
            	t3++;
            	
            }
            
            }
		
		LOGGER.log(Level.INFO,"-------------REPORTS IN APPLICATION------------------ ");
		LOGGER.log(Level.INFO,"Total number of customer = {0}",t1+"");
		LOGGER.log(Level.INFO,"Total number of product carpet = {0}",t2+"");
	    LOGGER.log(Level.INFO,"Total number of product cover = {0}",t3+"");
		LOGGER.log(Level.INFO,"Total Paid = {0} ",count+"");
	
		LOGGER.log(Level.INFO,"\nTotal orders  ={0}",t+"");
	if(count>0) {
		LOGGER.log(Level.INFO,"Total Debts  = 0");}
	else {
		LOGGER.log(Level.INFO,"Caution, the application does not deal in debt");

	}

	LOGGER.log(Level.INFO,"--------------------------------------------------- ");

 
}
public void showorderw() {
	for(Order shorder:w.workerlist.get(log.getx()).l) {
		shorder.printorder();
	}
}

public void available() {
	if(w.workerlist.get(log.getx()).l.isEmpty()) {
		Worker.setAvailable(true);
	}
	else {
		Worker.setAvailable(false);
	}
}

public void trackorder() {
	LOGGER.log(Level.INFO,"-----------------------------------------");
	LOGGER.log(Level.INFO,"1. waiting");
	LOGGER.log(Level.INFO,"2. in tretmeant");
	LOGGER.log(Level.INFO,"3. completed");
int numbertrack=input2.nextInt();
switch(numbertrack) {
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
	w.workerlist.get(log.getx()).l.clear();
	break;
}
default :
{
	Console console = System.console();
	if (console != null) {
	    console.writer().print("Not found");
	}
}
}


}
public void sendnotification() {
	if(Worker.isNotification()) {
		LOGGER.log(Level.INFO,"Your cleaning order is complete. Thank you for using our Application! ");

	}
}
public void sendmessage() {
	if (Worker.isIswaiting())
	{
		LOGGER.log(Level.INFO,"the order is waiting");
	}
	else if(Worker.isIntretmant()) {
		LOGGER.log(Level.INFO,"the order in treatment");

	}
	else if(Worker.isIscompleted()) {
		
		LOGGER.log(Level.INFO,"the order is completed");

	}
}

public void ccustomernottrue() {
	if(name==null||phone==0||address==null) {
		LOGGER.log(Level.INFO,"Failed to save information \n please try again");
	
		issavee=false;

	}
	
}



public boolean receivenotification() {
	Worker.isNotification();
	LOGGER.log(Level.INFO,"Done to receive notification ");
	return true;
}

public static List <Customersteps> getMylist() {
	return mylist;
}



}




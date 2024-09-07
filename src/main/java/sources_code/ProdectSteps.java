package sources_code;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdectSteps {
    private static final Logger LOGGER = Logger.getLogger(ProdectSteps.class.getName());
    private static final String ACTION_1 = "cover";
    private static final String ACTION_2 = "carpet";
	 private  String category;
	    private int id;
		private  String name;
		private  String picture;
	    private  String description;
		private  double price;
	    private  String material;
	    private  String cleaninig;
	    private  int quantity;
	    
	    ProdectSteps(String category,int id,String name, String description, double price, String material,int quantity) {
	    	this.category = category;
	    	this.id = id;
	    	this.name = name;
	    	this.description = description;
	    	this.price =price ;
	    	this.material = material;
	    	this.quantity=(quantity);
	    	
	    }
	    public ProdectSteps(){}

	     static ArrayList<ProdectSteps> rugDetails = new ArrayList<ProdectSteps>();
		private Scanner input0;
		
		public void carpetpage() {
			LOGGER.log(Level.INFO, "Welcome to the carpet page!\n ");
			carpetdetails();			
			
			
		}

		public void coverpage() {
			LOGGER.log(Level.INFO,"Welcome to the cover page!\n");
			coverdetails();
		 	
		    
		}
		
		public String getCategory() {
			return category;	
		}
		public void setCategory(String catproduct) {
			this.category = catproduct;		
		}
		
		public int getid() {
			return id;	
		}
		public void setid(int id) {
			this.id = id;		
		}
		
		public String getName() {
			return name ;	
		}
		public void setName(String name) {
			this.name = name;		
		}
		
		
	    public String getPicture() {
	        return picture;
	    }
	    public void setPicture(String picture) {
	        this.picture = picture;
	    }
	    

	    public String getDescriptions() {
	        return description;
	    }
	    public void setDescriptions(String description) {
	       this.description = description;
	    }
	   
	    
	    public double getprice() {
	        return price;
	    }
	    public void setprice(double price) {
	        this.price = price;
	    }
	    
	    
	    public String getMaterial() {
	        return material;
	    }
	    public void setMaterial(String material) {
	        this.material = material;
	    }
	    
	    
		public String getCleaning() {
			return cleaninig;
		}
		public void setCleaning(String cleaninig) {
			this.cleaninig = cleaninig;
		}

		public void init() {
			rugDetails.add(new ProdectSteps(ACTION_2,1, "Kitchen cleaning","carpet sizes: 123*75",420,"Triexta Carpeting",1));
			rugDetails.add(new ProdectSteps(ACTION_2,2, "Bathroom cleaning", "carpet sizes: 20*75",100,"Acrylic Carpeting",1));
			rugDetails.add(new ProdectSteps(ACTION_1,3, "Livingroom cleaning", "carpet sizes: 200*100",345,"Polyster Carpeting",1));
			rugDetails.add(new ProdectSteps(ACTION_1,4, "Bedrooms covers cleaning", "carpet sizes: 100*100",150,"Cotton",1));

				}
		
		public void carpetdetails() {
		
			for (int i=0;i<rugDetails.size();i++) {
	            if (rugDetails.get(i).getCategory() .equals(ACTION_2)) {
	            	rugDetails.get(i). print();
	            }
	            }
	       
    }
			
			
			  
		
		

		public void coverdetails() {
	for (int i=0;i<rugDetails.size();i++) {
	            if (rugDetails.get(i).getCategory() .equals(ACTION_1)) {
	            	rugDetails.get(i). print();
	            }
	            
	            }
	        
   
		}
		
		 
		public void print() {
			
			if(!rugDetails.isEmpty()) {
				
				LOGGER.log(Level.INFO, "Category product:{0}  " , category );
				LOGGER.log(Level.INFO, "ID:{0}  " , id + "" );
				LOGGER.log(Level.INFO, "Name product:{0}" , name);
				LOGGER.log(Level.INFO, "The discription:{0} " , description);
				LOGGER.log(Level.INFO, "The price: {0} " , price +"");
				LOGGER.log(Level.INFO, "The Material: {0}" , material);
				LOGGER.log(Level.INFO, "The Quantity:{0} " , quantity +"\n");
				LOGGER.log(Level.INFO, "\n \n");

			
					 }

					
				 
		}

		
		
		public void addproduct() {
			 input0 = new Scanner(System.in);
			 LOGGER.log(Level.INFO,"Enter product Category: ");
		        String ctg  =  input0.next();
		       
		        
		        LOGGER.log(Level.INFO,"Enter the id product=");
		        input0 = new Scanner(System.in);
				 int idproduct =  input0.nextInt();
				 
				 for (ProdectSteps product : rugDetails) {
			            if (product.getid() == id) {
			            	LOGGER.log(Level.INFO,"Product id already exists.");
			            for (int i=0;i<rugDetails.size();i++) {
			            	LOGGER.log(Level.INFO,"{0}",rugDetails.get(i).id);

			            }
			            
			            
			                addproduct();
			            }
			        }
				 
				 LOGGER.log(Level.INFO,"Enter name product=");
		        input0 = new Scanner(System.in);
				 String namepro =  input0.next();
				
				 
				 
				 LOGGER.log(Level.INFO,"Enter discription product=");
				 input0 = new Scanner(System.in);
				 String dis =  input0.next();
				
				 LOGGER.log(Level.INFO,"Enter price product=");
				 input0 = new Scanner(System.in);
				double priceprdct =  input0.nextDouble();
				
				LOGGER.log(Level.INFO,"Enter material product=");
				 input0 = new Scanner(System.in);
				 String m =  input0.next();
				 
				 
				 rugDetails.add(new ProdectSteps (ctg,idproduct,namepro,dis,priceprdct,m,1));
				 
				 LOGGER.log(Level.INFO,"Product added successfully.");
		    }
		    
		 public void deleteProduct() {
		    	
			 input0 = new Scanner(System.in);
			 LOGGER.log(Level.INFO,"Enter product ID: ");
			        int entid  =  input0.nextInt();
			        for (int i=0;i<rugDetails.size();i++) {
			            if (rugDetails.get(i).getid() == entid) {
			            	rugDetails.remove(i);
			            	LOGGER.log(Level.INFO,"Product deleted successfully.");
				                
		    	
			            }
			            }
			        LOGGER.log(Level.INFO,"Product not found.");
		    }
		
			public void updateProduct() {
				int f=0;
				 input0 = new Scanner(System.in);
				 LOGGER.log(Level.INFO,"Enter product ID: ");
		       int idmas  =  input0.nextInt();
		       for (int i=0;i<rugDetails.size();i++) {
		            if (rugDetails.get(i).getid() == idmas) {
		            	f=1;
		      
						 
		            	LOGGER.log(Level.INFO,"Enter discription product=");
						 input0 = new Scanner(System.in);
						 String dis =  input0.next();
						
						 LOGGER.log(Level.INFO,"Enter price product=");
						 input0 = new Scanner(System.in);
						double priceproduct = input0.nextDouble();
						
						LOGGER.log(Level.INFO,"Enter material product=");
						 input0 = new Scanner(System.in);
						 String m =  input0.next();
						 
						 LOGGER.log(Level.INFO,"Enter cleanning product=");
						 input0 = new Scanner(System.in);
						 String c=  input0.next();
						
			    		  

		    	    	rugDetails.get(i).changeprodect(dis,priceproduct,m,c);
		               
		    	    	LOGGER.log(Level.INFO,"Product updated successfully.");
		               
		            }
		           
		        }
		      if(f==0){ LOGGER.log(Level.INFO,"Product not found.");}
		    }
			public void  changeprodect( String description, double price, String material, String cleaninig) {
				
	    	    	this.description =  description;
	    	    	this.price =price ;
	    	    	this.material = material;
	    	    	this.cleaninig = cleaninig;
			}
		    
	
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	

}

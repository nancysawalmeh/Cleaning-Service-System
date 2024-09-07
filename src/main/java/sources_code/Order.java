package sources_code;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Order {
	
    private static final Logger LOGGER = Logger.getLogger(Order.class.getName());

	Customersteps c =new Customersteps();
	private String categoryn;
	private int id;
	private String name;
	private double price;
	private String material;
	private int quantity;
	private int identifier;
	public Order(){}
	public Order(int identifier,String categoryn,int id,String name, double price, String material,int quantity) {
    	this.setidentifier(identifier);
		this.setCategory(categoryn);
    	this.setId(id);
    	this.setName(name);
    	this.setPrice(price) ;
    	this.setMaterial(material);
    	this.setQuantity((quantity));
    	
	}
	protected static List<Order> orderarray=new ArrayList<Order>();
		public String getCategory() {
			return categoryn;
		}
		public void setCategory(String category) {
			categoryn = category;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getidentifier() {
			return identifier;
		}
		public void setidentifier(int identifier) {
			this.identifier = identifier;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
	
		
		public void printorder() {

			LOGGER.log(Level.INFO, "Category product:{0}  " , categoryn );
			LOGGER.log(Level.INFO, "ID:{0}  " , getId() );
			LOGGER.log(Level.INFO, "Name product:{0}" , name);
			LOGGER.log(Level.INFO, "The price: {0} " , price);
			LOGGER.log(Level.INFO, "The Material: {0}" , material);
			LOGGER.log(Level.INFO, "The Quantity:{0} " , quantity);



			

		}
		
}

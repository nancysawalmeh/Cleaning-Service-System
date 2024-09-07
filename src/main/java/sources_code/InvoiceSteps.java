package sources_code;



public class InvoiceSteps {
	private static  boolean invoice = false;
	private static  boolean isdiscount = false;

	Customersteps o=new Customersteps();
	static LoginSteps  log= new LoginSteps();
	ProdectSteps prod=new ProdectSteps();
	
	
	public boolean isgenerate() {
		return invoice;
	}
	
	public static void setisgenerate(boolean invoice) {
		InvoiceSteps.invoice=invoice;
	}
	
	public boolean getdiscount() {
		return isdiscount;
	}
	
	public static void setdiscount(boolean isdiscount) {
		InvoiceSteps.isdiscount=isdiscount;
	}
}





package test.be.sales.taxes;

/**
 * 
 * @author massimo.cimetti
 *
 */
public class Product {

	ProductType productType;
	
	boolean isImported;
	
	double price;
	
	String name;
	
	int quantity;
	
	public Product(ProductType productType, boolean isImported, double price, String name, int quantity) {
		this.productType = productType;
		this.isImported = isImported;
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
}

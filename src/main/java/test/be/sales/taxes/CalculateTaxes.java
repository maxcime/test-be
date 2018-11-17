package test.be.sales.taxes;

public class CalculateTaxes {
	
	public static int taxValue = 10;
	
	public static int taxImportedValue = 5;

	public double calculatePrice(Product product) {
		
		double price = product.price;
		
		if(product.productType.equals(ProductType.OTHER)) {
			
			double taxRounded = calculateTax(product.price, taxValue);
			
			price = Math.round((price + taxRounded) * 1e4) / 1e4;
			
		};
		
		if(product.isImported) {
			
			double taxRounded = calculateTax(product.price, taxImportedValue);
			
			price = Math.round((price + taxRounded) * 1e4) / 1e4;
			
		}
		
		return price;
		
	};
	
	private double calculateTax(double price, int taxValue) {
		
		double tax = price * taxValue / 100;
		
		double taxRounded = Math.round(tax * 20.0) / 20.0;
		
		return taxRounded;
		
	};
	
}

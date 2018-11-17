package test.be.sales.taxes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * 
 * @author massimo.cimetti
 *
 */
public class PrintReceipt {
	
	CalculateTaxes calculateTaxes = new CalculateTaxes();
	
	NumberFormat formatter = new DecimalFormat("#0.00");

	public String print(List<Product> products) {
		
		String receipt = "Your receipt:";
		
		double total = 0;
		double totalTax = 0;
		
		for(Product product : products) {
		
			double price = calculateTaxes.calculatePrice(product);
			double tax = Math.round((price - product.price) * 1e4) / 1e4;
			
			//Sum of all prices and taxes. This round permits to have a correct total.
			total = Math.round((total + price) * 1e4) / 1e4;
			totalTax = Math.round((totalTax + tax) * 1e4) / 1e4;
			
			receipt = receipt + addNewProductToRecepit(product, price);
		}
		
		receipt = receipt + addTotalsToRecepit(total, totalTax);
		return receipt;
		
	}
	
	private String addNewProductToRecepit(Product product, double price) {
		
		String newProduct = "\n";
		
		newProduct = newProduct + product.quantity + " " + product.name + ": " + formatter.format(price);
		
		return newProduct;
		
	}
	
	private String addTotalsToRecepit(double total, double totalTax) {
		
		String totals = "\n";
		
		totals = totals + "Sales Taxes: " + formatter.format(totalTax);
		
		totals = totals + "\n";
		
		totals = totals + "Total: " + formatter.format(total);
		
		return totals;
		
	}
	
}

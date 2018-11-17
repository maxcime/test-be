package test.be.sales.taxes;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testOutputs() {
    	
    	PrintReceipt printReceipt = new PrintReceipt();
    	
    	//input 1
    	List<Product> input1 = new ArrayList<Product>();
    	input1.add(new Product(ProductType.BOOK,false,12.49,"book", 1));
    	input1.add(new Product(ProductType.OTHER,false,14.99,"music CD", 1));
    	input1.add(new Product(ProductType.FOOD,false,0.85,"chocolate bar", 1));
    	
    	String output1 = printReceipt.print(input1);
    	
    	//input 2
    	List<Product> input2 = new ArrayList<Product>();
    	input2.add(new Product(ProductType.FOOD,true,10.00,"imported box of chocolates", 1));
    	input2.add(new Product(ProductType.OTHER,true,47.50,"imported bottle of perfume", 1));
    	
    	String output2 = printReceipt.print(input2);
    	
    	//input 3
    	List<Product> input3 = new ArrayList<Product>();
    	input3.add(new Product(ProductType.OTHER,true,27.99,"imported bottle of perfume", 1));
    	input3.add(new Product(ProductType.OTHER,false,18.99,"bottle of perfume", 1));
    	input3.add(new Product(ProductType.MEDICAL,false,9.75,"packet of headache pills", 1));
    	input3.add(new Product(ProductType.FOOD,true,11.25,"imported box of chocolates", 1));
    	
    	String output3 = printReceipt.print(input3);
    	
    	System.out.println( "Output 1\n" );
        System.out.println( output1 );
        System.out.println( "--------------" );
        System.out.println( "Output 2\n" );
        System.out.println( output2 );
        System.out.println( "--------------" );
        System.out.println( "Output 3\n" );
        System.out.println( output3 );
    	
    };
}

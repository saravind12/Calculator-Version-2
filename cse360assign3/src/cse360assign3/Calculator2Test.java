/** Calculator JUnit Testing * 
 * @author Sudeep Aravind * 
 * @version 2/22/16 *  */ 

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator2Test 
{

	@Test
	public void testCalculator() 
	{
		Calculator calctest = new Calculator();
		assertNotNull(calctest);
	}
	
	@Test
	public void testGetTotal() 
	{
		Calculator calctest = new Calculator();
		assertEquals(0, calctest.getTotal());
		calctest.add(10);
		calctest.subtract(5);
		calctest.multiply(6);
		assertNotEquals(20, calctest.getTotal());
		assertEquals(30, calctest.getTotal());
	}
	
	@Test
	public void testAdd() 
	{
		Calculator calctest = new Calculator();
		calctest.add(10);
		calctest.add(5);
		assertEquals(15, calctest.getTotal());
	}
	
	@Test
	public void testSubtract() 
	{
		Calculator calctest = new Calculator();
		calctest.add(12);
		calctest.subtract(9);
		assertEquals(3, calctest.getTotal());
	}
	
	@Test
	public void testMultiply() 
	{
		Calculator calctest = new Calculator();
		calctest.add(8);
		calctest.subtract(4);
		calctest.multiply(2);
		assertEquals(8, calctest.getTotal());
		//multiply by 0
		calctest.multiply(0);
		assertEquals(0, calctest.getTotal());
	}
	
	@Test
	public void testDivide() 
	{
		Calculator calctest = new Calculator();
		calctest.add(50);
		calctest.divide(25);
		assertEquals(2,calctest.getTotal());
		
		//divide by zero test
		calctest.divide(0);
		assertEquals(0,calctest.getTotal());
		
	}
	
	@Test
	public void testGetHistory() 
	{
		fail("Not yet implemented");
	}

}

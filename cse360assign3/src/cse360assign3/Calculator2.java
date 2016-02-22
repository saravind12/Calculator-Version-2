package cse360assign3; 
/** Calculator * 
 * @author Sudeep Aravind * 
 * @version 2/22/16 *  */ 

public class Calculator2 
{ 
	private int total;
	
	
	/** Calculator object */
	public Calculator2 () 
	{	
		total = 0; // not needed - included for clarity 
	}	
	
	/** this returns the total	* * @return total	*/	
	public int getTotal () 
	{	
		return total;	
	}	
	
	/** Specified value is added to total	* * @param value	*/	
	public void add (int value) 
	{ 
		total = total + value;
		
	}	
	
	/** Specified value is subtracted from total	* * @param value	*/	
	public void subtract (int value) 
	{	
		total = total - value;
		
	}	
	
	/** Specified value is multiplied to total	* * @param value	 */	
	public void multiply (int value) 
	{	
		total = total * value;
	}	
	
	/** Specified value is divided from total	* * @param value	*/	
	public void divide (int value) 
	{	
		if (value == 0)
			total = 0;
		else
		total = total / value;
		
	}	
	
	/** A string containing the history of the calculations performed is returned	* * @return hist	*/	
	public String getHistory () 
	{	
		return "";	
	}
}
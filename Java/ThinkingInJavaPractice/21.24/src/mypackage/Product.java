package mypackage;

public class Product {
	private static int idCount=0;
	private final int id=idCount++;
	
	public String toString()
	{
		return "Product #"+id;
	}

}

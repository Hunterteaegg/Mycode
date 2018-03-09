package mypackage;

public class MyClass {
	public int i=0;
	public int j=6;
	
	public synchronized int put()
	{
		return i+j;
	}

}

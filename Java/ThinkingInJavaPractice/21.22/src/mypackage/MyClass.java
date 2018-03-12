package mypackage;

public class MyClass {
	private boolean symbol=false;
	
	public synchronized void makeTure()
	{
		symbol=true;
	}
	public synchronized void makeFalse()
	{
		symbol=false;
	}
	public synchronized boolean returnSymbol()
	{
		return symbol;
	}

}

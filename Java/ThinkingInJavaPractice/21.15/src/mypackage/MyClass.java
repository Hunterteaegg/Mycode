package mypackage;

public class MyClass {
	public void f()
	{
		synchronized (this) {
			System.out.println("f()");
		}
	}
	public void g()
	{
		synchronized (this) {
			System.out.println("g()");
		}
	}
	public void h()
	{
		synchronized (this) {
			System.out.println("h()");
		}
	}

}

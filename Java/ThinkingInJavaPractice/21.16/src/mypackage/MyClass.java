package mypackage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass {
	private Lock lock=new ReentrantLock();
	
	public void f()
	{
		lock.tryLock();
		System.out.println("f()");
		lock.unlock();
	}
	public void g()
	{
		lock.tryLock();
		System.out.println("g()");
		lock.unlock();
	}
	public void h()
	{
		lock.tryLock();
		System.out.println("h()");
		lock.unlock();
	}

}

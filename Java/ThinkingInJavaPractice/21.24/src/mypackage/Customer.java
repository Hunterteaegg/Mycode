package mypackage;

import java.util.LinkedList;

public class Customer implements Runnable {
	private LinkedList<Product> buffer=new LinkedList<Product>();
	
	public Customer(LinkedList<Product> buffer) {
		// TODO 自动生成的构造函数存根
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根

	}

}

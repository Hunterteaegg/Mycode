package mypackage;

import java.util.LinkedList;

public class Customer implements Runnable {
	private LinkedList<Product> buffer=new LinkedList<Product>();
	
	public Customer(LinkedList<Product> buffer) {
		// TODO �Զ����ɵĹ��캯�����
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������

	}

}

package mypackage;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		LinkedList<Product> buffer=new LinkedList<Product>();
		Producer producer=new Producer(buffer);
		Customer customer=new Customer(buffer);

	}

}

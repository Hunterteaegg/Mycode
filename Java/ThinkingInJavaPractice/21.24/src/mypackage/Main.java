package mypackage;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LinkedList<Product> buffer=new LinkedList<Product>();
		Producer producer=new Producer(buffer);
		Customer customer=new Customer(buffer);

	}

}

package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExecutorService exe=Executors.newCachedThreadPool();
		MyClass1 myClass1=new MyClass1();
		exe.execute(myClass1);
		exe.execute(new MyClass2(myClass1));

	}

}

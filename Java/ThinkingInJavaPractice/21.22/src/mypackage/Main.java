package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExecutorService exe=Executors.newCachedThreadPool();
		MyClass myClass=new MyClass();
		
		exe.execute(new MyTask1(myClass));
		exe.execute(new MyTask2(myClass));

	}

}

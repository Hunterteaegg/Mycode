package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newCachedThreadPool();
		MyClass myClass=new MyClass();
		
		exe.execute(new MyTask1(myClass));
		exe.execute(new MyTask2(myClass));

	}

}

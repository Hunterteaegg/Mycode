package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			System.out.println(exe.submit(new Fibonacci()));
		}

	}

}

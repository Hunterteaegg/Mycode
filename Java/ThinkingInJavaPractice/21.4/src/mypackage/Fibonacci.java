package mypackage;

import java.util.Random;

public class Fibonacci implements Runnable {
	private static Random rand=new Random(47);

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		test.Fibonacci fibonacci=new test.Fibonacci(10);
		fibonacci.main(10);
		
		Thread.yield();

	}

}

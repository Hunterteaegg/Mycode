package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newCachedThreadPool(new MyThreadFactory(3));
		
		for(int i=1;i<=3;i++)
		{
			exe.execute(new SimplePriorities(i));
		}

	}

}

package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++)
		{
			exe.execute(new Run());
		}

	}

}

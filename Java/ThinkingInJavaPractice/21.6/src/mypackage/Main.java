package mypackage;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newSingleThreadExecutor();
		Random rand=new Random(47);
		
		for(int i=0;i<10;i++)
		{
			exe.submit(new Sleep(rand.nextInt(10)));
		}

	}

}

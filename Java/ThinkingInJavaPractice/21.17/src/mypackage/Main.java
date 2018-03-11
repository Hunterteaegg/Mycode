package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		ExecutorService exe=Executors.newCachedThreadPool();
		
		for(int i=0;i<5;i++)
		{
			exe.execute(new RadioactiveCount());
		}
		TimeUnit.SECONDS.sleep(5);
		RadioactiveCount.cancel();
		exe.shutdown();
		if(!exe.awaitTermination(10, TimeUnit.SECONDS))
		{
			System.out.println("Not Terminal");
		}
		System.out.println("All is "+RadioactiveCount.sumRadio());

	}

}

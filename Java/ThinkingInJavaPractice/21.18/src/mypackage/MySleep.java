package mypackage;

import java.util.concurrent.TimeUnit;

public class MySleep {
	public static void sleep() throws InterruptedException
	{
		System.out.println("Go");
		TimeUnit.SECONDS.sleep(2);
	}

}

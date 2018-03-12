package mypackage;

import java.util.concurrent.TimeUnit;

public class MyTask1 implements Runnable {
	private MyClass myClass;
	
	public MyTask1(MyClass myClass) {
		// TODO 自动生成的构造函数存根
		this.myClass=myClass;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		myClass.makeTure();

	}

}

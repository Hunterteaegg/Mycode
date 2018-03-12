package mypackage;

import java.util.concurrent.TimeUnit;

public class MyClass2 implements Runnable {
	Runnable r;
	public MyClass2(Runnable r) {
		// TODO 自动生成的构造函数存根
		this.r=r;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		synchronized (r) {
			r.notifyAll();
		}

	}

}

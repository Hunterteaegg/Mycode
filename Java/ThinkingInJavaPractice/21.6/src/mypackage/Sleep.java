package mypackage;

import java.util.concurrent.TimeUnit;

public class Sleep implements Runnable {
	private int time;
	
	public Sleep(int time) {
		// TODO 自动生成的构造函数存根
		this.time=time;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			TimeUnit.MILLISECONDS.sleep(time);
			
			System.out.println("Time "+time);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}

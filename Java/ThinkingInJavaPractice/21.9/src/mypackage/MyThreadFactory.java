package mypackage;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
	private int priority;
	
	public MyThreadFactory(int priority) {
		// TODO 自动生成的构造函数存根
		this.priority=priority;
	}

	@Override
	public Thread newThread(Runnable runnable) {
		// TODO 自动生成的方法存根
		Thread thread=new Thread(runnable);
		thread.setPriority(priority);
		return thread;
	}

}

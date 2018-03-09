package mypackage;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
	private int priority;
	
	public MyThreadFactory(int priority) {
		// TODO �Զ����ɵĹ��캯�����
		this.priority=priority;
	}

	@Override
	public Thread newThread(Runnable runnable) {
		// TODO �Զ����ɵķ������
		Thread thread=new Thread(runnable);
		thread.setPriority(priority);
		return thread;
	}

}

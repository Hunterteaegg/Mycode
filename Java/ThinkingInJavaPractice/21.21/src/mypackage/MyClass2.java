package mypackage;

import java.util.concurrent.TimeUnit;

public class MyClass2 implements Runnable {
	Runnable r;
	public MyClass2(Runnable r) {
		// TODO �Զ����ɵĹ��캯�����
		this.r=r;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		synchronized (r) {
			r.notifyAll();
		}

	}

}

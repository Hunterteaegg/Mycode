package mypackage;

import java.util.concurrent.TimeUnit;

public class MyTask1 implements Runnable {
	private MyClass myClass;
	
	public MyTask1(MyClass myClass) {
		// TODO �Զ����ɵĹ��캯�����
		this.myClass=myClass;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		myClass.makeTure();

	}

}

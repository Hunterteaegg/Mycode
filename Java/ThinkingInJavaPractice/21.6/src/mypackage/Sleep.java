package mypackage;

import java.util.concurrent.TimeUnit;

public class Sleep implements Runnable {
	private int time;
	
	public Sleep(int time) {
		// TODO �Զ����ɵĹ��캯�����
		this.time=time;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			TimeUnit.MILLISECONDS.sleep(time);
			
			System.out.println("Time "+time);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}

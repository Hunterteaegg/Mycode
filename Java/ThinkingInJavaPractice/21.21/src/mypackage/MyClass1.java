package mypackage;

public class MyClass1 implements Runnable {

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println("Hello World!");
			
		}

	}

}

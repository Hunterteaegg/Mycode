package mypackage;

public class MyTask2 implements Runnable {
	private MyClass myclass;
	
	public MyTask2(MyClass myClass) {
		// TODO �Զ����ɵĹ��캯�����
		this.myclass=myClass;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		long start=System.nanoTime();
		synchronized (myclass) {
			myclass.makeFalse();
		}
		double duration=((double)(System.nanoTime()-start)/10e9);
		System.out.println("The duration is "+duration);

	}

}

package mypackage;

public class MyTask2 implements Runnable {
	private MyClass myclass;
	
	public MyTask2(MyClass myClass) {
		// TODO 自动生成的构造函数存根
		this.myclass=myClass;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		long start=System.nanoTime();
		synchronized (myclass) {
			myclass.makeFalse();
		}
		double duration=((double)(System.nanoTime()-start)/10e9);
		System.out.println("The duration is "+duration);

	}

}

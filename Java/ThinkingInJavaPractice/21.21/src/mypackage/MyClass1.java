package mypackage;

public class MyClass1 implements Runnable {

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("Hello World!");
			
		}

	}

}

package mypackage;

public class Run implements Runnable {
	MyClass myclass=new MyClass();

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		myclass.f();
		myclass.g();
		myclass.h();

	}

}

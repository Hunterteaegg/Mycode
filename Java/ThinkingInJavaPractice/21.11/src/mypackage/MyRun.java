package mypackage;

import java.util.Random;

public class MyRun implements Runnable {
	private static int countId=0;
	private final int id=countId++;
	MyClass myClass;
	
	public MyRun(MyClass myClass) {
		// TODO �Զ����ɵĹ��캯�����
		this.myClass=myClass;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		Random random=new Random(System.nanoTime());
		int i=random.nextInt(30);
		int j=random.nextInt(20);
		myClass.i=i;
		myClass.j=j;
		Thread.yield();
		System.out.println("#"+id+":i="+i+",j="+j);
		System.out.println("#"+id+",i+j="+myClass.put());

	}

}

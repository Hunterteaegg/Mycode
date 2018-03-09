package mypackage;

import java.util.Random;

public class MyRun implements Runnable {
	private static int countId=0;
	private final int id=countId++;
	MyClass myClass;
	
	public MyRun(MyClass myClass) {
		// TODO 自动生成的构造函数存根
		this.myClass=myClass;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
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

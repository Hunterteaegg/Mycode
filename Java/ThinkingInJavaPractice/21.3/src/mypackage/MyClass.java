package mypackage;

public class MyClass implements Runnable {
	public MyClass() {
		// TODO 自动生成的构造函数存根
		System.out.println("Mission Starting!");
	}
	private static int taskCount=0;
	private final int id=taskCount++;

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<3;i++)
		{
			System.out.println("#"+id+"("+i+")");
		}
		System.out.println("#"+id+" End");
		Thread.yield();

	}

}

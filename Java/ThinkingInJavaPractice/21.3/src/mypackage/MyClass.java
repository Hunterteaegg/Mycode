package mypackage;

public class MyClass implements Runnable {
	public MyClass() {
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("Mission Starting!");
	}
	private static int taskCount=0;
	private final int id=taskCount++;

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<3;i++)
		{
			System.out.println("#"+id+"("+i+")");
		}
		System.out.println("#"+id+" End");
		Thread.yield();

	}

}

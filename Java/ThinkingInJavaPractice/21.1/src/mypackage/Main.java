package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<10;i++)
		{
			new Thread(new MyClass()).start();
		}

	}

}

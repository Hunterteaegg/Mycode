package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<5;i++)
		{
			new Thread(new Fibonacci()).start();
		}

	}

}

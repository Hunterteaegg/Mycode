package mypackage;

import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=0;i<10;i++)
		{
			Executors.newCachedThreadPool().execute(new MyClass());
		}

	}

}

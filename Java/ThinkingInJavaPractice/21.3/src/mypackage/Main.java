package mypackage;

import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=0;i<10;i++)
		{
			Executors.newCachedThreadPool().execute(new MyClass());
		}

	}

}

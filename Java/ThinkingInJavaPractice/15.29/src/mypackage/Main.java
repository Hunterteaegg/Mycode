package mypackage;

import java.util.Arrays;
import java.util.List;

public class Main {
	static void myTest(Holder<List<?>> holder)
	{
		holder.set(Arrays.asList(1,2,3,4,5));
		System.out.println(holder.get());
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		myTest(new Holder<List<?>>());

	}

}

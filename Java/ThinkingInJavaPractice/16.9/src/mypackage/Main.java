package mypackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Peel<Banana>> mArrayList=new ArrayList<Peel<Banana>>();
		
		mArrayList.addAll(Arrays.asList(new Peel<Banana>(),new Peel<Banana>()));
		System.out.println(mArrayList);
		

	}

}

class Peel<T>
{
	private static int num=0;
	private final int id=num++;
	
	public String toString()
	{
		return "The id is "+id;
	}
}

class Banana
{
	;
}

package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Object[] objects=new Peel[10];
		
		for(int i=0;i<10;i++)
		{
			objects[i]=new Peel();
		}
		System.out.println(Arrays.toString(objects));
		

	}

}

class Peel
{
	private static int num=0;
	private final int id=num++;
	
	public String toString()
	{
		return "The id is "+id;
	}
}

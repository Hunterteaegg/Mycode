package mypackage;

import java.util.ArrayList;

public class GenericsCast {
	public static final int SIZE=10;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FixedSizeStack<String> strings=new FixedSizeStack<String>();
		
		for(String s:"A B C D E F G H I J".split(" "))
		{
			strings.push(s);
		}
		for(int i=0;i<SIZE;i++)
		{
			String s=strings.pop();
			System.out.print(s+" ");
		}

	}

}

class FixedSizeStack<T>
{
	private ArrayList<T> storage=new ArrayList<T>();
	
	public void push(T item)
	{
		storage.add(item);
	}
	public T pop()
	{
		return storage.remove(storage.size()-1);
	}
}
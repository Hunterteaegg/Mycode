package mypackage;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RandomList<Integer,String> myRandomList=new RandomList<Integer,String>();
		myRandomList.add(1, "Father");
		myRandomList.add(2, "Mother");
		myRandomList.add(3, "Me");
		for(int i=0;i<10;i++)
		{
			Tuple<Integer,String> tuple=myRandomList.get();
			System.out.println(tuple.first+" "+tuple.second);
		}

	}

}

class RandomList<T,U>
{
	private ArrayList<Tuple<T,U>> innerList=new ArrayList<Tuple<T,U>>();
	Random rand=new Random(47);
	
	public void add(T t,U u)
	{
		innerList.add(new Tuple<T,U>(t, u));
	}
	public Tuple<T,U> get()
	{
		return innerList.get(rand.nextInt(innerList.size()));
	}
}

class Tuple<T,U>
{
	T first;
	U second;
	
	public Tuple(T first,U second) {
		// TODO 自动生成的构造函数存根
		this.first=first;
		this.second=second;
	}
}
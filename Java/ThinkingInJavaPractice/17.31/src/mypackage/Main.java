package mypackage;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		NewArrayList newArrayList=new NewArrayList();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Random random=new Random(47);
		
		/*
		 * test NewArrayList
		 */
		long start_newArrayList=System.nanoTime();
		for(int i=0;i<100;i++)
		{
			newArrayList.add(random.nextInt());
		}
		float duration_newArrayList=((float)(System.nanoTime()-start_newArrayList)/1000000);
		
		/*
		 * test ArrayList
		 */
		long start_ArrayList=System.nanoTime();
		for(int i=0;i<100;i++)
		{
			arrayList.add(random.nextInt());
		}
		float duration_ArrayList=((float)(System.nanoTime()-start_ArrayList)/1000000);
		
		/*
		 * print test time
		 */
		System.out.println("NewArrayList:"+duration_newArrayList);
		System.out.println("ArrayList:"+duration_ArrayList);

	}

}

class NewArrayList
{
	private int size=1;
	private int index=0;
	private Integer[] list=new Integer[size];
	
	public void add(int number)
	{
		if(index<size)
		{
			list[index++]=number;
		}
		else
		{
			Integer[] temp_list=new Integer[size+1];
			
			for(int i=0;i<size;i++)
			{
				temp_list[i]=list[i];
			}
			temp_list[size]=number;
			list=temp_list;
			size++;
		}
	}
	public int get(int n)
	{
		return list[n];
	}
}
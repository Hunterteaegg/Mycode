package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import net.mindview.util.*;
import net.mindview.util.RandomGenerator.Integer;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Integer integer=new Integer();
		ArrayList<java.lang.Integer> arrayList=new ArrayList<java.lang.Integer>();
		LinkedList<java.lang.Integer> linkedList=new LinkedList<java.lang.Integer>();
		
		/*
		 * test arraylist
		 */
		long start_arraylist=System.nanoTime();
		for(int i=0;i<100;i++)
		{
			arrayList.add(integer.next());
		}
		Collections.sort(arrayList,new NewComparator());
		long duration_arraylist=System.nanoTime()-start_arraylist;
		
		/*
		 * test linkedlist
		 */
		long start_linkedlist=System.nanoTime();
		for(int i=0;i<100;i++)
		{
			linkedList.add(integer.next());
		}
		Collections.sort(linkedList,new NewComparator());
		long duration_linkedlist=System.nanoTime()-start_linkedlist;
		
		/*
		 * print time
		 */
		System.out.println("ArrayList:"+duration_arraylist+" LinkedList:"+duration_linkedlist);

	}

}

class NewComparator implements Comparator<java.lang.Integer>
{

	@Override
	public int compare(java.lang.Integer arg0, java.lang.Integer arg1) {
		// TODO 自动生成的方法存根
		if(arg0>arg1)
		{
			return 1;
		}
		else if(arg0.equals(arg1))
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
	
}
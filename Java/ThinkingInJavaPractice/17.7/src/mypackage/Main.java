package mypackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import net.mindview.util.Countries;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<String> arrayList=new ArrayList<String>(Countries.names(6));
		LinkedList<String> linkedList=new LinkedList<String>(Countries.names(10));
		ListIterator<String> li1=arrayList.listIterator();
		ListIterator<String> li2=linkedList.listIterator();
		ListIterator<String> li3=arrayList.listIterator();
		
		while(li1.hasNext())
		{
			System.out.print(li1.next()+", ");
		}
		System.out.println();
		while(li2.hasNext())
		{
			System.out.print(li2.next()+", ");
		}
		System.out.println();
		while(li3.hasPrevious()&&li1.hasNext())
		{
			li3.add(li1.next());
			li1.previous();
		}
		System.out.println(arrayList);
		
		

	}

}

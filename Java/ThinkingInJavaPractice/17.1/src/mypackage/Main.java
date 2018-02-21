package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import net.mindview.util.Countries;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> list1=new ArrayList<String>();
		List<String> list2=new LinkedList<String>();
		
		/*
		 * add countries name
		 */
		for(int i=0;i<Countries.DATA.length;i++)
		{
			list1.add(Countries.DATA[i][0]);
			list2.add(Countries.DATA[i][0]);
		}
		
		/*
		 * output result
		 */
		System.out.println("Before:");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Shuffle First:");
		Collections.shuffle(list1);
		Collections.shuffle(list2);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Shuffle Second:");
		Collections.shuffle(list1);
		Collections.shuffle(list2);
		System.out.println(list1);
		System.out.println(list2);

	}

}

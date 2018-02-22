package mypackage;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet<String> set=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		net.mindview.util.RandomGenerator.String tool=new net.mindview.util.RandomGenerator.String();
		
		for(int i=0;i<5;i++)
		{
			set.add(tool.next());
		}
		System.out.println(set);

	}

}


package mypackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import net.mindview.util.Countries;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<String> hashset=new HashSet<String>();
		Set<String> linkedset=new LinkedHashSet<String>();
		Set<String> treeset=new TreeSet<String>();
		
		for(int i=0;i<Countries.DATA.length;i++)
		{
			hashset.add(Countries.DATA[i][0]);
			linkedset.add(Countries.DATA[i][0]);
			treeset.add(Countries.DATA[i][0]);
		}
		System.out.println(hashset);
		System.out.println(linkedset);
		System.out.println(treeset);

	}

}

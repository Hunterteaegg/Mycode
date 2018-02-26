import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		net.mindview.util.RandomGenerator.String generator=new net.mindview.util.RandomGenerator.String();
		String[] stringTemp=new String[100];
		ArrayList<String> arrayList=new ArrayList<String>();
		
		/*
		 * add string array,sort and print
		 */
		for(int i=0;i<100;i++)
		{
			stringTemp[i]=generator.next();
		}
		System.out.println(stringTemp);
		Arrays.sort(stringTemp);
		System.out.println(stringTemp);
		
		/*
		 * add arraylist,sort and print
		 */
		for(int i=0;i<100;i++)
		{
			arrayList.add(generator.next());
		}
		System.out.println(arrayList);
		Collections.sort(arrayList,String.CASE_INSENSITIVE_ORDER);
		System.out.println(arrayList);

	}

}

class MySortClass implements Comparable<String>
{
	char s_one;
	char s_two;
	public MySortClass(String temp_one,String temp_two) {
		// TODO 自动生成的构造函数存根
		this.s_one=temp_one.charAt(0);
		this.s_two=temp_two.charAt(0);
	}

	@Override
	public int compareTo(String arg0) {
		// TODO 自动生成的方法存根
		if(s_one>'o')
		{
			return 1;
		}
		else if(s_one=='o')
		{
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
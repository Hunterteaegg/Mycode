package mypackage;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Integer[] group= {
				1,8,9,4,6,13,-8,23,77,2
		};
		Arrays.sort(group,new IntegerComparator());
		System.out.println(Arrays.toString(group));

	}

}

class IntegerComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO �Զ����ɵķ������
		return arg0>arg1?-1:(arg0==arg1)?0:1;
	}
	
}
package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SlowSet<Integer> slowSet=new SlowSet<Integer>();
		
		slowSet.addAll(Arrays.asList(1,159,46,654,449,198,465,465));
		System.out.println(slowSet);

	}

}

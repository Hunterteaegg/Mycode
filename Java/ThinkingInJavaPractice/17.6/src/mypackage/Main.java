package mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Character[] group= {
				'a','b','c'
		};
		List<Character> list=Collections.unmodifiableList(Arrays.asList(group));
		
		try {
			list.add('d');
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

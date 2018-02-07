package mypackage;

public class Main {
	public static boolean isObject(Object sample)
	{
		if(sample.getClass().equals(null))
		{
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[] mychar= {
				'a','b'
		};
		
		System.out.println(isObject(mychar));
		

	}

}

package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Number[] numbers=new Double[10];
		
		for(int i=0;i<10;i++)
		{
			numbers[i]=Math.pow((double)i,(double)2);
		}
		for(Number i:numbers)
		{
			System.out.println(i);
		}

	}

}

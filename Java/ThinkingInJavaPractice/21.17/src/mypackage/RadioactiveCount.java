package mypackage;

import java.util.ArrayList;

public class RadioactiveCount implements Runnable {
	private volatile static boolean cancel=false;
	private static int i=0;
	private final int id=i++;
	private int number=0;
	private static ArrayList<RadioactiveCount> sensors=new ArrayList<RadioactiveCount>();
	
	public RadioactiveCount() {
		// TODO 自动生成的构造函数存根
		sensors.add(this);
	}
	public static void cancel()
	{
		cancel=true;
	}
	public String toString()
	{
		return "#"+id+" ";
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(!cancel)
		{
			synchronized (this) {
				++number;
			}
			System.out.println(this+" Total:"+number);
		}
		System.out.println(this+" Stopping.");

	}
	public static int sumRadio()
	{
		int sum=0;
		
		for(RadioactiveCount r:sensors)
		{
			sum+=r.number;
		}
		
		return sum;
	}

}

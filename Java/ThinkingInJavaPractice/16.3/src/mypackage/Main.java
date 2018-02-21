package mypackage;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Arrays.toString(create(5, 465, 16)));

	}
	public static double[] create(int length,int range1,int range2)
	{
		Random random=new Random(47);
		double[] temp=new double[length];
		double num;
		
		if(range1<range2)
		{
			for(int i=0;i<length;i++)
			{
				num=(random.nextDouble())*(range2-range1)+range1;
				
				temp[i]=num;
			}
		}
		else if(range1==range2)
		{
			for(int i=0;i<length;i++)
			{
				temp[i]=range1;
			}
		}
		else
		{
			for(int i=0;i<length;i++)
			{
				num=(random.nextDouble())*(range1-range2)+range2;
				
				temp[i]=num;
			}
		}
		
		return temp;
	}

}

package mypackage;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Arrays.deepToString(create(2, 3, 4, 4, 6)));
		System.out.println(Arrays.deepToString(create(2, 4, 3, 6, 4)));
		System.out.println(Arrays.deepToString(create(4, 2, 3, 5, 5)));

	}
	public static double[][][] create(int first_length,int second_length,int third_length,double range1,double range2)
	{
		double num;
		Random random=new Random(47);
		double[][][] temp= new double[first_length][second_length][third_length];
		
		if(range1<range2)
		{
			for(int i=0;i<first_length;i++)
			{
				for(int j=0;j<second_length;j++)
				{
					for(int k=0;k<third_length;k++)
					{
						num=(random.nextDouble())*(range2-range1)+range1;
						temp[i][j][k]=num;
					}
				}
			}
		}
		else if(range1>range2)
		{
			for(int i=0;i<first_length;i++)
			{
				for(int j=0;j<second_length;j++)
				{
					for(int k=0;k<third_length;k++)
					{
						num=(random.nextDouble())*(range1-range2)+range2;
						temp[i][j][k]=num;
					}
				}
			}
		}
		else
		{
			for(int i=0;i<first_length;i++)
			{
				for(int j=0;j<second_length;j++)
				{
					for(int k=0;k<third_length;k++)
					{
						temp[i][j][k]=range1;
					}
				}
			}
		}
		
		return temp;
	}

}

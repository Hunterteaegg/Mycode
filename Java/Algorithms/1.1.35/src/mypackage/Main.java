package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int SIDE=6;
		double[] dist=new double[2*SIDE+1];
		for(int i=1;i<=SIDE;i++)
		{
			for(int j=1;j<=SIDE;j++)
			{
				dist[i+j]+=1.0;
			}
		}
		for(int k=2;k<=2*SIDE;k++)
		{
			dist[k]/=36.0;
		}
		
		System.out.println(Arrays.toString(dist));

	}

}

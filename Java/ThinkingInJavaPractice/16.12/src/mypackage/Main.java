package mypackage;

import java.util.Arrays;

import net.mindview.util.CountingGenerator;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		net.mindview.util.CountingGenerator.Double myDouble=new CountingGenerator.Double();
		double[] mydouble=new double[5];
		
		for(int i=0;i<5;i++)
		{
			mydouble[i]=myDouble.next();
		}
		System.out.println(Arrays.toString(mydouble));

	}

}

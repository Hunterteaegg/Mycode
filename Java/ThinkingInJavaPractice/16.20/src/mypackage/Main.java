package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] array1=new int[2][2];
		int[][] array2=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				array1[i][j]=j;
				array2[i][j]=j;
			}
		}
		System.out.println(Arrays.deepEquals(array1, array2));

	}

}

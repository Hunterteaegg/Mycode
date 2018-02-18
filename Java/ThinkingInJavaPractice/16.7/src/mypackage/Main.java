package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Arrays.deepToString(create(2, 3,4)));
		

	}
	
	public static BerylliumSphere[][][] create(int length1,int length2,int length3)
	{
		BerylliumSphere[][][] temp=new BerylliumSphere[length1][length2][length3];
		
		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			{
				for(int k=0;k<length3;k++)
				{
					temp[i][j][k]=new BerylliumSphere();
				}
			}
		}
		
		return temp;
	}

}

package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Arrays.deepToString(create(2, 3)));
		

	}
	
	public static BerylliumSphere[][] create(int length1,int length2)
	{
		BerylliumSphere[][] temp=new BerylliumSphere[length1][length2];
		
		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			{
				temp[i][j]=new BerylliumSphere();
			}
		}
		
		return temp;
	}

}

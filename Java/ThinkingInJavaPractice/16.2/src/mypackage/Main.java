package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(Arrays.toString(create(5)));
		

	}
	public static BerylliumSphere[] create(int length)
	{
		BerylliumSphere[] bSpheres=new BerylliumSphere[length];
		
		for(int i=0;i<length;i++)
		{
			bSpheres[i]=new BerylliumSphere();
		}
		
		return bSpheres;
	}

}

package mypackage;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BerylliumSphere[] array1=new BerylliumSphere[10];
		BerylliumSphere[] array2=new BerylliumSphere[5];
		
		Arrays.fill(array1,new BerylliumSphere());
		Arrays.fill(array2,new BerylliumSphere());
		System.arraycopy(array2, 0, array1, 0, array2.length);
		System.out.println(array1[1]==array2[1]);

	}

}

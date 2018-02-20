package mypackage;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BerylliumSphere[] array1=new BerylliumSphere[10];
		BerylliumSphere[] array2=new BerylliumSphere[5];
		
		Arrays.fill(array1,new BerylliumSphere());
		Arrays.fill(array2,new BerylliumSphere());
		System.arraycopy(array2, 0, array1, 0, array2.length);
		System.out.println(array1[1]==array2[1]);
		Arrays.sort(array1,new BerylliumSphereComparator());
		Arrays.sort(array2,new BerylliumSphereComparator());
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}

class BerylliumSphereComparator implements Comparator<BerylliumSphere>
{

	@Override
	public int compare(BerylliumSphere arg0, BerylliumSphere arg1) {
		// TODO 自动生成的方法存根
		return (arg0.id<arg1.id ? 1:(arg0.id==arg1.id?0:-1));
	}
	
}
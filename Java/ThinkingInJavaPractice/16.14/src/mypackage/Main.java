package mypackage;

import java.util.Arrays;

import net.mindview.util.CountingGenerator;
import net.mindview.util.CountingGenerator.Boolean;
import net.mindview.util.CountingGenerator.Byte;
import net.mindview.util.CountingGenerator.Character;
import net.mindview.util.CountingGenerator.Double;
import net.mindview.util.CountingGenerator.Float;
import net.mindview.util.CountingGenerator.Integer;
import net.mindview.util.CountingGenerator.Long;
import net.mindview.util.CountingGenerator.Short;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		boolean[] myboolean=new boolean[5];
		byte[] mybyte=new byte[5];
		char[] mychar=new char[5];
		double[] mydouble=new double[5];
		float[] myfloat=new float[5];
		int[] myint=new int[5];
		long[] mylong=new long[5];
		short[] myshort=new short[5];
		Boolean boolean1=new CountingGenerator.Boolean();
		Byte byte1=new CountingGenerator.Byte();
		Character character=new CountingGenerator.Character();
		Double double1=new CountingGenerator.Double();
		Float float1=new CountingGenerator.Float();
		Integer integer=new CountingGenerator.Integer();
		Long long1=new CountingGenerator.Long();
		Short short1=new CountingGenerator.Short();
		
		for(int i=0;i<5;i++)
		{
			myboolean[i]=boolean1.next();
			mybyte[i]=byte1.next();
			mychar[i]=character.next();
			mydouble[i]=double1.next();
			myfloat[i]=float1.next();
			myint[i]=integer.next();
			mylong[i]=long1.next();
			myshort[i]=short1.next();
		}
		System.out.println(Arrays.toString(myboolean));
		System.out.println(Arrays.toString(mybyte));
		System.out.println(Arrays.toString(mychar));
		System.out.println(Arrays.toString(mydouble));
		System.out.println(Arrays.toString(myfloat));
		System.out.println(Arrays.toString(myint));
		System.out.println(Arrays.toString(mylong));
		System.out.println(Arrays.toString(myshort));

	}

}

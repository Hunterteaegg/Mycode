package mypackage;

import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BerylliumSphere[] myBerylliumSpheres=new BerylliumSphere[5];
		Generated.array(myBerylliumSpheres, new BerylliumSphereGenerator());
		System.out.println(Arrays.toString(myBerylliumSpheres));

	}

}

class BerylliumSphereGenerator implements Generator<BerylliumSphere>
{

	@Override
	public BerylliumSphere next() {
		// TODO 自动生成的方法存根
		return new BerylliumSphere();
	}
	
}

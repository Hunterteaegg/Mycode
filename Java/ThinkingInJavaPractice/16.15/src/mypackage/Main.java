package mypackage;

import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BerylliumSphere[] myBerylliumSpheres=new BerylliumSphere[5];
		Generated.array(myBerylliumSpheres, new BerylliumSphereGenerator());
		System.out.println(Arrays.toString(myBerylliumSpheres));

	}

}

class BerylliumSphereGenerator implements Generator<BerylliumSphere>
{

	@Override
	public BerylliumSphere next() {
		// TODO �Զ����ɵķ������
		return new BerylliumSphere();
	}
	
}

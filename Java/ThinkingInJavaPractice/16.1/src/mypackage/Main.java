package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		print(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()});

	}
	public static void print(BerylliumSphere[] sequence)
	{
		for(BerylliumSphere b:sequence)
		{
			System.out.println(b);
		}
	}

}

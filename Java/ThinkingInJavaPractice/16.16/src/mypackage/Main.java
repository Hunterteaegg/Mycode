package mypackage;

import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(Arrays.toString(Generated.array(Skip.class, new SkipGenerator(), 10)));

	}

}

class Skip
{
	private static int num=0;
	private final int id=num++;
	
	public String toString()
	{
		return ("Ship "+id);
	}
}

class SkipGenerator implements Generator<Skip>
{

	@Override
	public Skip next() {
		// TODO �Զ����ɵķ������
		return new Skip();
	}
	
}
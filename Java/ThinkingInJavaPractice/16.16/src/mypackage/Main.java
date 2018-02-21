package mypackage;

import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		return new Skip();
	}
	
}
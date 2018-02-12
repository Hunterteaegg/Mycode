package mypackage;

import net.mindview.util.*;
import java.util.*;

public class Ocean {
	public static void eat(BigFish bigFish,LittleFish littleFish)
	{
		System.out.println(bigFish+" eats "+littleFish);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random random=new Random(88);
		Queue<LittleFish> line=new LinkedList<LittleFish>();
		Generators.fill(line, LittleFish.generator(), 15);
		List<BigFish> bigFishs=new ArrayList<BigFish>();
		Generators.fill(bigFishs, BigFish.generator(), 4);
		for(LittleFish l:line)
		{
			eat(bigFishs.get(random.nextInt(bigFishs.size())),l);
		}

	}

}

class BigFish
{
	private static long counter=1;
	private final long id=counter++;
	private BigFish()
	{
		;
	}
	public String toString()
	{
		return "BigFish "+id;
	}
	public static Generator<BigFish> generator()
	{
		return new Generator<BigFish>() {
			
			@Override
			public BigFish next() {
				// TODO 自动生成的方法存根
				return new BigFish();
			}
		};
	}
}

class LittleFish
{
	private static long counter=1;
	private final long id=counter++;
	private LittleFish()
	{
		;
	}
	public String toString()
	{
		return "LittleFish "+id;
	}
	public static Generator<LittleFish> generator()
	{
		return new Generator<LittleFish>() {
			
			@Override
			public LittleFish next() {
				// TODO 自动生成的方法存根
				return new LittleFish();
			}
		};
	}
}
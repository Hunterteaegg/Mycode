package mypackage;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {

	@Override
	public Iterator<StoryCharacters> iterator() {
		// TODO 自动生成的方法存根
		return null;
	}
	class StoryCharactersIterator implements Iterator<StoryCharacters>
	{
		int count=size;

		@Override
		public boolean hasNext() {
			// TODO 自动生成的方法存根
			return count>0;
		}

		@Override
		public StoryCharacters next() {
			// TODO 自动生成的方法存根
			count--;
			return StoryCharactersGenerator.this.next();
		}
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
		
	}
	
	@SuppressWarnings("unused")
	private Class<?>[] types= {
			GoodGuys.class,BadGuys.class,
	};
	private static Random rand=new Random(47);
	public StoryCharactersGenerator()
	{
		;
	}
	private int size=0;
	public StoryCharactersGenerator(int sz)
	{
		this.size=sz;
	}
	@SuppressWarnings("deprecation")
	public StoryCharacters next()
	{
		try {
			return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}

}

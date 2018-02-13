package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StoryCharactersGenerator gen=new StoryCharactersGenerator();
		for(int i=0;i<5;i++)
		{
			System.out.println(gen.next());
		}
		for(StoryCharacters s:new StoryCharactersGenerator(5))
		{
			System.out.println(s);
		}

	}

}

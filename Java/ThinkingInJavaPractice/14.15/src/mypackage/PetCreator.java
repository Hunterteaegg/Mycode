package mypackage;

import java.util.ArrayList;
import java.util.Random;

public class PetCreator {

	static ArrayList<Factory<? extends Pet>> partFactories=new ArrayList<Factory<? extends Pet>>();
	static
	{
		partFactories.add(new Cat().create());
		partFactories.add(new Dog().create());
	}
	private static Random rand=new Random(47);
	public static Pet createRandom()
	{
		int n=rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}


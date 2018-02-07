package mypackage;

import java.util.ArrayList;
import java.util.Random;

public class RegisteredFactories {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO 自动生成的方法存根
		for(int i=0;i<10;i++)
		{
			System.out.println(Part.createRandom());
		}

	}

}

class Part
{
	public String toString()
	{
		return getClass().getSimpleName();
	}
	static ArrayList<Class<? extends Part>> partFactories=new ArrayList<Class<? extends Part>>();
	static
	{
		//Collections.addAll() gives an "unchecked generic"
		//array creation ... for varargs parameter" warning.
		partFactories.add(new FuelFilter().getClass());
		partFactories.add(new AirFilter().getClass());
		partFactories.add(new CabinAirFilter().getClass());
		partFactories.add(new OilFilter().getClass());
		partFactories.add(new FanBelt().getClass());
		partFactories.add(new GeneratorBelt().getClass());
		partFactories.add(new PowerSteeringBelt().getClass());
	}
	private static Random rand=new Random(47);
	@SuppressWarnings("deprecation")
	public static Part createRandom() throws InstantiationException, IllegalAccessException
	{
		int n=rand.nextInt(partFactories.size());
		
		return partFactories.get(n).newInstance();
	}
}

// Create individual class
class Filter extends Part
{
	;
}

class FuelFilter extends Filter
{
	;
}

class AirFilter extends Filter
{
	;
}

class CabinAirFilter extends Filter
{
	;
}

class OilFilter extends Filter
{
	;
}

class Belt extends Part
{
	;
}

class FanBelt extends Belt
{
	;
}

class GeneratorBelt extends Belt
{
	;
}

class PowerSteeringBelt extends Belt
{
	;
}
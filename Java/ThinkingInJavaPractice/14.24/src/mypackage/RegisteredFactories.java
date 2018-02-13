//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.
package mypackage;
import java.util.*;

class Part {
  public String toString() {
    return getClass().getSimpleName();
  }
  static List<Factory<? extends Part>> partFactories =
    new ArrayList<Factory<? extends Part>>();	
  static {
    // Collections.addAll() gives an "unchecked generic
    // array creation ... for varargs parameter" warning.
    partFactories.add((Factory<? extends Part>) new FuelFilter.Factory());
    partFactories.add((Factory<? extends Part>) new AirFilter.Factory());
    partFactories.add((Factory<? extends Part>) new CabinAirFilter.Factory());
    partFactories.add((Factory<? extends Part>) new OilFilter.Factory());
    partFactories.add((Factory<? extends Part>) new FanBelt.Factory());
    partFactories.add((Factory<? extends Part>) new PowerSteeringBelt.Factory());
    partFactories.add((Factory<? extends Part>) new GeneratorBelt.Factory());
    partFactories.add((Factory<? extends Part>) new NullFactory.Factory());
  }
  private static Random rand = new Random(47);
  public static Part createRandom() {
    int n = rand.nextInt(partFactories.size());
    return partFactories.get(n).create();
  }
}	

class Filter extends Part {}

class FuelFilter extends Filter {
  // Create a Class Factory for each specific type:
  public static class Factory
  implements mypackage.Factory<FuelFilter> {
    public FuelFilter create() { return new FuelFilter(); }
  }
}

class AirFilter extends Filter {
  public static class Factory
  implements mypackage.Factory<AirFilter> {
    public AirFilter create() { return new AirFilter(); }
  }
}	

class CabinAirFilter extends Filter {
  public static class Factory
  implements mypackage.Factory<CabinAirFilter> {
    public CabinAirFilter create() {
      return new CabinAirFilter();
    }
  }
}

class OilFilter extends Filter {
  public static class Factory
  implements mypackage.Factory<OilFilter> {
    public OilFilter create() { return new OilFilter(); }
  }
}	

class Belt extends Part {}

class FanBelt extends Belt {
  public static class Factory
  implements mypackage.Factory<FanBelt> {
    public FanBelt create() { return new FanBelt(); }
  }
}

class GeneratorBelt extends Belt {
  public static class Factory
  implements mypackage.Factory<GeneratorBelt> {
    public GeneratorBelt create() {
      return new GeneratorBelt();
    }
  }
}	

class PowerSteeringBelt extends Belt {
  public static class Factory
  implements mypackage.Factory<PowerSteeringBelt> {
    public PowerSteeringBelt create() {
      return new PowerSteeringBelt();
    }
  }
}

class NullFactory extends Part implements Null
{
	public static class Factory implements mypackage.Factory<NullFactory>
	{
		public NullFactory create()
		{
			return new NullFactory();
		}
	}
	
}

public class RegisteredFactories {
  public static void main(String[] args) {
    for(int i = 0; i < 50; i++)
      System.out.println(Part.createRandom());
  }
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~

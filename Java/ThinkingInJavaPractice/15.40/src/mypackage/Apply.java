//: generics/Apply.java
package mypackage;
// {main: ApplyTest}
import java.lang.reflect.*;
import java.util.*;

import typeinfo.pets.Pet;

import static net.mindview.util.Print.*;

public class Apply {
  public static <T, S extends Iterable<? extends T>>
  void apply(S seq, Method f, Object... args) {
    try {
      for(T t: seq)
        f.invoke(t, args);
    } catch(Exception e) {
      // Failures are programmer errors
      throw new RuntimeException(e);
    }
  }
}	

class Shape {
  public void rotate() { print(this + " rotate"); }
  public void resize(int newSize) {
    print(this + " resize " + newSize);
  }
}

class Square extends Shape {}

class FilledList<T> extends ArrayList<T> {
  public FilledList(Class<? extends T> type, int size) {
    try {
      for(int i = 0; i < size; i++)
        // Assumes default constructor:
        add(type.newInstance());
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}	

class ApplyTest {
  public static void main(String[] args) throws Exception {
    ArrayList<typeinfo.pets.Pet> myList=new ArrayList<typeinfo.pets.Pet>();
    myList.add(new typeinfo.pets.Cat());
    Method speak=Pet.class.getMethod("speak");
    Apply.apply(myList, speak, null);
  }
} /* (Execute to see output) *///:~

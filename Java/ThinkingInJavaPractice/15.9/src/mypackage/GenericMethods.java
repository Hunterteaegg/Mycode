//: generics/GenericMethods.java
package mypackage;

public class GenericMethods {
  public <T,U,V> void f(T x,U y,V z) {
    System.out.println(x.getClass().getName());
    System.out.println(y.getClass().getName());
    System.out.println(z.getClass().getName());
    System.out.println();
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("","My Couple",2);
    gm.f(1,2.36,55.6788d);
    gm.f(1.0,new Object(),'b');
    gm.f(1.0F,4748949848949845416l,"nothing");
    gm.f('c',true,(byte)0);
    gm.f(gm,456,'d');
  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~

//: typeinfo/pets/Pet.java
package mypackage;

public class Pet extends Individual {
  public Pet(String name) { super(name); }
  public Pet() { super(); }
  public String toString()
  {
	  return this.getClass().getSimpleName();
  }
}
///:~

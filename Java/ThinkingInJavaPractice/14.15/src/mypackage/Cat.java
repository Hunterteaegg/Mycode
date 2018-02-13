//: typeinfo/pets/Cat.java
package mypackage;

public class Cat extends Pet implements Factory<Cat> {
  public Cat(String name) { super(name); }
  public Cat() { super(); }
  public Cat create()
  {
	  return new Cat();
  }
} ///:~

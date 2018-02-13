//: typeinfo/pets/Dog.java
package mypackage;

public class Dog extends Pet implements Factory<Dog>{
  public Dog(String name) { super(name); }
  public Dog() { super(); }
  public Dog create()
  {
	  return new Dog();
  }
} ///:~

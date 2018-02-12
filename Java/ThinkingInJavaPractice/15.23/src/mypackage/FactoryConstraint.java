//: generics/FactoryConstraint.java
package mypackage;

interface FactoryI<T> {
  T create(String s);
}

class Foo2<T> {
  private T x;
  public <F extends FactoryI<T>> Foo2(F factory) {
    x = factory.create("Create "+x.getClass().getSimpleName()+" Succeedingly");
  }
  // ...
}

class IntegerFactory implements FactoryI<Integer> {
  public Integer create(String s) {
    return new Integer(0);
  }
}	

class Widget {
  public static class Factory implements FactoryI<Widget> {
    public Widget create(String s) {
      return new Widget();
    }
  }
}

public class FactoryConstraint {
  public static void main(String[] args) {
    new Foo2<Integer>(new IntegerFactory());
    new Foo2<Widget>(new Widget.Factory());
  }
} ///:~

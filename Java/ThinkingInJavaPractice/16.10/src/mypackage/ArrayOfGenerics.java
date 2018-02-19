//: arrays/ArrayOfGenerics.java
// It is possible to create arrays of generics.
package mypackage;

import java.util.*;

public class ArrayOfGenerics {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    List<String> myList=new ArrayList<String>(Arrays.asList("My World","My Home"));
    
    System.out.println(myList);
  }
} ///:~

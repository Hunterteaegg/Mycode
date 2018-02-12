//: net/mindview/util/Sets.java
package mypackage;
import java.util.*;

public class Sets {
  public static <T> Set<T> union(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<T>(a);
    result.addAll(b);
    
    return result;
  }
  
  public static <E extends Enum<E>> EnumSet<E> union(EnumSet<E> a,EnumSet<E> b)
  {
	  EnumSet<E> result=a.clone();
	  result.addAll(b);
	  
	  return result;
  }
  
  public static <T>
  Set<T> intersection(Set<T> a, Set<T> b) {
    Set<T> result = new HashSet<T>(a);
    result.retainAll(b);
    
    return result;
  }	
  
  public static <E extends Enum<E>> EnumSet<E> intersection(EnumSet<E> a,EnumSet<E> b)
  {
	  EnumSet<E> result=a.clone();
	  result.retainAll(b);
	  
	  return result;
  }
  
  // Subtract subset from superset:
  public static <T> Set<T>
  difference(Set<T> superset, Set<T> subset) {
    Set<T> result = new HashSet<T>(superset);
    result.removeAll(subset);
    
    return result;
  }
  
  public static <E extends Enum<E>> EnumSet<E> difference(EnumSet<E> a,EnumSet<E>b)
  {
	  EnumSet<E> result=a.clone();
	  result.removeAll(b);
	  
	  return result;
  }
  
  // Reflexive--everything not in the intersection:
  public static <T> Set<T> complement(Set<T> a, Set<T> b) {
    return difference(union(a, b), intersection(a, b));
  }
  
  public static <E extends Enum<E>> EnumSet<E> complement(EnumSet<E> a,EnumSet<E> b)
  {
	  return difference(union(a, b),intersection(a, b));
  }
} ///:~

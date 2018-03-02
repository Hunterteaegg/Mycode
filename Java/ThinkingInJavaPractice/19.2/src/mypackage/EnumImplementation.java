//: enumerated/cartoons/EnumImplementation.java
// An enum can implement an interface
package mypackage;
import java.util.*;
import net.mindview.util.*;

enum CartoonCharacter {
  SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
  public static CartoonCharacter next() {
	int i=0;
	Random rand = new Random(++i);
    return values()[rand.nextInt(values().length)];
  }
}

public class EnumImplementation {
  public static void printNext(CartoonCharacter rg) {
    System.out.print(rg.next() + ", ");
  }
  public static void main(String[] args) {
    // Choose any instance:
    CartoonCharacter cc = CartoonCharacter.BOB;
    for(int i = 0; i < 10; i++)
      printNext(cc);
  }
} /* Output:
BOB, PUNCHY, BOB, SPANKY, NUTTY, PUNCHY, SLAPPY, NUTTY, NUTTY, SLAPPY,
*///:~

package test;

//: generics/Fibonacci.java
// Generate a Fibonacci sequence.
import net.mindview.util.*;

public class Fibonacci implements Generator<Integer> {
	private static int idCount=0;
	private final int id=idCount++;
	public Fibonacci(int start) {
		// TODO 自动生成的构造函数存根
		this.count=start;
	}
  private int count;
  public Integer next() { return fib(count++); }
  private int fib(int n) {
    if(n < 2) return 1;
    return fib(n-2) + fib(n-1);
  }
  public void main(int start) {
    Fibonacci gen = new Fibonacci(start);
    for(int i = 0; i < 18; i++)
      System.out.println("#"+id+"("+gen.next() + ") ");
  }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~

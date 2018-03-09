import java.sql.Time;
import java.util.concurrent.TimeUnit;

//: concurrency/SimpleThread.java
// Inheriting directly from the Thread class.

public class SimpleThread extends Thread {
  private int countDown = 5;
  private static int threadCount = 0;
  public SimpleThread() {
    // Store the thread name:
    super(Integer.toString(++threadCount));
    start();
  }
  public String toString() {
    return "#" + getName() + "(" + countDown + "), ";
  }
  public void run() {
    while(true) {
      System.out.print(this);
      if(--countDown == 0)
        return;
    }
  }
  public static void main(String[] args) throws InterruptedException {
    for(int i = 0; i < 5; i++)
    {
     SimpleThread st=new SimpleThread();
     st.setDaemon(true);
     st.start();
  }
    TimeUnit.SECONDS.sleep(10);
}
}/* Output:
#1(5), #1(4), #1(3), #1(2), #1(1), #2(5), #2(4), #2(3), #2(2), #2(1), #3(5), #3(4), #3(3), #3(2), #3(1), #4(5), #4(4), #4(3), #4(2), #4(1), #5(5), #5(4), #5(3), #5(2), #5(1),
*///:~

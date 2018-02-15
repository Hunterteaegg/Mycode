//: generics/Mixins.java
package mypackage;

import java.util.*;

interface TimeStamped { long getStamp(); }

class TimeStampedImp implements TimeStamped {
  private final long timeStamp;
  public TimeStampedImp() {
    timeStamp = new Date().getTime();
  }
  public long getStamp() { return timeStamp; }
}

interface SerialNumbered { long getSerialNumber(); }

class SerialNumberedImp implements SerialNumbered {
  private static long counter = 1;
  private final long serialNumber = counter++;
  public long getSerialNumber() { return serialNumber; }
}

interface Basic {
  public void set(String val);
  public String get();
}

class BasicImp implements Basic {
  private String value;
  public void set(String val) { value = val; }
  public String get() { return value; }
}

interface Stringname
{
	String returnname();
}

class StringnameImp implements Stringname
{
	String name;
	
	public StringnameImp(String name) {
		// TODO 自动生成的构造函数存根
		this.name=name;
	}
	public String returnname()
	{
		return name;
	}
}

class Mixin extends BasicImp
implements TimeStamped, SerialNumbered ,Stringname{
  private TimeStamped timeStamp = new TimeStampedImp();
  private SerialNumbered serialNumber =
    new SerialNumberedImp();
  private StringnameImp stringname=new StringnameImp("Hello World");
  public long getStamp() { return timeStamp.getStamp(); }
  public long getSerialNumber() {
    return serialNumber.getSerialNumber();
  }
  public String returnname()
  {
	  return stringname.returnname();
  }
}

public class Mixins {
  public static void main(String[] args) {
    Mixin mixin1 = new Mixin(), mixin2 = new Mixin();
    mixin1.set("test string 1");
    mixin2.set("test string 2");
    System.out.println(mixin1.get() + " " +
      mixin1.getStamp() +  " " + mixin1.getSerialNumber()+" "+mixin1.returnname());
    System.out.println(mixin2.get() + " " +
      mixin2.getStamp() +  " " + mixin2.getSerialNumber()+" "+mixin2.returnname());
  }
} /* Output: (Sample)
test string 1 1132437151359 1
test string 2 1132437151359 2
*///:~

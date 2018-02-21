//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)
package mypackage;

interface Payable<T> {}

class Employee implements Payable {}
class Hourly extends Employee
  implements Payable {} ///:~

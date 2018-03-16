package mypackage;

import java.util.concurrent.TimeUnit;

//: gui/HelloSwing.java
import javax.swing.*;

public class HelloSwing {
  public static void main(String[] args) throws InterruptedException {
    JFrame frame = new JFrame("Hello Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
    JLabel label1=new JLabel("Go on");
    frame.add(label1);
    TimeUnit.SECONDS.sleep(3);
    JLabel label2=new JLabel("Hello world");
    frame.add(label2);
  }
} ///:~

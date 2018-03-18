package mypackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.mindview.util.SwingConsole;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new MyClass(), 20, 10);

	}

}

class MyClass extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1075680063457320210L;
	private JButton b1=new JButton("Button1"),b2=new JButton("Button2"),b3=new JButton("Button3");
	private JTextField textField=new JTextField(10);
	private JCheckBox checkBox=new JCheckBox("Test");

	public MyClass() {
		// TODO 自动生成的构造函数存根
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				textField.setText("Hello World");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				textField.setText("Hello SCAU");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				textField.setText("Hello Guangzhou");
			}
		});
		checkBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				textField.setText("Checkout!");
			}
		});
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(textField);
		this.add(checkBox);
	}
}
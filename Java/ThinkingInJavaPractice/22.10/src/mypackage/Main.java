package mypackage;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import net.mindview.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new MyFrame(), 50, 25);

	}

}

class MyFrame extends JFrame
{
	private JButton button=new JButton("My Button");
	private JTextField textField=new JTextField(10);
	
	protected class MyMouseListener extends MouseAdapter
	{
		@Override
		public void mouseEntered(MouseEvent e)
		{
			textField.setText("Hello World");
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			textField.setText("");
		}
	}
	
	public MyFrame() {
		// TODO 自动生成的构造函数存根
		this.setLayout(new FlowLayout());
		button.addMouseListener(new MyMouseListener());
		this.add(button);
		this.add(textField);
	}
}
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
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵĹ��캯�����
		this.setLayout(new FlowLayout());
		button.addMouseListener(new MyMouseListener());
		this.add(button);
		this.add(textField);
	}
}
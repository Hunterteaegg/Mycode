package mypackage;

import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.mindview.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SwingConsole.run(new MyWin(), 20, 30);

	}

}

class MyWin extends JFrame
{
	private JButton button=new JButton("Button");
	
	public MyWin() {
		// TODO �Զ����ɵĹ��캯�����
		button.setCursor(Cursor.getDefaultCursor());
		this.setLayout(new FlowLayout());
		this.add(button);
	}
}
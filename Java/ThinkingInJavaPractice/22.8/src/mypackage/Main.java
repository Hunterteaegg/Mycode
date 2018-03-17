package mypackage;

import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.mindview.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new MyWin(), 20, 30);

	}

}

class MyWin extends JFrame
{
	private JButton button=new JButton("Button");
	
	public MyWin() {
		// TODO 自动生成的构造函数存根
		button.setCursor(Cursor.getDefaultCursor());
		this.setLayout(new FlowLayout());
		this.add(button);
	}
}
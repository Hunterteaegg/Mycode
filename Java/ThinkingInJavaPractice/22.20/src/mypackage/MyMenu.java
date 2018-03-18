package mypackage;

import java.awt.FlowLayout;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import net.mindview.util.*;

public class MyMenu extends JFrame {
	private JMenuBar jMenuBar=new JMenuBar();
	
	public MyMenu() {
		// TODO 自动生成的构造函数存根
		try {
			FileInputStream inputStream=new FileInputStream("test.txt");
			DataInputStream dataInputStream=new DataInputStream(inputStream);
			String[] name=dataInputStream.readLine().split(" ");
			JMenu jMenu=new JMenu(name[0]);
			JMenuItem jMenuItem=new JMenuItem(name[1]);
			this.setLayout(new FlowLayout());
			jMenu.add(jMenuItem);
			jMenuBar.add(jMenu);
			this.add(jMenuBar);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new MyMenu(), 20, 10);

	}

}

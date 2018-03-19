package mypackage;

import java.awt.FlowLayout;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import net.mindview.util.SwingConsole;

public class Shower extends JFrame {
	private JProgressBar jpb=new JProgressBar(0,500);
	
	public Shower() throws InterruptedException {
		// TODO 自动生成的构造函数存根
		this.setLayout(new FlowLayout());
		this.add(jpb);
		jpb.setValue(0);
		
		for(int i=0;i<500;i++)
		{
			jpb.setValue(i);
			
			if(i>300)
			{
				;
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		SwingConsole.run(new Shower(), 50, 25);

	}

}


package mypackage;

import net.mindview.util.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RGB_Show extends JFrame {
	private JSlider red=new JSlider(1,255,100),green=new JSlider(1,255,100),blue=new JSlider(1,255,100);
	private JTextField status=new JTextField(30);
	private ChangeListener rgbListenner=new ChangeListener() {
		
		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO 自动生成的方法存根
			status.setText("RED="+red.getValue()+",GREEN="+green.getValue()+",BLUE="+blue.getValue());
			
		}
	};
	
	public RGB_Show() {
		// TODO 自动生成的构造函数存根
		this.setLayout(new FlowLayout());
		this.add(red);
		this.add(green);
		this.add(blue);
		this.add(status);
		status.setEditable(false);
		red.addChangeListener(rgbListenner);
		green.addChangeListener(rgbListenner);
		blue.addChangeListener(rgbListenner);
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new RGB_Show(), 50 ,30);

	}

}

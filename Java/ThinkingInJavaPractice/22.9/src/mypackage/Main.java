package mypackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.mindview.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new ShowMethods(), 50, 25);

	}

}

class ShowMethods extends JFrame
{
	/*
	 * component
	 */
	private JButton match=new JButton("Match!");
	private JTextField input=new JTextField(10);
	private JTextField regex=new JTextField(5);
	private JTextArea output=new JTextArea(10, 5);
	
	public ShowMethods() {
		// TODO 自动生成的构造函数存根
		match.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				try {
					Class<?> c=Class.forName(input.getText());
					Method[] methods=c.getMethods();
					Constructor[] ctors=c.getConstructors();
					Pattern pattern=Pattern.compile(regex.getText());
					
					for(Method method:methods)
					{
						output.append(pattern.matcher(method.toString()).replaceAll("")+"\n");
					}
					for(Constructor<?> ctor:ctors)
					{
						output.append(pattern.matcher(ctor.toString()).replaceAll("")+"\n");
					}
 				} catch (ClassNotFoundException e) {
					// TODO 自动生成的 catch 块
					output.setText("[Class Not Found]");
				}
			}
		});
		this.setLayout(new FlowLayout());
		this.add(input);
		this.add(regex);
		this.add(output);
		this.add(match);
	}
}
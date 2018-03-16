package mypackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.mindview.util.*;

public class TestRugularExpression {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new Test(), 50, 30);

	}

}

class Test extends JFrame
{
	private JButton matcher=new JButton("Match");
	private JTextArea input=new JTextArea(20,40),output=new JTextArea(20,40);
	private JTextField regex=new JTextField(10);
	String text,regularExp;
	
	public Test() {
		// TODO 自动生成的构造函数存根
		
		/*
		 * add a search event to matcher
		 */
		this.matcher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				/*
				 * obtain some source
				 */
				text=input.getText();
				regularExp=regex.getText();
				
				/*
				 * matching
				 */
				Matcher m=Pattern.compile(regularExp).matcher(text);
				while(m.find())
				{
					output.append("Match \""+m.group()+"\" at positions "+m.start()+"-"+(m.end()-1)+"\n");
				}
			}
		});
		
		/*
		 * add all elements
		 */
		this.setLayout(new FlowLayout());
		this.add(this.matcher);
		this.add(input);
		this.add(regex);
		this.add(output);
		this.add(new JScrollPane(output));
	}
}
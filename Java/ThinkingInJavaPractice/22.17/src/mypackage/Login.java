package mypackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import net.mindview.util.SwingConsole;

public class Login extends JFrame {
	private String password="SCAU";
	private JPasswordField enterPassworld=new JPasswordField(10);
	private JButton summit=new JButton("Login");
	
	public Login() {
		// TODO 自动生成的构造函数存根
		this.setLayout(new FlowLayout());
		this.add(enterPassworld);
		this.add(summit);
		summit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				if(enterPassworld.getText().equals(password))
				{
					JOptionPane.showConfirmDialog(null, "Login sucessfully","Tips",JOptionPane.YES_NO_OPTION);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Login failed", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			}
		});
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SwingConsole.run(new Login(), 20, 10);

	}

}

package code;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Postfee extends JFrame {
	/*
	 * initialize status
	 */
	private enum CountryStatus {
			DOMESTIC,HK_MC_TW,FOREIGNAL
	}
	private enum MailType{
		MAIL,POSTCARD,PRESSWORK
	}
	private enum MailTran{
		AIR,AIR_SHIP,SHIP
	}
	private CountryStatus status=CountryStatus.DOMESTIC;
	private MailType mailType=MailType.MAIL;
	private MailTran mailTran=MailTran.SHIP;
	
	private final ButtonGroup mailTYPE = new ButtonGroup();
	private boolean registered=false;
	private boolean outCity=true;
	private StringBuilder output=new StringBuilder();
	private final ButtonGroup isRegistered = new ButtonGroup();
	private JTextField domestic_mass;
	private double mass=0;
	private final ButtonGroup cityType = new ButtonGroup();
	private JTextArea demostic_price;
	private JTextArea h_price;
	private JTextField H_mass;
	
	
	/*
	 * add a output result and auto-clean function 
	 */
	private void print()
	{
		demostic_price.setText(output.toString());
		output.delete(0, output.length()-1);
	}
	private void h_print()
	{
		h_price.setText(output.toString());
		output.delete(0, output.length()-1);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Postfee frame = new Postfee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public Postfee() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());  //set windows system UI
		
		setTitle("\u90AE\u653F\u8D44\u8D39\u8BA1\u7B97\u5668");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Postfee.class.getResource("/icon/Icon.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 399);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 0, 533, 350);
		getContentPane().add(tabbedPane);
		
		JPanel domestic = new JPanel();
		tabbedPane.addTab("\u56FD\u5185\u8D44\u8D39", null, domestic, null);
		domestic.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 220, 508, 91);
		domestic.add(scrollPane);
		
		
		JTextArea domestic_price = new JTextArea();
		scrollPane.setViewportView(domestic_price);
		this.demostic_price=domestic_price;
		
		JPanel domestic_type = new JPanel();
		domestic_type.setBounds(10, 10, 79, 116);
		domestic.add(domestic_type);
		domestic_type.setLayout(null);
		
		JLabel label_type_demoestic = new JLabel("\u7C7B\u578B");
		label_type_demoestic.setBounds(23, 10, 24, 15);
		domestic_type.add(label_type_demoestic);
		
		JRadioButton domestic_mail = new JRadioButton("\u4FE1\u4EF6");
		domestic_mail.setSelected(true);
		mailTYPE.add(domestic_mail);
		domestic_mail.setBounds(6, 31, 54, 23);
		domestic_type.add(domestic_mail);
		domestic_mail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				mailType=MailType.MAIL;
			}
		});
		
		JRadioButton domestic_postcard = new JRadioButton("\u660E\u4FE1\u7247");
		mailTYPE.add(domestic_postcard);
		domestic_postcard.setBounds(6, 56, 66, 23);
		domestic_type.add(domestic_postcard);
		domestic_postcard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				mailType=MailType.POSTCARD;
			}
		});
		
		JRadioButton domestic_presswork = new JRadioButton("\u5370\u5237\u54C1");
		mailTYPE.add(domestic_presswork);
		domestic_presswork.setBounds(6, 81, 66, 23);
		domestic_type.add(domestic_presswork);
		domestic_presswork.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				mailType=MailType.PRESSWORK;
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(99, 10, 79, 116);
		domestic.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u6302\u53F7");
		label.setBounds(25, 10, 24, 15);
		panel.add(label);
		
		JRadioButton registeredMail = new JRadioButton("\u6302\u53F7");
		isRegistered.add(registeredMail);
		registeredMail.setBounds(0, 31, 73, 23);
		panel.add(registeredMail);
		registeredMail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				registered=true;
			}
		});
		
		JRadioButton NoneRegisteredMail = new JRadioButton("\u975E\u6302\u53F7");
		isRegistered.add(NoneRegisteredMail);
		NoneRegisteredMail.setSelected(true);
		NoneRegisteredMail.setBounds(0, 76, 73, 23);
		panel.add(NoneRegisteredMail);
		
		domestic_mass = new JTextField();
		domestic_mass.setBounds(287, 10, 231, 116);
		domestic.add(domestic_mass);
		domestic_mass.setColumns(10);
		
		JButton domestic_cal = new JButton("\u8BA1\u7B97");
		domestic_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				domestic_mass.setText("0");
				mass=Double.parseDouble(domestic_mass.getText());
				int registeredFee=0;
				
				/*
				 * registered mail fee
				 */
				if(registered)
				{
					if(registeredFee!=3)
					{
						registeredFee=3;
					}
					output.append("挂号\n");
				}
				else
				{
					if(registeredFee!=0)
					{
						registeredFee=0;
					}
					output.append("非挂号\n");
				}
				
				/*
				 * mail fee
				 */
				if(mailType==MailType.MAIL)
				{
					output.append("信件:\n");
					
					if(outCity)
					{
						
						if(mass<=100)
						{
							int layer=(int) (mass/20);
							if(mass%20!=0)
							{
								layer++;
							}
							
							output.append("邮费为"+(float)(1.2*layer+registeredFee)+"元\n");
							print();
						}
						else
						{
							int layer=(int) ((mass-100)/100);
							if(mass%100!=0)
							{
								layer++;
							}
							
							output.append("邮费为"+(float)(6+2*layer+registeredFee)+"元\n");
							print();
						}
					}
					else
					{
						if(mass<=100)
						{
							int layer=(int) (mass/20);
							if(mass%20!=0)
							{
								layer++;
							}
							
							output.append("邮费为"+(float)(layer*0.8+registeredFee)+"元\n");
							print();
						}
						else
						{
							int layer=(int) ((mass-100)/100);
							if(mass%100!=0)
							{
								layer++;
							}
							
							output.append("邮费为"+(float)(4+1.2*layer+registeredFee)+"元\n");
						}
					}
				}
				/*
				 * postcard fee
				 */
				else if (mailType==MailType.POSTCARD)
				{
					output.append("明信片:\n");
					output.append("邮费为"+(0.8+registeredFee)+"元\n");
					print();
				}
				/*
				 * presswork fee
				 */
				else {
					output.append("印刷品:\n");
					
					if(mass<=100)
					{
						if (outCity) {
							output.append("邮费为"+(1.2+registeredFee)+"元\n");
							print();
						}
						else
						{
							output.append("邮费为"+(0.8+registeredFee)+"元\n");
							print();
						}
					}
					else {
						if(outCity)
						{
							int layer=(int) ((mass-100)/100);
							if(mass%100!=0)
							{
								layer++;
							}
							
							output.append("邮费为"+(float)(registeredFee+(1.2+layer*0.4))+"元\n");
						}
						else
						{
							int layer=(int) ((mass-100)/100);
							if (mass%100!=0) {
								layer++;
							}
							
							output.append("邮费为"+(float)(registeredFee+(0.8+layer*0.2))+"元\n");
						}
					}
				}
			}
		});
		domestic_cal.setBounds(197, 169, 93, 23);
		domestic.add(domestic_cal);
		
		JPanel outCITY = new JPanel();
		outCITY.setBounds(187, 10, 79, 116);
		domestic.add(outCITY);
		outCITY.setLayout(null);
		
		JLabel label_1 = new JLabel("\u5916\u961C");
		label_1.setBounds(25, 10, 24, 15);
		outCITY.add(label_1);
		
		JRadioButton outcity = new JRadioButton("\u5916\u5E02");
		outcity.setSelected(true);
		cityType.add(outcity);
		outcity.setBounds(6, 31, 67, 23);
		outCITY.add(outcity);
		outcity.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				outCity=true;
			}
		});
		
		JRadioButton local = new JRadioButton("\u672C\u5E02");
		cityType.add(local);
		local.setBounds(6, 75, 67, 23);
		outCITY.add(local);
		local.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				outCity=false;
			}
		});
		domestic_mass.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				;
			}
		});
		NoneRegisteredMail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				registered=false;
			}
		});
		
		JPanel HK_MC_TW = new JPanel();
		tabbedPane.addTab("\u6E2F\u6FB3\u53F0\u8D44\u8D39", null, HK_MC_TW, null);
		HK_MC_TW.setLayout(null);
		
		JTextArea HMT_price = new JTextArea();
		this.h_price=HMT_price;
		HMT_price.setBounds(10, 220, 508, 91);
		HK_MC_TW.add(HMT_price);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 81, 116);
		HK_MC_TW.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("\u7C7B\u578B");
		label_2.setBounds(25, 10, 29, 15);
		panel_1.add(label_2);
		
		JRadioButton H_mail = new JRadioButton("\u4FE1\u4EF6");
		H_mail.setSelected(true);
		mailTYPE.add(H_mail);
		H_mail.setBounds(6, 31, 69, 23);
		panel_1.add(H_mail);
		H_mail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				mailType=MailType.MAIL;
			}
		});
		
		JRadioButton H_postcard = new JRadioButton("\u660E\u4FE1\u7247");
		mailTYPE.add(H_postcard);
		H_postcard.setBounds(6, 71, 69, 23);
		panel_1.add(H_postcard);
		H_postcard.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				mailType=MailType.POSTCARD;
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(101, 10, 81, 116);
		HK_MC_TW.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("\u6302\u53F7");
		label_3.setBounds(26, 10, 32, 15);
		panel_2.add(label_3);
		
		JRadioButton H_registered = new JRadioButton("\u6302\u53F7");
		isRegistered.add(H_registered);
		H_registered.setBounds(6, 31, 69, 23);
		panel_2.add(H_registered);
		H_registered.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				registered=true;
			}
		});
		
		JRadioButton H_NoneRegistered = new JRadioButton("\u975E\u6302\u53F7");
		isRegistered.add(H_NoneRegistered);
		H_NoneRegistered.setSelected(true);
		H_NoneRegistered.setBounds(6, 72, 69, 23);
		panel_2.add(H_NoneRegistered);
		H_NoneRegistered.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				registered=false;
			}
		});
		
		H_mass = new JTextField();
		H_mass.setText("0");
		H_mass.setBounds(214, 10, 268, 116);
		HK_MC_TW.add(H_mass);
		H_mass.setColumns(10);
		
		JButton H_cal = new JButton("\u8BA1\u7B97");
		H_cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mass=Float.parseFloat(H_mass.getText());
				
				int registeredFee=0;
				
				//add registered fee
				if(registered)
				{
					output.append("挂号\n");
					registeredFee=16;
				}
				else
				{
					output.append("非挂号\n");
					registeredFee=0;
				}
				
				//calculate and publish the price with laws
				if(mailType==MailType.MAIL)
				{
					output.append("信件:\n");
					if(mass<=20)
					{
						output.append("邮费为"+(3.5+registeredFee)+"元\n");
						h_print();
					}
					else
					{
						int layer=(int)((mass-20)/10);
						if((mass-20)%10!=0)
						{
							layer++;
						}
						
						output.append("邮费为"+(3.5+layer*1.5+registeredFee)+"元\n");
						h_print();
					}
				}
				else
				{
					output.append("明信片:\n");
					output.append("邮费为"+3.5+"元\n");
					h_print();
				}
			}
		});
		H_cal.setBounds(222, 167, 93, 23);
		HK_MC_TW.add(H_cal);
		
		JPanel foreignal = new JPanel();
		tabbedPane.addTab("\u56FD\u9645\u8D44\u8D39", null, foreignal, null);
		foreignal.setLayout(null);
		
		/*
		 * add optionalArea listener
		 */
		domestic.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				status=CountryStatus.DOMESTIC;
			}
		});
		HK_MC_TW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				status=CountryStatus.HK_MC_TW;
			}
		});
		foreignal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				status=CountryStatus.FOREIGNAL;
			}
		});
		
		
		JTextArea foreignal_price = new JTextArea();
		foreignal_price.setBounds(10, 220, 508, 91);
		foreignal.add(foreignal_price);
	}
}

/*
 *
 *
 *从登录界面点了注册按钮之后的界面。
 
 */
package FinalTask;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginWindow {
	public void LoginUI(){
		JFrame frame =new JFrame();
		frame.setTitle("注册");
		frame.setSize(500,400);
		//关闭
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		JPanel panel =new JPanel(null);
		//设置账号的标签
		JLabel LabAccount = new JLabel("账号：");
		LabAccount.setLocation(50,50);
		LabAccount.setSize(100,50);
		panel.add(LabAccount);
		//设置输入账号的文本框
		JTextField AccountText = new JTextField();
		AccountText.setLocation(180,50);
		AccountText.setSize(180,30);
		panel.add(AccountText);
		//设置密码的标签
		JLabel LabPasswd = new JLabel("密码：");
		LabPasswd.setLocation(50,110);
		LabPasswd.setSize(100,50);
		panel.add(LabPasswd);
		//设置输入密码的文本框
		JPasswordField PasswdText = new JPasswordField();
		PasswdText.setLocation(180,110);
		PasswdText.setSize(180,30);
		panel.add(PasswdText);
		//设置再次密码的标签
		JLabel LabPasswdJudge = new JLabel("再次输入密码：");
		LabPasswdJudge.setLocation(25,170);
		LabPasswdJudge.setSize(100,50);
		panel.add(LabPasswdJudge);
		//设置输入密码的文本框
		JPasswordField PasswdTextJudge = new JPasswordField();
		PasswdTextJudge.setLocation(180,170);
		PasswdTextJudge.setSize(180,30);
		panel.add(PasswdTextJudge);
		//注册按钮
		Dimension DimButton = new Dimension(100,30);
		JButton ButtonNext = new JButton();
		ButtonNext.setText("注册");
		ButtonNext.setLocation(100,325);
		ButtonNext.setSize(DimButton);
		panel.add(ButtonNext);
		//关闭按钮
		JButton close1 = new JButton("关闭");
		close1.setLocation(300,325);
		close1.setSize(DimButton);
		panel.add(close1);
		frame.setContentPane(panel);
		close1.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
		});
	
		//注册按钮监听事件
		LoginNextListener ButtonNextListener = new LoginNextListener(frame,PasswdText,PasswdTextJudge,AccountText);
		ButtonNext.addActionListener(ButtonNextListener);
		
	}
}

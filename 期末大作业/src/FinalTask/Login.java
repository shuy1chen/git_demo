/*
  
  *
  *主界面的实现ui
 */
package FinalTask;
import java.awt.*;
import javax.swing.*;
public class Login {
	
	public static void main(String[] args) {
		Login login =new Login();
		login.initUi();
		
	}
	public void initUi() {
		//设置整个的窗口
		JFrame frame =new JFrame();
		frame.setTitle("Login");
		frame.setSize(400,250);
		//关闭
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		//设置流式的布局
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,10);
		frame.setLayout(flow);
		//设置账号的标签
		JLabel LabAccount = new JLabel("账号：");
		
		frame.add(LabAccount);
		//设置输入账号的文本框
		JTextField AccountText = new JTextField();
		Dimension DimText = new Dimension(300,30);
		AccountText.setPreferredSize(DimText);
		frame.add(AccountText);
		//设置密码的标签
		JLabel LabPasswd = new JLabel("密码：");
		
		frame.add(LabPasswd);
		//设置输入密码的文本框
		JPasswordField PasswdText = new JPasswordField();
		PasswdText.setPreferredSize(DimText);
		frame.add(PasswdText);
		//设置登录按钮
		JButton ButtonRegister = new JButton();
		Dimension DimButton = new Dimension(100,30);
		ButtonRegister.setText("登录");
		
		ButtonRegister.setSize(DimButton);
		frame.add(ButtonRegister);
		//设置注册按钮
		JButton ButtonLogin = new JButton();
		ButtonLogin.setText("注册");
		
		ButtonLogin.setSize(DimButton);
		frame.add(ButtonLogin);
		frame.setVisible(true);
		Listener ButtonListener = new Listener(frame,AccountText,PasswdText);
		ButtonRegister.addActionListener(ButtonListener);
		LoginListener ButtonLoginListener =new LoginListener(frame);
		ButtonLogin.addActionListener(ButtonLoginListener);
		
	}
}

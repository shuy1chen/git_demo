/*
  
  *
  *�������ʵ��ui
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
		//���������Ĵ���
		JFrame frame =new JFrame();
		frame.setTitle("Login");
		frame.setSize(400,250);
		//�ر�
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		//������ʽ�Ĳ���
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,10);
		frame.setLayout(flow);
		//�����˺ŵı�ǩ
		JLabel LabAccount = new JLabel("�˺ţ�");
		
		frame.add(LabAccount);
		//���������˺ŵ��ı���
		JTextField AccountText = new JTextField();
		Dimension DimText = new Dimension(300,30);
		AccountText.setPreferredSize(DimText);
		frame.add(AccountText);
		//��������ı�ǩ
		JLabel LabPasswd = new JLabel("���룺");
		
		frame.add(LabPasswd);
		//��������������ı���
		JPasswordField PasswdText = new JPasswordField();
		PasswdText.setPreferredSize(DimText);
		frame.add(PasswdText);
		//���õ�¼��ť
		JButton ButtonRegister = new JButton();
		Dimension DimButton = new Dimension(100,30);
		ButtonRegister.setText("��¼");
		
		ButtonRegister.setSize(DimButton);
		frame.add(ButtonRegister);
		//����ע�ᰴť
		JButton ButtonLogin = new JButton();
		ButtonLogin.setText("ע��");
		
		ButtonLogin.setSize(DimButton);
		frame.add(ButtonLogin);
		frame.setVisible(true);
		Listener ButtonListener = new Listener(frame,AccountText,PasswdText);
		ButtonRegister.addActionListener(ButtonListener);
		LoginListener ButtonLoginListener =new LoginListener(frame);
		ButtonLogin.addActionListener(ButtonLoginListener);
		
	}
}

/*
 *
 *
 *�ӵ�¼�������ע�ᰴť֮��Ľ��档
 
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
		frame.setTitle("ע��");
		frame.setSize(500,400);
		//�ر�
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		JPanel panel =new JPanel(null);
		//�����˺ŵı�ǩ
		JLabel LabAccount = new JLabel("�˺ţ�");
		LabAccount.setLocation(50,50);
		LabAccount.setSize(100,50);
		panel.add(LabAccount);
		//���������˺ŵ��ı���
		JTextField AccountText = new JTextField();
		AccountText.setLocation(180,50);
		AccountText.setSize(180,30);
		panel.add(AccountText);
		//��������ı�ǩ
		JLabel LabPasswd = new JLabel("���룺");
		LabPasswd.setLocation(50,110);
		LabPasswd.setSize(100,50);
		panel.add(LabPasswd);
		//��������������ı���
		JPasswordField PasswdText = new JPasswordField();
		PasswdText.setLocation(180,110);
		PasswdText.setSize(180,30);
		panel.add(PasswdText);
		//�����ٴ�����ı�ǩ
		JLabel LabPasswdJudge = new JLabel("�ٴ��������룺");
		LabPasswdJudge.setLocation(25,170);
		LabPasswdJudge.setSize(100,50);
		panel.add(LabPasswdJudge);
		//��������������ı���
		JPasswordField PasswdTextJudge = new JPasswordField();
		PasswdTextJudge.setLocation(180,170);
		PasswdTextJudge.setSize(180,30);
		panel.add(PasswdTextJudge);
		//ע�ᰴť
		Dimension DimButton = new Dimension(100,30);
		JButton ButtonNext = new JButton();
		ButtonNext.setText("ע��");
		ButtonNext.setLocation(100,325);
		ButtonNext.setSize(DimButton);
		panel.add(ButtonNext);
		//�رհ�ť
		JButton close1 = new JButton("�ر�");
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
	
		//ע�ᰴť�����¼�
		LoginNextListener ButtonNextListener = new LoginNextListener(frame,PasswdText,PasswdTextJudge,AccountText);
		ButtonNext.addActionListener(ButtonNextListener);
		
	}
}

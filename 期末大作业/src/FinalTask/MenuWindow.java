/*
 * 
 * ��¼֮��Ľ��棬�������и���ģ��
 */
package FinalTask;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuWindow {
	private Admin use ;
	public void setAdmin(Admin use) {
		this.use =use;
		//System.out.println(use.getUseName());
	}
	public void MenuUI() {
	JFrame frame =new JFrame();
	frame.setTitle("��ʷѧϰ��");
	frame.setSize(800,600);
	frame.setDefaultCloseOperation(3);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	frame.setVisible(true);
	//���������ֱ�Ӷ�λ��ǩ��λ��
	JPanel panel =new JPanel(null);
	JButton button =new JButton("��ʷ֪ʶ֪����");
	button.setLocation(100,300);
	button.setSize(150,50);
	panel.add(button);
	JButton buttonTwo =new JButton("���а�");
	buttonTwo.setLocation(300,300);
	buttonTwo.setSize(100,50);
	panel.add(buttonTwo);
	JButton buttonThree =new JButton("����");
	buttonThree.setLocation(450,300);
	buttonThree.setSize(100,50);
	panel.add(buttonThree);
	JButton buttonFour =new JButton("�����ѧϰ");
	buttonFour.setLocation(600,300);
	buttonFour.setSize(100,50);
	panel.add(buttonFour);
	frame.setContentPane(panel);
	JButton buttonFive =new JButton("������Ϣ");
	buttonFive.setLocation(600,100);
	buttonFive.setSize(100,50);
	panel.add(buttonFive);
	frame.setContentPane(panel);
	//�����
	button.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			HistoryPart Part = new HistoryPart();
			
			Part.setAdmin(use);
			Part.HistoryUI();
			
		}
	});
	//���а�
	buttonTwo.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Rank rank =new Rank();
			rank.setAdmin(use);
			rank.RankUI();
			
			
		}
	});
	//������
	buttonThree.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Forum forum =new Forum();
			forum.setAdmin(use);
			forum.ForumUI();
			
		}
	});
	//��ѧϰ��
	buttonFour.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Study study =new Study();
			study.setAdmin(use);
			study.StudyUI();
			
		}
	});
	//������Ϣ��ť��
	buttonFive.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Info info =new Info();
			info.setAdmin(use);
			info.infoUi();
			
		}
	});
}
}

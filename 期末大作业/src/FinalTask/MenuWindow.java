/*
 * 
 * 登录之后的界面，界面中有各种模块
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
	frame.setTitle("党史学习器");
	frame.setSize(800,600);
	frame.setDefaultCloseOperation(3);
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	frame.setVisible(true);
	//采用坐标的直接定位标签的位置
	JPanel panel =new JPanel(null);
	JButton button =new JButton("党史知识知多少");
	button.setLocation(100,300);
	button.setSize(150,50);
	panel.add(button);
	JButton buttonTwo =new JButton("排行榜");
	buttonTwo.setLocation(300,300);
	buttonTwo.setSize(100,50);
	panel.add(buttonTwo);
	JButton buttonThree =new JButton("社区");
	buttonThree.setLocation(450,300);
	buttonThree.setSize(100,50);
	panel.add(buttonThree);
	JButton buttonFour =new JButton("青年大学习");
	buttonFour.setLocation(600,300);
	buttonFour.setSize(100,50);
	panel.add(buttonFour);
	frame.setContentPane(panel);
	JButton buttonFive =new JButton("个人信息");
	buttonFive.setLocation(600,100);
	buttonFive.setSize(100,50);
	panel.add(buttonFive);
	frame.setContentPane(panel);
	//答题绑定
	button.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			HistoryPart Part = new HistoryPart();
			
			Part.setAdmin(use);
			Part.HistoryUI();
			
		}
	});
	//排行榜
	buttonTwo.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Rank rank =new Rank();
			rank.setAdmin(use);
			rank.RankUI();
			
			
		}
	});
	//社区绑定
	buttonThree.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Forum forum =new Forum();
			forum.setAdmin(use);
			forum.ForumUI();
			
		}
	});
	//大学习绑定
	buttonFour.addActionListener(new ActionListener() {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			Study study =new Study();
			study.setAdmin(use);
			study.StudyUI();
			
		}
	});
	//个人信息按钮绑定
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

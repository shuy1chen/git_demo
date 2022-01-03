package FinalTask;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Info {
	private Admin use;
	public void setAdmin(Admin use) {
		this.use =use;
	}
	public void infoUi() {
		JFrame frame =new JFrame();
		frame.setTitle("个人信息");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		//
		JPanel panel =new JPanel(null);
		JLabel num1 = new JLabel("用户");
		num1.setLocation(100,100);
		num1.setSize(100,50);
		panel.add(num1);
		JLabel num1Account = new JLabel(use.getUseName());
		num1Account.setLocation(250,100);
		num1Account.setSize(100,50);
		panel.add(num1Account);
		//
		JLabel num2 = new JLabel("个人积分");
		num2.setLocation(100,200);
		num2.setSize(100,50);
		panel.add(num2);
		JLabel num2score = new JLabel(Integer.toString(use.getScore()));
		num2score.setLocation(250,200);
		num2score.setSize(100,50);
		panel.add(num2score);
		//
		JButton close1 = new JButton("关闭");
		close1.setLocation(250,400);
		close1.setSize(80,25);
		panel.add(close1);
 
		close1.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
		});
		frame.setContentPane(panel);
	}
}

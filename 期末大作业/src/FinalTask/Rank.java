package FinalTask;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rank {
	private Admin use;
	public void setAdmin(Admin use) {
		this.use = use;
	}
	@SuppressWarnings("unchecked")
	public void RankUI() {
		JFrame frame =new JFrame();
		frame.setTitle("积分榜");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		JPanel panel =new JPanel(null);
		JLabel num1 = new JLabel("第一名");
		num1.setLocation(100,100);
		num1.setSize(100,50);
		panel.add(num1);
		JLabel num1Account = new JLabel("用户");
		num1Account.setLocation(250,50);
		num1Account.setSize(100,50);
		panel.add(num1Account);
		JLabel num1Score = new JLabel("积分");
		num1Score.setLocation(450,50);
		num1Score.setSize(100,50);
		panel.add(num1Score);
		JLabel num2 = new JLabel("第二名");
		num2.setLocation(100,200);
		num2.setSize(100,50);
		panel.add(num2);
		JLabel num3 = new JLabel("第三名");
		num3.setLocation(100,300);
		num3.setSize(100,50);
		panel.add(num3);
		//关闭按钮
		
		JButton close1 = new JButton("退出");
		Dimension DimButton = new Dimension(100,50);
		close1.setLocation(300,450);
		close1.setSize(DimButton);
		
		panel.add(close1);
		
		close1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
		});
		//在文本中找到分数前三名的
		ArrayList<Integer>scoreList = new ArrayList<>();
		String str1;
		int flag = 0;
		try {
            @SuppressWarnings("resource")
			var in = new BufferedReader(new FileReader("use.txt"));
            while((str1 = in.readLine()) !=null) { 
            	flag++;
            	if( flag%3==2) {
            		scoreList.add(Integer.parseInt(str1));
            	}
            }
            
			
		}
		catch (IOException e) {

		}
		Comparator reverseComparator = Collections.reverseOrder();
		
		Collections.sort(scoreList,reverseComparator);
		int xFlag=0;
		String str2 = null,strAccount,strScore,strPasswd;
		for(int num:scoreList) {
			
			
			try {
				var in = new BufferedReader(new FileReader("use.txt"));
				while((strAccount=in.readLine())!=null) {
						if (xFlag==3) break;
		
						strScore = in.readLine();
						strPasswd = in.readLine();
						if(Integer.parseInt(strScore)==num && !strAccount.equals(str2)) {
							//Admin user = new Admin(strAccount,strPasswd,Integer.parseInt(strScore));
							xFlag++;
							str2=strAccount;
							
							JLabel numAccount = new JLabel(strAccount);
							JLabel numScore = new JLabel(strScore);
							numAccount.setLocation(250,xFlag*100);
							
							numAccount.setSize(100,50);
							numScore.setLocation(450,xFlag*100);
							numScore.setSize(100,50);
							panel.add(numAccount);
							panel.add(numScore);
							break;
						}
						
						
				}
				
				
			}
			catch(IOException e1) {}
			
			
		}
		frame.setContentPane(panel);
	}
}

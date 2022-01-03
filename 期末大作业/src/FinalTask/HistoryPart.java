/*
 * 
 * 
 * 党史答题环节，随机从题库中抽取题目，答对会有积分加
 */
package FinalTask;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HistoryPart {
	private Admin use ;
	public void setAdmin(Admin use) {
		this.use = use;
	}
	public static final int Total=30;
	String str1,str,strA,strB,strC,strD,strE;
	int i =0;
	public void HistoryUI() {
		JFrame frame =new JFrame();
		frame.setTitle("党史知多少");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		Random rand = new Random();
		i =rand.nextInt(Total)+1;

		 try {		 
	            @SuppressWarnings("resource")
				var in = new BufferedReader(new FileReader("question.txt"));
	            while((str1 = in.readLine()) !=null) { 
	            	if(str1.equals(Integer.toString(i)) ) {  //从题库中找到随机生成的题目
	            		 str = in.readLine();	          
	 	  	            strA = in.readLine();
	 	  	            strB = in.readLine();
	 	  	            strC = in.readLine();
	 	  	            strD = in.readLine();
	 	  	            strE = in.readLine();
	 	  	            break;
	            	}
	            	
	            }
	          
		 }catch (IOException e1) {
    	}
		 //设置题目和答案
		 JLabel  Qlabel =new JLabel(str);
		 JPanel panel =new JPanel(null);
		 Qlabel.setLocation(50,100);
		 Qlabel.setSize(800,50);
		 panel.add(Qlabel);
		JButton buttonA =new JButton(strA);
		buttonA.setLocation(25,200);
		buttonA.setSize(150,50);
		panel.add(buttonA);
		JButton buttonB =new JButton(strB);
		buttonB.setLocation(225,200);
		buttonB.setSize(150,50);
		panel.add(buttonB);
		JButton buttonC =new JButton(strC);
		buttonC.setLocation(425,200);
		buttonC.setSize(150,50);
		panel.add(buttonC);
		JButton buttonD =new JButton(strD);
		buttonD.setLocation(625,200);
		buttonD.setSize(150,50);
		panel.add(buttonD);
		
		//A
		AnswerButton doA=new AnswerButton();
		doA.setAdmin(use);
		doA.getAnswer(buttonA, frame, strE);
		
		//B
		AnswerButton doB = new AnswerButton();
		doB.setAdmin(use);
		doB.getAnswer(buttonB, frame, strE);
		//C
		AnswerButton doC=new AnswerButton();
		doC.setAdmin(use);
		doC.getAnswer(buttonC, frame, strE);
		//D
		AnswerButton doD=new AnswerButton();
		doD.setAdmin(use);
		doD.getAnswer(buttonD, frame, strE);
		// 设置退出按钮
		JButton close1 = new JButton("退出");
		close1.setLocation(350,350);
		close1.setSize(100,50);
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

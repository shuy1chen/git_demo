/*
 * 党史问题中对每个回答的按钮绑定进行一个封装
 * 
 * 
 * 
 */
package FinalTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnswerButton {
	 int scoreFlag =0;
	private  Admin user ;
	public void setAdmin(Admin user) {
		this.user = user;
	}
	
	public void getAnswer(JButton button,JFrame frame,String strE) {
		
		
		button.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				int tmpScore=0;
				String str1,str;
				frame.dispose();
				HistoryPart Part = new HistoryPart();
				Part.setAdmin(user);
				Part.HistoryUI();
				
				if(button.getText().equals(strE)) {
					
					Errorwindow Viwindow = new Errorwindow();
					tmpScore = user.getScore();
					tmpScore++;
					user.setAdmin(user.getUseName(),user.getPasswd(),tmpScore);
					//改变存放在文本中记录该用户的积分值，通过内存将文本所有的内容读入内存，再改变积分的值再写入文本
					 try {		 
				            @SuppressWarnings("resource")
							var in = new BufferedReader(new FileReader("use.txt"));
				            StringBuffer buf = new StringBuffer();
				        
				            while((str1 = in.readLine()) !=null) { 
				            	scoreFlag++;
				            	if(str1.equals(user.getUseName())&&scoreFlag%3==1) {
				            		buf = buf.append(str1);
				            		buf = buf.append(System.getProperty("line.separator"));
				            		str1 = in.readLine();
				            		buf=buf.append(user.getScore());
				            		buf = buf.append(System.getProperty("line.separator"));
				            	}
				            	else {
				            		buf = buf.append(str1);
				            		buf = buf.append(System.getProperty("line.separator"));
				            	}
				            	
				            }
				            BufferedWriter out = new BufferedWriter(new FileWriter("use.txt"));
				            out.write(buf.toString().toCharArray());
				            out.flush();
				            out.close();
				         
				            
			          }
				            catch (IOException e1) {
			    	}
					Viwindow.getWindow("回答正确");
					
				}else {
					Errorwindow Viwindow = new Errorwindow();
					Viwindow.getWindow("回答错误");
				}
				

				
			}
		});
}
}


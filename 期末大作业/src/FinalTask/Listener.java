/*
 *
 *登录界面，登录按钮的绑定，当点击登录之后干的事情。这里包括对账号密码的判断，如果文本里没有账号则输出用户名不存在，
 *如果密码错误则输出密码错误
 */
package FinalTask;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
public  class Listener implements ActionListener {
    	String str,strnext,strscore;
    	
    	int a=0,accountFlag=0;
		private javax.swing.JTextField Account;
		private javax.swing.JPasswordField Passwd;
		private javax.swing.JFrame Window;
		public  Listener(javax.swing.JFrame Window,javax.swing.JTextField Account,javax.swing.JPasswordField Passwd) {
			this.Window=Window;
			this.Account=Account;
			this.Passwd = Passwd;
		}
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			
			 try {		
		            @SuppressWarnings("resource")
					BufferedReader in = new BufferedReader(new FileReader("use.txt"));

		            while ((str = in.readLine()) != null) {
		            	accountFlag++;
		                if(Account.getText().equals(str)&&accountFlag%3==1) {
		                	strscore=in.readLine();
		                	strnext = in.readLine();
		                	a=1;
		                	break;
		                }
		            }
		               if(a==0) {
		                	a=0;
		    				Errorwindow noAccountError = new Errorwindow();
		                	noAccountError.getWindow("用户名不存在");
		               }		               	
		        } catch (IOException e1) {}
			if(a==1&&Passwd.getText().equals(strnext)){
			 Admin Useinfo = new Admin(str, strnext,Integer.parseInt(strscore));
				
				MenuWindow Menu =new MenuWindow();
				Menu.setAdmin(Useinfo);
				Menu.MenuUI();
				Window.dispose();
			}
			else if(a==1&&!(Passwd.getText().equals(strnext))) {
				Errorwindow noAccountError = new Errorwindow();
            	noAccountError.getWindow("密码错误");
			}
		}


}

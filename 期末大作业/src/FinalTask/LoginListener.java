/*
 *
 *
 *主界面注册按钮的绑定，其实可以不用新建这样类
 */
package FinalTask;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
public class LoginListener implements ActionListener {  //开始界面的注册按钮事件
	public LoginListener(javax.swing.JFrame Window) {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		LoginWindow loginwindow=new LoginWindow();
		loginwindow.LoginUI();


				
	}
	
	
}

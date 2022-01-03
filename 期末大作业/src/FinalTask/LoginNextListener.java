/*
 *
 *
 * 点了注册之后的在第二个注册界面的按钮绑定，有对两次密码重复的判断，如果一样之后将账号密码加入文本。。。。如果不一样则输出两次密码不一样
 */
package FinalTask;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.*;
public class LoginNextListener implements ActionListener {
	private javax.swing.JPasswordField PasswdTextJudge;
	private javax.swing.JTextField Account;
	private javax.swing.JPasswordField PasswdText;
	private javax.swing.JFrame Window;
	public LoginNextListener(javax.swing.JFrame Window,javax.swing.JPasswordField PasswdTextJudge,javax.swing.JPasswordField PasswdText,javax.swing.JTextField Account) {
		  this.PasswdTextJudge=PasswdTextJudge;
		  this.PasswdText=PasswdText;
		  this.Window=Window;
		  this.Account=Account;
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		String str;
		int index =0;
		try {
			var in = new BufferedReader(new FileReader("use.txt"));
            while((str=in.readLine())!=null) {
            	index++;
            	if(str.equals(Account.getText()) && index%3==1) {
            		Errorwindow fail = new Errorwindow();
            		fail.getWindow("用户名已存在");
            		Window.dispose();
            		return;
    
            	}

            }
            in.close();
		}catch (IOException e1) {}
		
		if(PasswdText.getText().equals(Account.getText())) {
			Errorwindow error =new Errorwindow();
			error.getWindow("用户名与密码一致");
			Window.dispose();
			return ;
		}
		else if(PasswdText.getText().equals(PasswdTextJudge.getText())) {

			try {
	            BufferedWriter out = new BufferedWriter(new FileWriter("use.txt",true));
	            out.write(Account.getText());
	            out.newLine();
	            out.write("0");
	            out.newLine();
	            out.write(PasswdText.getText());
	            out.newLine();
	            out.close();
			}catch(IOException e1) {}
			Errorwindow success =new Errorwindow();
			success.getWindow("注册成功");
			Window.dispose();
		}
		else if(!PasswdText.getText().equals(PasswdTextJudge.getText())){//两次密码不一致显示错误
			Errorwindow error =new Errorwindow();
			error.getWindow("密码不一致");
			Window.dispose();
		}

	}
	
}

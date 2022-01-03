/*
 * 创建一个用户类，用来获取积分
 * 
 */
package FinalTask;

public class Admin {
	private static String useName;
	private static String usePasswd;
	private static int score;
	public Admin(String useName,String usePasswd,int score) {
		 this.useName =useName;
		this.usePasswd = usePasswd;
		this.score = score;
	}
	public void setAdmin(String useName,String usePasswd,int score) {
		this.useName=useName;
		this.usePasswd=usePasswd;
		this.score = score;
	}
	public String getUseName() {
		return useName;
	}
	public String getPasswd() {
		return usePasswd;
	}
	public int getScore() {
		return score;
	}
	
}

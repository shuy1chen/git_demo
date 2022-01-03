package FinalTask;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Forum {
	private Admin use;
	public void setAdmin(Admin use) {
		this.use =use;
	}

	public void ForumUI() {
		String str;
		StringBuffer buf = new StringBuffer();
		JFrame frame =new JFrame();
		frame.setTitle("社区");
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel =new JPanel();
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		try {
			var in = new BufferedReader(new FileReader("forum.txt"));
            while((str=in.readLine())!=null) {
            	textArea.append(str);
            	textArea.append(System.getProperty("line.separator"));
            }
            in.close();
		}catch (IOException e1) {}	
		int lines=(textArea.getLineCount());
		Dimension Dim = new Dimension(1000,lines*19);
		textArea.setPreferredSize(Dim);
	    JScrollPane scrollPane = new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    Dimension Dim1 = new Dimension(600,600);  
	  scrollPane.setPreferredSize(Dim1);
	    panel.add(scrollPane);
	    //留言组件
	    JTextArea text =new JTextArea();
	    text.setLineWrap(true);
	    Dimension Dim2 = new Dimension(500,100); 
	    text.setPreferredSize(Dim2);
	    panel.add(text);
	    //留言按钮
	    JButton setInfo = new JButton("留言");
	    panel.add(setInfo);
	    //按钮绑定
	    setInfo.addActionListener(new ActionListener() {
	    	 
			@Override
			public void actionPerformed(ActionEvent e) {
				setIn(text.getText());
				frame.dispose();
				ForumUI();
				Errorwindow message =new Errorwindow();
				message.getWindow("留言成功");
			}
		});
	    //
	    JButton close1 = new JButton("退出");
		panel.add(close1);
		 
		close1.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
		});
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
	public void setIn(String text) {
		try {
            @SuppressWarnings("resource")
			BufferedWriter out = new BufferedWriter(new FileWriter("forum.txt",true));
            out.write("用户     "+use.getUseName());
            out.newLine();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); 
            Date date = new Date();
            out.write(formatter.format(date));  
            out.newLine();
            out.write(text);
            out.newLine();
            out.close();
		}catch(IOException e) {}
		
	}
}

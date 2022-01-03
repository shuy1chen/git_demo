package FinalTask;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Study {
	public static final int Total =8; 
	private Admin use;
	public void setAdmin(Admin use) {
		this.use=use;
	}
	public void StudyUI() {
		String str,str1;
		int i=0;
		boolean flag=false;
		JFrame frame =new JFrame();
		frame.setTitle("青年大学习");
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		Random rand = new Random();
		i =rand.nextInt(Total)+1;
		
		try {
			var in = new BufferedReader(new FileReader("study.txt"));
            while((str=in.readLine())!=null) {
            	if(str.equals(Integer.toString(i))) {
            	
            		while((str1=in.readLine())!=null) {
            			if(str1.equals(Integer.toString(i+1))) {
            				flag=true;
            				break;
            			}
            			textArea.append(str1);
                    	textArea.append(System.getProperty("line.separator"));
            		}
            	if(flag) break;
            	}

            }
            in.close();
		}catch (IOException e1) {}
		Dimension Dim1 = new Dimension(600,300);  
		textArea.setPreferredSize(Dim1);
		panel.add(textArea);
		Dimension Dim2 = new Dimension(100,50); 
		JButton nextButton = new JButton("继续");
		panel.add(nextButton);
		JButton close1 = new JButton("退出");

		panel.add(close1);
 
		close1.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
			}
		});
		
		nextButton.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Study study =new Study();
				study.StudyUI();
			}
		});
		frame.setContentPane(panel);
	}
}

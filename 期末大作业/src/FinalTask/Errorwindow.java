/*
 * 
 * 创建一个小弹窗的类
 */
package FinalTask;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Errorwindow {
	public void getWindow(String str) {
		JFrame Frameerro =new JFrame();
		
		Frameerro.setSize(100,100);
		Frameerro.setDefaultCloseOperation(3);
		Frameerro.setLocationRelativeTo(null);
		Frameerro.setResizable(false);
		Frameerro.setVisible(true);
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,10,10);
		Frameerro.setLayout(flow);
		
		JLabel LabError = new JLabel(str);
		
		Frameerro.add(LabError);
		JButton close1 = new JButton("关闭");
		Dimension DimButton = new Dimension(10,10);
		
		close1.setSize(DimButton);
		Frameerro.add(close1);
 
		close1.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent e) {

				Frameerro.dispose();
			}
		});
	}
}

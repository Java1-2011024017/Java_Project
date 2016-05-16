package Sample_0516;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

	public MyFrame(){
		
		//Toolkit kit = Toolkit.getDefaultToolkit();
		//Dimension screenSize = kit.getScreenSize();
		//setSize(300,200);
		//setLocation(screenSize.width/2-150,screenSize.height/2-100);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setTitle("MyFrame");
		//setVisible(true);
		//setLayout(new FlowLayout());
		//JButton button = new JButton("button");
		//this.add(button);
		//setVisible(true);
		
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("짜바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("개수");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
		
	}
	
}

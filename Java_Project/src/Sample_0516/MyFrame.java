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
		
		JLabel label1 = new JLabel("¥�� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);
		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
		
	}
	
}

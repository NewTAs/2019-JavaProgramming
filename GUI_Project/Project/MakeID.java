import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class MakeID extends JFrame {
	
	int SWidth = 400, SHeight = 600;
	
	MakeID() {
		Toolkit Kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = Kit.getScreenSize();
		
		setLocation((ScreenSize.width / 2) - (SWidth / 2) + 250, (ScreenSize.height / 2) - (SHeight / 2)); //Login â�� ȭ���� ������� ���
		
		setSize(SWidth, SHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�ѱ��������б� ���� �ý��� ȸ������");
		
		setLayout(null);
		
		JLabel Label_MakeID_1 = new JLabel("ȸ������ �������Դϴ�.");
		Label_MakeID_1.setSize(300, 30);
		Label_MakeID_1.setLocation(125, 20);
		add(Label_MakeID_1);
		
		JLabel Label_MakeID_2 = new JLabel("ID");
		Label_MakeID_2.setSize(50, 30);
		Label_MakeID_2.setLocation(50, 50);
		add(Label_MakeID_2);
		
		JTextField TextField_Make_1 = new JTextField();
		
		
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MakeID();
	}

}

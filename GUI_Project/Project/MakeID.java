import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

class MakeID extends JFrame {

	int SWidth = 400, SHeight = 450;

	MakeID() {
		MakeID_ButtonClick MakeID_ButtonClick = new MakeID_ButtonClick();
		
		Toolkit Kit = Toolkit.getDefaultToolkit();
		Dimension ScreenSize = Kit.getScreenSize();

		setLocation((ScreenSize.width / 2) - (SWidth / 2) + 250, (ScreenSize.height / 2) - (SHeight / 2)); // Login â��
																											// ȭ���� �������
																											// ���

		setSize(SWidth, SHeight);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X�� �������� ���α׷��� ����Ǹ� �ȵ�.
		setTitle("�ѱ��������б� ���� �ý��� ȸ������");

		Font font = new Font((String) "a���13", (int) Font.BOLD, 12);

		setLayout(null);

		JLabel Label_MakeID_1 = new JLabel("�ѱ��������б� ���� ���α׷� ȸ �� �� ��");
		Label_MakeID_1.setSize(300, 30);
		Label_MakeID_1.setLocation(55, 10);
		Label_MakeID_1.setFont(new Font((String) "a���13", (int) Font.BOLD, 16));
		add(Label_MakeID_1);

		JLabel Label_MakeID_2 = new JLabel("���̵�");
		Label_MakeID_2.setSize(50, 25);
		Label_MakeID_2.setLocation(73, 60);
		Label_MakeID_2.setFont(font);
		add(Label_MakeID_2);

		JButton Button_MakeID_1 = new JButton("�ߺ�Ȯ��");
		Button_MakeID_1.setSize(85, 25);
		Button_MakeID_1.setLocation(280, 60);
		Button_MakeID_1.setFont(font);
		Button_MakeID_1.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_1);

		JTextField TextField_MakeID_1 = new JTextField();
		TextField_MakeID_1.setSize(150, 25);
		TextField_MakeID_1.setLocation(120, 60);
		TextField_MakeID_1.setFont(font);
		add(TextField_MakeID_1);

		JLabel Label_MakeID_3 = new JLabel("��й�ȣ");
		Label_MakeID_3.setSize(100, 25);
		Label_MakeID_3.setLocation(60, 95);
		Label_MakeID_3.setFont(font);
		add(Label_MakeID_3);

		JPasswordField PasswordField_MakeID_1 = new JPasswordField();
		PasswordField_MakeID_1.setSize(150, 25);
		PasswordField_MakeID_1.setLocation(120, 95);
		PasswordField_MakeID_1.setFont(font);
		add(PasswordField_MakeID_1);

		JLabel Label_MakeID_4 = new JLabel("��й�ȣ ��Ȯ��");
		Label_MakeID_4.setSize(150, 25);
		Label_MakeID_4.setLocation(25, 130);
		Label_MakeID_4.setFont(font);
		add(Label_MakeID_4);

		JPasswordField PasswordField_MakeID_2 = new JPasswordField();
		PasswordField_MakeID_2.setSize(150, 25);
		PasswordField_MakeID_2.setLocation(120, 130);
		PasswordField_MakeID_2.setFont(font);
		add(PasswordField_MakeID_2);

		JButton Button_MakeID_2 = new JButton("<html>��й�ȣ<br> ��Ȯ��</html>");
		Button_MakeID_2.setSize(85, 60);
		Button_MakeID_2.setLocation(280, 95);
		Button_MakeID_2.setFont(font);
		Button_MakeID_2.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_2);

		JLabel Label_MakeID_5 = new JLabel("�̸�");
		Label_MakeID_5.setSize(50, 25);
		Label_MakeID_5.setLocation(85, 165);
		Label_MakeID_5.setFont(font);
		add(Label_MakeID_5);

		JTextField TextField_MakeID_2 = new JTextField();
		TextField_MakeID_2.setSize(150, 25);
		TextField_MakeID_2.setLocation(120, 165);
		TextField_MakeID_2.setFont(font);
		add(TextField_MakeID_2);

		JLabel Label_MakeID_6 = new JLabel("�̵� ��ȭ��ȣ");
		Label_MakeID_6.setSize(150, 25);
		Label_MakeID_6.setLocation(38, 200);
		Label_MakeID_6.setFont(font);
		add(Label_MakeID_6);

		String Array_MakeID_1[] = { "010", "011", "017", "018", "019" };
		JComboBox ComboBox_MakeID_1 = new JComboBox(Array_MakeID_1);
		// ComboBox_MakeID_1.addItemListener();
		ComboBox_MakeID_1.setSize(50, 25);
		ComboBox_MakeID_1.setLocation(120, 200);
		ComboBox_MakeID_1.setFont(font);
		add(ComboBox_MakeID_1);

		JLabel Label_MakeID_7 = new JLabel("-");
		Label_MakeID_7.setSize(30, 25);
		Label_MakeID_7.setLocation(180, 200);
		Label_MakeID_7.setFont(font);
		add(Label_MakeID_7);

		JTextField TextField_MakeID_3 = new JTextField();
		TextField_MakeID_3.setSize(50, 25);
		TextField_MakeID_3.setLocation(195, 200);
		TextField_MakeID_3.setFont(font);
		add(TextField_MakeID_3);

		JLabel Label_MakeID_8 = new JLabel("-");
		Label_MakeID_8.setSize(30, 25);
		Label_MakeID_8.setLocation(255, 200);
		Label_MakeID_8.setFont(font);
		add(Label_MakeID_8);

		JTextField TextField_MakeID_4 = new JTextField();
		TextField_MakeID_4.setSize(50, 25);
		TextField_MakeID_4.setLocation(275, 200);
		TextField_MakeID_4.setFont(font);
		add(TextField_MakeID_4);

		JLabel Label_MakeID_9 = new JLabel("�������");
		Label_MakeID_9.setSize(50, 25);
		Label_MakeID_9.setLocation(63, 235);
		Label_MakeID_9.setFont(font);
		add(Label_MakeID_9);

		JTextField TextField_MakeID_5 = new JTextField();
		TextField_MakeID_5.setSize(50, 25);
		TextField_MakeID_5.setLocation(120, 235);
		TextField_MakeID_5.setFont(font);
		add(TextField_MakeID_5);

		JLabel Label_MakeID_10 = new JLabel("��");
		Label_MakeID_10.setSize(30, 25);
		Label_MakeID_10.setLocation(175, 235);
		Label_MakeID_10.setFont(font);
		add(Label_MakeID_10);

		String Array_MakeID_2[] = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��" };
		JComboBox ComboBox_MakeID_2 = new JComboBox(Array_MakeID_2);
		// ComboBox_MakeID_2.addItemListener();
		ComboBox_MakeID_2.setSize(60, 25);
		ComboBox_MakeID_2.setLocation(195, 235);
		ComboBox_MakeID_2.setFont(font);
		add(ComboBox_MakeID_2);

		String Array_MakeID_3[] = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��", "13��",
				"14��", "15��", "16��", "17��", "18��", "19��", "20��", "21��", "22��", "23��", "24��", "25��", "26��", "27��", "28��",
				"29��", "30��", "31��" };
		JComboBox ComboBox_MakeID_3 = new JComboBox(Array_MakeID_3);
		// ComboBox_MakeID_3.addItemListener();
		ComboBox_MakeID_3.setSize(60, 25);
		ComboBox_MakeID_3.setLocation(270, 235);
		ComboBox_MakeID_3.setFont(font);
		add(ComboBox_MakeID_3);
		
		JLabel Label_MakeID_11 = new JLabel("����");
		Label_MakeID_11.setSize(50, 25);
		Label_MakeID_11.setLocation(86, 270);
		Label_MakeID_11.setFont(font);
		add(Label_MakeID_11);
		
		String Array_MakeID_4[] = { "����", "����" };
		JComboBox ComboBox_MakeID_4 = new JComboBox(Array_MakeID_4);
		// ComboBox_MakeID_2.addItemListener();
		ComboBox_MakeID_4.setSize(150, 25);
		ComboBox_MakeID_4.setLocation(120, 270);
		ComboBox_MakeID_4.setFont(font);
		add(ComboBox_MakeID_4);
		
		JLabel Label_MakeID_12 = new JLabel("�г���");
		Label_MakeID_12.setSize(50, 25);
		Label_MakeID_12.setLocation(73, 305);
		Label_MakeID_12.setFont(font);
		add(Label_MakeID_12);

		JButton Button_MakeID_3 = new JButton("�ߺ� Ȯ��");
		Button_MakeID_3.setSize(85, 25);
		Button_MakeID_3.setLocation(280, 305);
		Button_MakeID_3.setFont(font);
		Button_MakeID_3.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_3);

		JTextField TextField_MakeID_6 = new JTextField();
		TextField_MakeID_6.setSize(150, 25);
		TextField_MakeID_6.setLocation(120, 305);
		TextField_MakeID_6.setFont(font);
		add(TextField_MakeID_6);
		
		JButton Button_MakeID_4 = new JButton("Ȯ��");
		Button_MakeID_4.setSize(85, 25);
		Button_MakeID_4.setLocation(80, 360);
		Button_MakeID_4.setFont(font);
		Button_MakeID_4.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_4);
		
		JButton Button_MakeID_5 = new JButton("���");
		Button_MakeID_5.setSize(85, 25);
		Button_MakeID_5.setLocation(225, 360);
		Button_MakeID_5.setFont(font);
		Button_MakeID_5.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_5);

		setVisible(true);
		setResizable(false);
	}
	
	class MakeID_ButtonClick implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton MakeID_Button_Clicker = (JButton) e.getSource();

			if (MakeID_Button_Clicker.getText().equals("�ߺ� Ȯ��")) {
				System.out.println("�ߺ� Ȯ�� ��ư");
			}
			/*if (MakeID_Button_Clicker.getText().equals("ID ã��"))
				System.out.println("ID ã�� ��ư");
			if (MakeID_Button_Clicker.getText().equals("PW ã��"))
				System.out.println("PW ã�� ��ư");
			if (MakeID_Button_Clicker.getText().equals("Login"))
				System.out.println("Login �Ϸ�");*/
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MakeID();
	}

}
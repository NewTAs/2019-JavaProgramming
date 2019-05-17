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

		setLocation((ScreenSize.width / 2) - (SWidth / 2) + 250, (ScreenSize.height / 2) - (SHeight / 2)); // Login 창을
																											// 화면의 정가운데에
																											// 띄움

		setSize(SWidth, SHeight);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X를 누르더라도 프로그램은 종료되면 안됨.
		setTitle("한국성서대학교 관리 시스템 회원가입");

		Font font = new Font((String) "a고딕13", (int) Font.BOLD, 12);

		setLayout(null);

		JLabel Label_MakeID_1 = new JLabel("한국성서대학교 관리 프로그램 회 원 가 입");
		Label_MakeID_1.setSize(300, 30);
		Label_MakeID_1.setLocation(55, 10);
		Label_MakeID_1.setFont(new Font((String) "a고딕13", (int) Font.BOLD, 16));
		add(Label_MakeID_1);

		JLabel Label_MakeID_2 = new JLabel("아이디");
		Label_MakeID_2.setSize(50, 25);
		Label_MakeID_2.setLocation(73, 60);
		Label_MakeID_2.setFont(font);
		add(Label_MakeID_2);

		JButton Button_MakeID_1 = new JButton("중복확인");
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

		JLabel Label_MakeID_3 = new JLabel("비밀번호");
		Label_MakeID_3.setSize(100, 25);
		Label_MakeID_3.setLocation(60, 95);
		Label_MakeID_3.setFont(font);
		add(Label_MakeID_3);

		JPasswordField PasswordField_MakeID_1 = new JPasswordField();
		PasswordField_MakeID_1.setSize(150, 25);
		PasswordField_MakeID_1.setLocation(120, 95);
		PasswordField_MakeID_1.setFont(font);
		add(PasswordField_MakeID_1);

		JLabel Label_MakeID_4 = new JLabel("비밀번호 재확인");
		Label_MakeID_4.setSize(150, 25);
		Label_MakeID_4.setLocation(25, 130);
		Label_MakeID_4.setFont(font);
		add(Label_MakeID_4);

		JPasswordField PasswordField_MakeID_2 = new JPasswordField();
		PasswordField_MakeID_2.setSize(150, 25);
		PasswordField_MakeID_2.setLocation(120, 130);
		PasswordField_MakeID_2.setFont(font);
		add(PasswordField_MakeID_2);

		JButton Button_MakeID_2 = new JButton("<html>비밀번호<br> 재확인</html>");
		Button_MakeID_2.setSize(85, 60);
		Button_MakeID_2.setLocation(280, 95);
		Button_MakeID_2.setFont(font);
		Button_MakeID_2.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_2);

		JLabel Label_MakeID_5 = new JLabel("이름");
		Label_MakeID_5.setSize(50, 25);
		Label_MakeID_5.setLocation(85, 165);
		Label_MakeID_5.setFont(font);
		add(Label_MakeID_5);

		JTextField TextField_MakeID_2 = new JTextField();
		TextField_MakeID_2.setSize(150, 25);
		TextField_MakeID_2.setLocation(120, 165);
		TextField_MakeID_2.setFont(font);
		add(TextField_MakeID_2);

		JLabel Label_MakeID_6 = new JLabel("이동 전화번호");
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

		JLabel Label_MakeID_9 = new JLabel("생년월일");
		Label_MakeID_9.setSize(50, 25);
		Label_MakeID_9.setLocation(63, 235);
		Label_MakeID_9.setFont(font);
		add(Label_MakeID_9);

		JTextField TextField_MakeID_5 = new JTextField();
		TextField_MakeID_5.setSize(50, 25);
		TextField_MakeID_5.setLocation(120, 235);
		TextField_MakeID_5.setFont(font);
		add(TextField_MakeID_5);

		JLabel Label_MakeID_10 = new JLabel("년");
		Label_MakeID_10.setSize(30, 25);
		Label_MakeID_10.setLocation(175, 235);
		Label_MakeID_10.setFont(font);
		add(Label_MakeID_10);

		String Array_MakeID_2[] = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
		JComboBox ComboBox_MakeID_2 = new JComboBox(Array_MakeID_2);
		// ComboBox_MakeID_2.addItemListener();
		ComboBox_MakeID_2.setSize(60, 25);
		ComboBox_MakeID_2.setLocation(195, 235);
		ComboBox_MakeID_2.setFont(font);
		add(ComboBox_MakeID_2);

		String Array_MakeID_3[] = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일",
				"14일", "15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일",
				"29일", "30일", "31일" };
		JComboBox ComboBox_MakeID_3 = new JComboBox(Array_MakeID_3);
		// ComboBox_MakeID_3.addItemListener();
		ComboBox_MakeID_3.setSize(60, 25);
		ComboBox_MakeID_3.setLocation(270, 235);
		ComboBox_MakeID_3.setFont(font);
		add(ComboBox_MakeID_3);
		
		JLabel Label_MakeID_11 = new JLabel("성별");
		Label_MakeID_11.setSize(50, 25);
		Label_MakeID_11.setLocation(86, 270);
		Label_MakeID_11.setFont(font);
		add(Label_MakeID_11);
		
		String Array_MakeID_4[] = { "남성", "여성" };
		JComboBox ComboBox_MakeID_4 = new JComboBox(Array_MakeID_4);
		// ComboBox_MakeID_2.addItemListener();
		ComboBox_MakeID_4.setSize(150, 25);
		ComboBox_MakeID_4.setLocation(120, 270);
		ComboBox_MakeID_4.setFont(font);
		add(ComboBox_MakeID_4);
		
		JLabel Label_MakeID_12 = new JLabel("닉네임");
		Label_MakeID_12.setSize(50, 25);
		Label_MakeID_12.setLocation(73, 305);
		Label_MakeID_12.setFont(font);
		add(Label_MakeID_12);

		JButton Button_MakeID_3 = new JButton("중복 확인");
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
		
		JButton Button_MakeID_4 = new JButton("확인");
		Button_MakeID_4.setSize(85, 25);
		Button_MakeID_4.setLocation(80, 360);
		Button_MakeID_4.setFont(font);
		Button_MakeID_4.addActionListener(MakeID_ButtonClick);
		add(Button_MakeID_4);
		
		JButton Button_MakeID_5 = new JButton("취소");
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

			if (MakeID_Button_Clicker.getText().equals("중복 확인")) {
				System.out.println("중복 확인 버튼");
			}
			/*if (MakeID_Button_Clicker.getText().equals("ID 찾기"))
				System.out.println("ID 찾기 버튼");
			if (MakeID_Button_Clicker.getText().equals("PW 찾기"))
				System.out.println("PW 찾기 버튼");
			if (MakeID_Button_Clicker.getText().equals("Login"))
				System.out.println("Login 완료");*/
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MakeID();
	}

}
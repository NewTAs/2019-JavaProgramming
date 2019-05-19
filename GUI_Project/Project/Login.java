import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class Login extends JFrame {

	int SWidth = 400, SHeight = 600; // Login â�� ���� �ȼ���, ���� �ȼ��� ũ�� ������ ���� ����

	Login() {
		Toolkit Kit = Toolkit.getDefaultToolkit(); // Toolkit ��ü ����(��� ���)
		Dimension ScreenSize = Kit.getScreenSize(); // ����� ȭ���� ũ�⸦ �ľ��ϴ� �Լ�

		setLocation((ScreenSize.width / 2) - (SWidth / 2) - 150, (ScreenSize.height / 2) - (SHeight / 2)); // Login â��
																											// ȭ���� �������
																											// ���

		setSize(SWidth, SHeight); // Loginâ�� ���� �ȼ��� ���� �ȼ� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X��ư�� ������ �� Loginâ ����
		setTitle("�ѱ��������б� ���� �ý��� LOGIN"); // Loginâ�� Title ����

		Font font = new Font((String)"a���13", (int)Font.BOLD, 12);
		
		setLayout(null); // ��ġ������ ���� (��� ��ġ�� ��ǥ�� ����)

		ButtonClick Login_ButtonClick = new ButtonClick();

		JLabel Label_Login_1 = new JLabel("ID");
		Label_Login_1.setSize(50, 30);
		Label_Login_1.setLocation(80, 300);
		Label_Login_1.setFont(font);
		add(Label_Login_1);

		JTextField TextField_Login_1 = new JTextField();
		TextField_Login_1.setSize(150, 30);
		TextField_Login_1.setLocation(100, 300);
		TextField_Login_1.setFont(font);
		add(TextField_Login_1);

		JLabel Label_Login_2 = new JLabel("PASSWORD");
		Label_Login_2.setSize(100, 30);
		Label_Login_2.setLocation(20, 340);
		Label_Login_2.setFont(font);
		add(Label_Login_2);

		JPasswordField PasswordField_Login_1 = new JPasswordField();
		PasswordField_Login_1.setSize(150, 30);
		PasswordField_Login_1.setLocation(100, 340);
		PasswordField_Login_1.setFont(font);
		add(PasswordField_Login_1);

		JButton Button_Login_1 = new JButton("Login");
		Button_Login_1.setSize(90, 70);
		Button_Login_1.setLocation(265, 300);
		Button_Login_1.addActionListener(Login_ButtonClick);
		Button_Login_1.setFont(font);
		add(Button_Login_1);

		JButton Button_Login_2 = new JButton("ID ã��");
		Button_Login_2.setSize(80, 25);
		Button_Login_2.setLocation(70, 380);
		Button_Login_2.addActionListener(Login_ButtonClick);
		Button_Login_2.setFont(font);
		add(Button_Login_2);

		JButton Button_Login_3 = new JButton("PW ã��");
		Button_Login_3.setSize(90, 25);
		Button_Login_3.setLocation(160, 380);
		Button_Login_3.addActionListener(Login_ButtonClick);
		Button_Login_3.setFont(font);
		add(Button_Login_3);

		JButton Button_Login_4 = new JButton("ȸ������");
		Button_Login_4.setSize(90, 25);
		Button_Login_4.setLocation(265, 380);
		Button_Login_4.addActionListener(Login_ButtonClick);
		Button_Login_4.setFont(font);
		add(Button_Login_4);

		setVisible(true);
		setResizable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login KBU_Login = new Login();

		XSSFRow row;
		XSSFCell cell;

		String Login_Array_1[][] = null;

		try {
			FileInputStream InputFile = new FileInputStream(
					"C:\\Users\\nacer\\Desktop\\���� �ǽ�\\�ڹٱ�� �������α׷���\\TEAMPROJECT_XLSX\\Login.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(InputFile);

			int SheetNums = Workbook.getNumberOfSheets(); // ���� ���� Sheet ����

			for (int SN = 0; SN < SheetNums; SN++) {
				XSSFSheet Sheet = Workbook.getSheetAt(SN);

				int Rows = Sheet.getPhysicalNumberOfRows();
				int Cells = Sheet.getRow(SN).getPhysicalNumberOfCells();
				Login_Array_1 = new String[Rows][Cells];

				for (int r = 0; r < Rows; r++) {
					row = Sheet.getRow(r);
					if (row != null) {
						for (int c = 0; c < Cells; c++) {
							Login_Array_1[r][c] = "" + row.getCell(c);
						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i = 0; i < Login_Array_1.length; i++) {
			for (int j = 0; j < Login_Array_1[i].length; j++)
				System.out.println(i + "," + j + "," + Login_Array_1[i][j]);
			System.out.println();
		}
	}

}
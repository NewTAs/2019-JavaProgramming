import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class Login extends JFrame {
	
	int SWidth = 400, SHeight = 600; //Login â�� ���� �ȼ���, ���� �ȼ��� ũ�� ������ ���� ����
	
	Login() {
		Toolkit Kit = Toolkit.getDefaultToolkit(); //Toolkit ��ü ����(��� ���)
		Dimension ScreenSize = Kit.getScreenSize(); //����� ȭ���� ũ�⸦ �ľ��ϴ� �Լ�
		
		setLocation((ScreenSize.width / 2) - (SWidth / 2), (ScreenSize.height / 2) - (SHeight / 2)); //Login â�� ȭ���� ������� ���
		
		setSize(SWidth, SHeight); //Loginâ�� ���� �ȼ��� ���� �ȼ� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X��ư�� ������ �� Loginâ ����
		setTitle("�ѱ��������б� ���� �ý��� LOGIN"); //Loginâ�� Title ����
		
		setLayout(null); //��ġ������ ���� (��� ��ġ�� ��ǥ�� ����)
		
		JLabel Label_Login_1 = new JLabel("ID");
		Label_Login_1.setSize(50, 30);
		Label_Login_1.setLocation(80, 300);
		add(Label_Login_1);
		
		JTextField TextField_Login_1 = new JTextField();
		TextField_Login_1.setSize(150, 30);
		TextField_Login_1.setLocation(100, 300);
		add(TextField_Login_1);
		
		JLabel Label_Login_2 = new JLabel("PASSWORD");
		Label_Login_2.setSize(100, 30);
		Label_Login_2.setLocation(20, 340);
		add(Label_Login_2);
		
		JPasswordField PasswordField_Login_1 = new JPasswordField();
		PasswordField_Login_1.setSize(150, 30);
		PasswordField_Login_1.setLocation(100, 340);
		add(PasswordField_Login_1);
		
		JButton Button_Login_1 = new JButton("Login");
		Button_Login_1.setSize(90, 70);
		Button_Login_1.setLocation(265, 300);
		add(Button_Login_1);
		
		JButton Button_Login_2 = new JButton("ID ã��");
		Button_Login_2.setSize(80, 25);
		Button_Login_2.setLocation(70, 380);
		add(Button_Login_2);
		
		JButton Button_Login_3 = new JButton("PW ã��");
		Button_Login_3.setSize(90, 25);
		Button_Login_3.setLocation(160, 380);
		add(Button_Login_3);
		
		JButton Button_Login_4 = new JButton("ȸ������");
		Button_Login_4.setSize(90, 25);
		Button_Login_4.setLocation(265, 380);
		add(Button_Login_4);
		
		setVisible(true);
		setResizable(false);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login KBU_Login = new Login();
		
		XSSFRow row;
		XSSFCell cell;
		
		try {
			FileInputStream Input = new FileInputStream("C:\\Users\\user\\Desktop\\���� �ǽ�\\�ڹٱ�� �������α׷���\\TEAMPROJECT_XLSX\\Login.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(Input);
			
			int SheetNum = Workbook.getNumberOfSheets(); //���� ���� Sheet ����
			
			for (int i = 0 ; i < SheetNum ; i++) {
				XSSFSheet Sheet = Workbook.getSheetAt(i);
				
				int RowNums = Sheet.getPhysicalNumberOfRows(); //���� sheet������ row�� ����
				int CellNums = Sheet.getRow(i).getPhysicalNumberOfCells(); //���� row������ cell�� ����
				String Login_Array_1[][] = new String[RowNums][CellNums];
				
				for (int j = 0 ; j < RowNums ; j++) {
					row = Sheet.getRow(j);
					if (row != null) {
						for (int k = 0 ; k < CellNums ; k++) {
							Login_Array_1[j][k] = "" + row.getCell(k);
						}
					}
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

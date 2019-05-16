import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import org.apache.poi.xssf.usermodel.*;

import java.io.*;

public class Login extends JFrame {
	
	int SWidth = 400, SHeight = 600; //Login 창의 가로 픽셀과, 세로 픽셀의 크기 저장할 변수 선언
	
	Login() {
		Toolkit Kit = Toolkit.getDefaultToolkit(); //Toolkit 객체 선언(기능 사용)
		Dimension ScreenSize = Kit.getScreenSize(); //사용자 화면의 크기를 파악하는 함수
		
		setLocation((ScreenSize.width / 2) - (SWidth / 2), (ScreenSize.height / 2) - (SHeight / 2)); //Login 창을 화면의 정가운데에 띄움
		
		setSize(SWidth, SHeight); //Login창의 가로 픽셀과 세로 픽셀 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X버튼을 눌렀을 때 Login창 종료
		setTitle("한국성서대학교 관리 시스템 LOGIN"); //Login창의 Title 제목
		
		setLayout(null); //배치관리자 제거 (모든 배치는 좌표로 설정)
		
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
		
		JButton Button_Login_2 = new JButton("ID 찾기");
		Button_Login_2.setSize(80, 25);
		Button_Login_2.setLocation(70, 380);
		add(Button_Login_2);
		
		JButton Button_Login_3 = new JButton("PW 찾기");
		Button_Login_3.setSize(90, 25);
		Button_Login_3.setLocation(160, 380);
		add(Button_Login_3);
		
		JButton Button_Login_4 = new JButton("회원가입");
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
			FileInputStream Input = new FileInputStream("C:\\Users\\user\\Desktop\\수업 실습\\자바기반 응용프로그래밍\\TEAMPROJECT_XLSX\\Login.xlsx");
			XSSFWorkbook Workbook = new XSSFWorkbook(Input);
			
			int SheetNum = Workbook.getNumberOfSheets(); //파일 내의 Sheet 개수
			
			for (int i = 0 ; i < SheetNum ; i++) {
				XSSFSheet Sheet = Workbook.getSheetAt(i);
				
				int RowNums = Sheet.getPhysicalNumberOfRows(); //얻은 sheet에서의 row의 개수
				int CellNums = Sheet.getRow(i).getPhysicalNumberOfCells(); //얻은 row에서의 cell의 개수
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

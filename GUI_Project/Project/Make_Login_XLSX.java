import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.*;

//파일 생성
public class Make_Login_XLSX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 출력 row 생성
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("ID_PW");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);

		row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("PASSWORD");
		row.createCell(2).setCellValue("NickName");

		row = sheet.createRow(1);
		row.createCell(0).setCellValue("ID EXAM1");
		row.createCell(1).setCellValue("PW EXAM1");
		row.createCell(2).setCellValue("NN EXAM1");
		
		row = sheet.createRow(2);
		row.createCell(0).setCellValue("ID EXAM2");
		row.createCell(1).setCellValue("PW EXAM2");
		row.createCell(2).setCellValue("NN EXAM2");
		
		row = sheet.createRow(3);
		row.createCell(0).setCellValue("ID EXAM3");
		row.createCell(1).setCellValue("PW EXAM3");
		row.createCell(2).setCellValue("NN EXAM3");
		
		// 출력 파일 위치및 파일명 설정
		try {
			FileOutputStream OutFile = new FileOutputStream(
					"C:\\Users\\nacer\\Desktop\\수업 실습\\자바기반 응용프로그래밍\\TEAMPROJECT_XLSX\\Login.xlsx");
			workbook.write(OutFile);
			OutFile.close();
			System.out.println("파일생성 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

import java.io.*;

//���� ����
public class Make_Login_XLSX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��� row ����
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
		
		// ��� ���� ��ġ�� ���ϸ� ����
		try {
			FileOutputStream OutFile = new FileOutputStream(
					"C:\\Users\\nacer\\Desktop\\���� �ǽ�\\�ڹٱ�� �������α׷���\\TEAMPROJECT_XLSX\\Login.xlsx");
			workbook.write(OutFile);
			OutFile.close();
			System.out.println("���ϻ��� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
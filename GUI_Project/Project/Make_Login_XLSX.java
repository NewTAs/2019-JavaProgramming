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

		// row = XSSFSheet.createRow(0);

		// ��� cell ����
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("PASSWORD");

		// ��� row ����
		row = sheet.createRow(1);

		// ��� cell ����
		row.createCell(0).setCellValue("chesed1020");
		row.createCell(1).setCellValue("chesed1020");
		row = sheet.createRow(2);

		// ��� cell ����
		row.createCell(0).setCellValue("newtas1020");
		row.createCell(1).setCellValue("newtas1020");

		// ��� ���� ��ġ�� ���ϸ� ����
		try {
			FileOutputStream OutFile = new FileOutputStream("C:\\Users\\user\\Desktop\\���� �ǽ�\\�ڹٱ�� �������α׷���\\TEAMPROJECT_XLSX\\Login.xlsx");
			workbook.write(OutFile);
			OutFile.close();
			System.out.println("���ϻ��� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

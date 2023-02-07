package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HadlingExcelRowCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/tsetScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
		short cellCount = wb.getSheet("InvalidLogin").getRow(1).getLastCellNum();
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String data = wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);

			}
		}

	}









}

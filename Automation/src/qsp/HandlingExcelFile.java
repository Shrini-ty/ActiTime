package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/tsetScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("InvalidLogin").getRow(1).getCell(1).getStringCellValue();
	System.out.println(data);
	String data2 = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
	System.out.println(data2);
	

	}

}

package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class handlingMultiExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/tsetScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCont = wb.getSheet("InvalidLogin").getLastRowNum();
		for(int i=0;i<=rowCont;i++) {
			String data = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String data2 = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(data+"  "+data2);
		}




	}

}

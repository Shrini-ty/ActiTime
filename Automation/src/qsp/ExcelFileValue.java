package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/tsetScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int row = wb.getSheet("CreateCustomer").getLastRowNum();
		  short hg = (short) wb.getSheet("CreateCustomer").getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<=row;i++) {
			for(int j=0;j<hg;j++) {
				String data = wb.getSheet("CreateCustomer").getRow(i).getCell(j).toString();
				System.out.print(data +"     ");
			}
			System.out.println();
		}
	


	}

}


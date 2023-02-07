package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenricSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		reName("CreateCustomer");

	}

	private static Object[][] reName(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/tsetScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] s = new Object[row-1][col];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				s[i-1][j] = sheet.getRow(i).getCell(j).toString();

			}
		}

			for (int j = 0; j < row-1; j++) {
				for (int l = 0; l < col; l++) {
					System.out.println(s[j][l] + "   ");
				}
				System.out.println();

			}
			return s;
			

		}

	}


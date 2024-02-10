package Generic_libarary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String getcellData(String sheetName,int RowNum, int cellNum ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		
		String data = WorkbookFactory.create(fis).getSheet(sheetName).getRow(RowNum).getCell(cellNum).getStringCellValue();
		
		return data;
		
	}
	
	public static String[][] getrowData(String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/riyakammi.xlsx");
		
		Workbook work = WorkbookFactory.create(fis);

		Sheet Sheet1 = work.getSheet(SheetName);
		
		int rowCount = Sheet1.getPhysicalNumberOfRows();
		
		int cloumnCount = Sheet1.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowCount-1][cloumnCount];
		for (int i=1;i<rowCount;i++) {
			for (int j=0;j<cloumnCount;j++) {
				data[i-1][j]=Sheet1.getRow(i).getCell(j).toString();
			}
			
		}
		return data;
		
	}

}

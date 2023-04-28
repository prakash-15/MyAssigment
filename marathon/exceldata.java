package marathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {

	public static String[][] Passdata(String FileName) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wbook= new XSSFWorkbook("./excel_data/"+FileName+".xlsx");
		
		XSSFSheet sheet= wbook.getSheetAt(0);
		//System.out.println("get in too "+sheet);
		
		int lastRowNum = sheet.getLastRowNum();
		//System.out.println("Number of Row is: "+lastRowNum);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		//System.out.println("Number of Column is: "+lastCellNum);
		
		XSSFCell cell = sheet.getRow(1).getCell(0);
		String Value = cell.getStringCellValue();
		//System.out.println(Value);
		
		String[][] data=new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <=lastRowNum; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j <lastCellNum; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				
				data[i-1][j]=stringCellValue;
				
				
			}
			
		}wbook.close();
		return data;
			
		}
		
	}
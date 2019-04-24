package mypack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelHelper {
	

	@DataProvider(name ="ExcelTestData")
	public static Object[][] getExcelData() throws IOException {

		Object[][] dataset = null;
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/Excel/testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Test1");

		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();
		dataset = new Object[totalRows - 1][totalCols];
		System.out.println(totalRows);
		System.out.println(totalCols);

		for (int i = 1; i < totalRows; i++) {

			for (int j = 0; j < totalCols; j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				if (cell.getCellType() == CellType.STRING) {
					dataset[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
				}

			}

		}

		return dataset;
	}

}

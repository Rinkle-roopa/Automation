package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/Book5.xlsx");
	    Workbook w=WorkbookFactory.create(fis);
	    String s = w.getSheet("Sheet1").getRow(0).getCell(0).toString();
	    System.out.println(s);
	 
	}
}

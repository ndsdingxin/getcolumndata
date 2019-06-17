

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	/**
	       * read the Excel file
	       * @param path the path of the Excel file
	       * @return
	       * @throws IOException
	       */
	      public List<WuLiao> readExcel(String path) throws IOException {
	          if (path == null || Common.EMPTY.equals(path)) {
	              return null;
	          } else {
	              String postfix = Util.getPostfix(path);
	              if (!Common.EMPTY.equals(postfix)) {
	            	  return readXlsx(path);
	                 /* if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
	                      return readXls(path);
	                  } else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
	                      return readXlsx(path);
	                  }*/
	              } else {
	                  System.out.println(path + Common.NOT_EXCEL_FILE);
	              }
	          }
	          return null;
	      }
	  
	      /**
	       * Read the Excel 2010
	       * @param path the path of the excel file
	       * @return
	       * @throws IOException
	       */
	      public List<WuLiao> readXlsx(String path) throws IOException {
	          System.out.println(Common.PROCESSING + path);
	          InputStream is = new FileInputStream(path);
	          XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
	          WuLiao wuliao = null;
	          List<WuLiao> list = new ArrayList<WuLiao>();
	          // Read the Sheet
	          for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
	              XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
	              if (xssfSheet == null) {
	                  continue;
	              }
	              // Read the Row
	              for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
	                  XSSFRow hssfRow = xssfSheet.getRow(rowNum);
	                  if (hssfRow != null) {
	                	    XSSFCell a1 = hssfRow.getCell(0);
		                     XSSFCell a2 = hssfRow.getCell(1);
		                     XSSFCell a3 = hssfRow.getCell(2);
		                     XSSFCell a4 = hssfRow.getCell(3);
		                     XSSFCell a5 = hssfRow.getCell(4);
		                     XSSFCell a6 = hssfRow.getCell(5);
		                     XSSFCell a7 = hssfRow.getCell(6);
		                     XSSFCell a8 = hssfRow.getCell(7);
		                     XSSFCell a9 = hssfRow.getCell(8);
		                     XSSFCell a10 = hssfRow.getCell(9);
		                     XSSFCell a11 = hssfRow.getCell(10);
		                     XSSFCell a12 = hssfRow.getCell(11);
		                     XSSFCell a13 = hssfRow.getCell(12);
		                     XSSFCell a14 = hssfRow.getCell(13);
		                     XSSFCell a15 = hssfRow.getCell(14);
		                     XSSFCell a16 = hssfRow.getCell(15);
		                    
		                     wuliao = new WuLiao(
		                    		 Float.valueOf(getValue(a1)),
		                    		 getValue(a2),
		                    		 getValue(a3),
		                    		 getValue(a4),
		                    		 getValue(a5),
		                    		 getValue(a6),
		                    		 getValue(a7),
		                    		 getValue(a8),
		                    		 getValue(a9),
		                    		 getValue(a10),
		                    		 getValue(a11),
		                    		 getValue(a12),
		                    		 getValue(a13),
		                    		 getValue(a14),
		                    		 getValue(a15),
		                    		 getValue(a16)
		                    		 );
		                     list.add(wuliao);
	                  }
	              }
	          }
	          return list;
	      }
	  
	      /**
	       * Read the Excel 2003-2007
	       * @param path the path of the Excel
	       * @return
	       * @throws IOException
	       */
	      public List<WuLiao> readXls(String path) throws IOException {
	         System.out.println(Common.PROCESSING + path);
	         InputStream is = new FileInputStream(path);
	         HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
	         WuLiao wuliao = null;
	         List<WuLiao> list = new ArrayList<WuLiao>();
	         // Read the Sheet
	         for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
	             HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
	             if (hssfSheet == null) {
	                 continue;
	             }
	             // Read the Row
	             for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
	                 HSSFRow hssfRow = hssfSheet.getRow(rowNum);
	                 if (hssfRow != null) {
	                	 HSSFCell a1 = hssfRow.getCell(0);
	                     HSSFCell a2 = hssfRow.getCell(1);
	                     HSSFCell a3 = hssfRow.getCell(2);
	                     HSSFCell a4 = hssfRow.getCell(3);
	                     HSSFCell a5 = hssfRow.getCell(4);
	                     HSSFCell a6 = hssfRow.getCell(5);
	                     HSSFCell a7 = hssfRow.getCell(6);
	                     HSSFCell a8 = hssfRow.getCell(7);
	                     HSSFCell a9 = hssfRow.getCell(8);
	                     HSSFCell a10 = hssfRow.getCell(9);
	                     HSSFCell a11 = hssfRow.getCell(10);
	                     HSSFCell a12 = hssfRow.getCell(11);
	                     HSSFCell a13 = hssfRow.getCell(12);
	                     HSSFCell a14 = hssfRow.getCell(13);
	                     HSSFCell a15 = hssfRow.getCell(14);
	                     HSSFCell a16 = hssfRow.getCell(15);
	                    
	                     wuliao = new WuLiao(
	                    		 Float.valueOf(getValue(a1)),
	                    		 getValue(a2),
	                    		 getValue(a3),
	                    		 getValue(a4),
	                    		 getValue(a5),
	                    		 getValue(a6),
	                    		 getValue(a7),
	                    		 getValue(a8),
	                    		 getValue(a9),
	                    		 getValue(a10),
	                    		 getValue(a11),
	                    		 getValue(a12),
	                    		 getValue(a13),
	                    		 getValue(a14),
	                    		 getValue(a15),
	                    		 getValue(a16)
	                    		 );
	                     list.add(wuliao);
	                 }
	             }
	         }
	         return list;
	     }
	 
	     @SuppressWarnings("static-access")
	     private String getValue(XSSFCell xssfRow) {
	    	 if (xssfRow != null) {
	    		 if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
		             return String.valueOf(xssfRow.getBooleanCellValue());
		         } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
		             return String.valueOf(xssfRow.getNumericCellValue());
		         } else {
		             return String.valueOf(xssfRow.getStringCellValue());
		         }
			}else {
				return "无";
			}
	         
	     }
	 
	     @SuppressWarnings("static-access")
	     private String getValue(HSSFCell hssfCell) {
	    	 
	    	 if (hssfCell != null) {
	    		 if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
		             return String.valueOf(hssfCell.getBooleanCellValue());
		         } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
		             return String.valueOf(hssfCell.getNumericCellValue());
		         } else {
		             return String.valueOf(hssfCell.getStringCellValue());
		         }
			}else {
				return "无";
			}
	         
     }
	     
	     
	     public List<LocalPhone> readLocalExcel(String path) throws IOException {
	          if (path == null || Common.EMPTY.equals(path)) {
	              return null;
	          } else {
	              String postfix = Util.getPostfix(path);
	              if (!Common.EMPTY.equals(postfix)) {
	            	  return readLocalXlsx(path);
	                 /* if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)) {
	                      return readXls(path);
	                  } else if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)) {
	                      return readXlsx(path);
	                  }*/
	              } else {
	                  System.out.println(path + Common.NOT_EXCEL_FILE);
	              }
	          }
	          return null;
	      }
	  
	      /**
	       * Read the Excel 2010
	       * @param path the path of the excel file
	       * @return
	       * @throws IOException
	       */
	      public List<LocalPhone> readLocalXlsx(String path) throws IOException {
	          System.out.println(Common.PROCESSING + path);
	          InputStream is = new FileInputStream(path);
	          XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
	          WuLiao wuliao = null;
	          List<LocalPhone> list = new ArrayList<LocalPhone>();
	          // Read the Sheet
	          for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
	              XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
	              if (xssfSheet == null) {
	                  continue;
	              }
	              // Read the Row
	              for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
	                  XSSFRow hssfRow = xssfSheet.getRow(rowNum);
	                  if (hssfRow != null) {
	                	    XSSFCell a1 = hssfRow.getCell(0);
		                     XSSFCell a2 = hssfRow.getCell(1);
		                     XSSFCell a3 = hssfRow.getCell(2);
		                     XSSFCell a4 = hssfRow.getCell(3);
		                     XSSFCell a5 = hssfRow.getCell(4);
		                     XSSFCell a6 = hssfRow.getCell(5);
		                    
		                     LocalPhone local = new LocalPhone(
		                    		 getValue(a1),
		                    		 getValue(a2),
		                    		 getValue(a3),
		                    		 getValue(a4),
		                    		 getValue(a5),
		                    		 getValue(a6)
		                    		 );
		                     list.add(local);
	                  }
	              }
	          }
	          return list;
	      }
	  
	      /**
	       * Read the Excel 2003-2007
	       * @param path the path of the Excel
	       * @return
	       * @throws IOException
	       */
	      public List<LocalPhone> readLocalXls(String path) throws IOException {
	         System.out.println(Common.PROCESSING + path);
	         InputStream is = new FileInputStream(path);
	         HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
	         WuLiao wuliao = null;
	         List<LocalPhone> list = new ArrayList<LocalPhone>();
	         // Read the Sheet
	         for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
	             HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
	             if (hssfSheet == null) {
	                 continue;
	             }
	             // Read the Row
	             for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
	                 HSSFRow hssfRow = hssfSheet.getRow(rowNum);
	                 if (hssfRow != null) {
	                	 HSSFCell a1 = hssfRow.getCell(0);
	                     HSSFCell a2 = hssfRow.getCell(1);
	                     HSSFCell a3 = hssfRow.getCell(2);
	                     HSSFCell a4 = hssfRow.getCell(3);
	                     HSSFCell a5 = hssfRow.getCell(4);
	                     HSSFCell a6 = hssfRow.getCell(5);
	                    
	                     LocalPhone local = new LocalPhone(
	                    		 getValue(a1),
	                    		 getValue(a2),
	                    		 getValue(a3),
	                    		 getValue(a4),
	                    		 getValue(a5),
	                    		 getValue(a6)
	                    		 );
	                     list.add(local);
	                 }
	             }
	         }
	         return list;
	     }
}

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFPrintSetup;
import org.apache.poi.hssf.usermodel.HeaderFooter;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcelUtil {
	public static String[] API_METHOD = {"nuonuo.einvoice.createreq1",
			"nuonuo.speedBilling.prefixQuery",
			"nuonuo.speedBilling.querySpeedBilling ",
			"nuonuo.speedBilling.queryGoldenPlate",
			"nuonuo.speedBilling.queryNameAndTaxByCode",
			"nuonuo.electronInvoice.requestBilling",
			"nuonuo.electronInvoice.CheckEInvoice",
			"nuonuo.electronInvoice.querySerialNum",
			"nuonuo.electronInvoice.queryInvoiceQuantity ",
			"nuonuo.smartCoding.batchTaxCode",
			"nuonuo.synergy.approvalForm",
			"nuonuo.taxAction.getAuthCode",
			"nuonuo.taxAction.updateAuthCode",
			"nuonuo.order.queryList",
			"nuonuo.order.detailsQuery",
			"nuonuo.order.usersAndIntegrals",
			"nuonuo.order.queryAvailableIntegral",
			"nuonuo.basis.BusCallbackCommon",
			"nuonuo.operation.buyMemberPackage ",
			"nuonuo.operation.queryMemberLevel",
			"nuonuo.operation.queryMemberOrder",
			"nuonuo.polymerization.BScanCPayment",
			"nuonuo.polymerization.queryPaymentOrder",
			"nuonuo.polymerization.dynamicOrderScanPayment",
			"nuonuo.polymerization.getInvoiceLinks",
			"nuonuo.cloudTally.queryAccountHolderParam",
			"nuonuo.cloudTally.queryBusinessTemplate",
			"nuonuo.cloudTally.autoMakeAccountingVouchers",
			"nuonuo.cloudTally.queryVoucherOrigin",
			"nuonuo.cloudTally.deleteVoucherOrigin",
			"nuonuo.cloudTally.AddAuxiliaryAccountingItems",
			"nuonuo.cloudTally.queryIntelligentCredentials",
			"nuonuo.cloudTally.newAccountSet",
			"nuonuo.cloudTally.queryAccountingSubjects ",
			"nuonuo.cloudTally.addAccountingSubjects",
			"nuonuo.cloudTally.carryOverGainsLosses",
			"nuonuo.cloudTally.settleAccounts",
			"nuonuo.cloudAgentAccounts.addCustomers",
			"nuonuo.cloudAgentAccounts.modifyCustomers",
			"nuonuo.cloudAgentAccounts.addContract",
			"nuonuo.cloudAgentAccounts.deleteContract ",
			"nuonuo.cloudTally.addPay",
			"nuonuo.cloudTally.deletePay",
			}; 
	 public static void generateExcel() throws IOException {
	        //创建工作薄
	        XSSFWorkbook workbook = new XSSFWorkbook();
	        //创建表单
	        XSSFSheet sheet = genSheet(workbook,"testExcel");
	        //创建表单样式
	        XSSFCellStyle titleStyle = genTitleStyle(workbook);//创建标题样式
	        XSSFCellStyle contextStyle = genContextStyle(workbook);//创建文本样式

	        //创建Excel
	        genExcel(sheet,titleStyle,contextStyle);

	        //将生成的Excel文件保存到本地
	        FileOutputStream out = new FileOutputStream(new File("f://test.xlsx"));
	        //将工作薄写入文件输出流中
	        workbook.write(out);
	        //文本文件输出流，释放资源
	        out.close();
	    }
	 
	 
	 //设置表单，并生成表单
	    public static XSSFSheet genSheet(XSSFWorkbook workbook, String sheetName){
	        //生成表单
	        XSSFSheet sheet = workbook.createSheet(sheetName);
	        //设置表单文本居中
	        sheet.setHorizontallyCenter(true);
	        sheet.setFitToPage(false);
	        //打印时在底部右边显示文本页信息
	        Footer footer = sheet.getFooter();
	        footer.setRight( "Page " + HeaderFooter.numPages()+ " Of "+ HeaderFooter.page());
	        //打印时在头部右边显示Excel创建日期信息
	        Header header = sheet.getHeader();
	        header.setRight("Create Date " + HeaderFooter.date() + " " + HeaderFooter.time());
	        //设置打印方式
	        XSSFPrintSetup ps = sheet.getPrintSetup();
	        ps.setLandscape(true); // true：横向打印，false：竖向打印 ，因为列数较多，推荐在打印时横向打印
	        ps.setPaperSize(HSSFPrintSetup.A4_PAPERSIZE); //打印尺寸大小设置为A4纸大小
	        return sheet;
	    }
	    
	    //生成标题样式
	    public static XSSFCellStyle genTitleStyle(XSSFWorkbook workbook){

	        XSSFCellStyle style = workbook.createCellStyle();
	        style.setAlignment(HorizontalAlignment.CENTER);
	        style.setVerticalAlignment(VerticalAlignment.CENTER);
	        style.setWrapText(true);

	        //标题居中，没有边框，所以这里没有设置边框，设置标题文字样式
	        XSSFFont titleFont = workbook.createFont();
	        titleFont.setBold(true);//加粗
	        titleFont.setFontHeight((short)15);//文字尺寸
	        titleFont.setFontHeightInPoints((short)15);
	        style.setFont(titleFont);

	        return style;
	    }
	    public static XSSFCellStyle genContextStyle(XSSFWorkbook workbook){
	        XSSFCellStyle style = workbook.createCellStyle();
	        style.setAlignment(HorizontalAlignment.CENTER);//文本水平居中显示
	        style.setVerticalAlignment(VerticalAlignment.CENTER);//文本竖直居中显示
	        style.setWrapText(true);//文本自动换行

	        //生成Excel表单，需要给文本添加边框样式和颜色
	        /*
	             CellStyle.BORDER_DOUBLE      双边线
	             CellStyle.BORDER_THIN        细边线
	             CellStyle.BORDER_MEDIUM      中等边线
	             CellStyle.BORDER_DASHED      虚线边线
	             CellStyle.BORDER_HAIR        小圆点虚线边线
	             CellStyle.BORDER_THICK       粗边线
	         */
	        style.setBorderBottom(BorderStyle.THIN);//设置文本边框
	        style.setBorderLeft(BorderStyle.THIN);
	        style.setBorderRight(BorderStyle.THIN);
	        style.setBorderTop(BorderStyle.THIN);
	        //set border color
	        style.setTopBorderColor(new XSSFColor(Color.BLACK));//设置文本边框颜色
	        style.setBottomBorderColor(new XSSFColor(Color.BLACK));
	        style.setLeftBorderColor(new XSSFColor(Color.BLACK));
	        style.setRightBorderColor(new XSSFColor(Color.BLACK));

	        return style;
	    }
	    
	    
	    public static void genExcel(XSSFSheet sheet,XSSFCellStyle titleStyle,XSSFCellStyle contextStyle) {

	        //根据Excel列名长度，指定列名宽度  Excel总共10列
	        for (int i = 0; i < 4; i++) {
	            if (i == 0) {
	                sheet.setColumnWidth(i, 1500);
	            } else if (i == 2 || i == 3) {
	                sheet.setColumnWidth(i, 4000);
	            } 
	        }

		/*
		 * //设置标题位置 sheet.addMergedRegion(new CellRangeAddress( 0, //first row 0, //last
		 * row 0, //first column 3 //last column ));
		 */

	        XSSFRow row = sheet.createRow(0);//创建第一行，为标题，index从0开始
	        XSSFCell cell;
	        cell = row.createCell(0);//创建一列
	        cell.setCellValue("id");
	        cell.setCellStyle(contextStyle);
	        cell = row.createCell(1);
	        cell.setCellValue("api");//
	        cell.setCellStyle(contextStyle);//设置样式
	        cell = row.createCell(2);//2 row 1 column
	        cell.setCellValue("版本");
	        cell.setCellStyle(contextStyle);
	        cell = row.createCell(3);//2 row 2 column
	        cell.setCellValue("备注");
	        cell.setCellStyle(contextStyle);
			/*
				实际填充数据的时候，对可能为空的数据要进行处理，要先进行判断，否则报错
				String value = Test.getVal();
				if(StringUtils.isNotBlank(value)) {
					cell.setCellValue(value);
				} else{
				    cell.setCellValue(" ");
				}
			*/
	        //从数据库取数据填充到Excel，这步省略，添加模拟数据
	        for(int i = 1 ; i<API_METHOD.length+1;i++){//i从2开始计数，因为上面已经创建了 0 1行
	            row=sheet.createRow(i);//创建第二行
	            cell=row.createCell(0);//创建第二行第一列
	            cell.setCellValue(i);//第二行第一列的值
	            cell.setCellStyle(contextStyle);//设置样式
	            cell=row.createCell(1);//2 row 1 column
	            cell.setCellValue(API_METHOD[i-1]);
	            cell.setCellStyle(contextStyle);
	            cell=row.createCell(2);//2 row 2 column
	            cell.setCellValue("V1.0.0");
	            cell.setCellStyle(contextStyle);
	            cell=row.createCell(3);//2 row 3 column
	            cell.setCellValue("无");
	            cell.setCellStyle(contextStyle);
	        }
	    }

}

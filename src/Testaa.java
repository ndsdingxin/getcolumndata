import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Testaa {

	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}

	private static void method3() {
		// TODO Auto-generated method stub
		try {
			WriteExcelUtil.generateExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	private static void method2() {
		// TODO Auto-generated method stub
		try {
			List<LocalPhone> d1 = new ReadExcel().readLocalExcel("C:\\Users\\Administrator\\Desktop\\位置excel.xlsx");
			StringBuilder sb = new StringBuilder();
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			for (LocalPhone ll : d1) {
				if (!ll.getBeizhu().equals("")) {
					sb2.append("\"").append(ll.getBeizhu()).append("\",");

				}
				if (!ll.getGuige().equals("")) {
					sb1.append("\"").append(ll.getGuige()).append("\",");

				}
				if (!ll.getWeizhi().equals("")) {
					sb.append("\"").append(ll.getWeizhi()).append("\",");
				}
				
			}

			FileWriter f1 = new FileWriter(new File("f://weizhi.doc"));
			f1.write(sb.toString());
			f1.flush();
			FileWriter f2 = new FileWriter(new File("f://guige.doc"));
			f2.write(sb1.toString());
			f2.flush();
			FileWriter f3 = new FileWriter(new File("f://beizhu.doc"));
			f3.write(sb2.toString());
			f3.flush();
			System.out.println("执行完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1() {
		// TODO Auto-generated method stub

		try {
			List<WuLiao> d1 = new ReadExcel().readExcel("F:\\材料位置.xlsx");
			StringBuilder sb1 = new StringBuilder();
			for (WuLiao ll : d1) {
				sb1.append("\"").append(ll.getMingcheng()).append("\",");
			}

			/*FileWriter f1 = new FileWriter(new File("f://wuliaoma.doc"));
			f1.write(sb.toString());
			f1.flush();*/
			FileWriter f2 = new FileWriter(new File("f://mingcheng.doc"));
			f2.write(sb1.toString());
			f2.flush();
			System.out.println("执行完毕");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

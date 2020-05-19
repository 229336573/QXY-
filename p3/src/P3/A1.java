package P3;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class A1 {

	public static void main(String[] args) {
		System.out.println("请输入身份证号码");
		Scanner sc=new Scanner(System.in);
		String id=sc.next();
		String year="";
		String month="";
		String day="";
		if(id.length()!=18) {
			System.out.println("错误身份证");
		}else {
			year=id.substring(6,10);
			month=id.substring(10,12);
			day=id.substring(12,14);
			System.out.println("生日为"+year+"年"+month+"月"+day+"日");
		}
		
	}

}

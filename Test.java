package wcq;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		int age1 =0;
		System.out.println("请输入硕士生姓名:");
		String name = scanner.nextLine();
		System.out.println("请输入硕士生性别");
		String sex = scanner.nextLine();
		System.out.println("请输入硕士生年龄:");
		try {
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("检测到您的输入异常，请重新输入:");
			System.exit(1);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("硕士生姓名:"+name+" 硕士生性别:"+sex+"硕士生年龄:"+age);
		System.out.println("----------------下一名硕士-------------------");
		System.out.println("请输入硕士生姓名:");
		String nambr = scanner.next();
		System.out.println("请输入硕士生性别");
		String sex1 = scanner.next();
		System.out.println("请输入硕士生年龄:");
		try {
			 age1 = scanner.nextInt();
		}catch(Exception s){
			System.out.println("检测到您的输入异常，请重新输入:");
			System.exit(1);
		}
		System.out.println("--------------------------------------");
		System.out.println("硕士生姓名:"+nambr+" 硕士生性别:"+sex1+"硕士生年龄:"+age1);
		Doctor s=new Doctor();
		s.semester1();
		Doctor xuefei=new Doctor();
		xuefei.tuition1();				  
		Doctor xinshui=new Doctor();
		xinshui.salary1();
		Doctor chaxun=new Doctor();
		chaxun.chaxun1();
		Doctor s2=new Doctor();
		s2.semester2();
		Doctor xuefei2=new Doctor();
		xuefei2.tuition2();				  
		Doctor xinshui2=new Doctor();
		xinshui2.salary2();
		Doctor chaxun2=new Doctor();
		chaxun2.chaxun2();
	}
}
package wcq;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		int age1 =0;
		System.out.println("������˶ʿ������:");
		String name = scanner.nextLine();
		System.out.println("������˶ʿ���Ա�");
		String sex = scanner.nextLine();
		System.out.println("������˶ʿ������:");
		try {
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("��⵽���������쳣������������:");
			System.exit(1);
		}
		
		System.out.println("--------------------------------------");
		System.out.println("˶ʿ������:"+name+" ˶ʿ���Ա�:"+sex+"˶ʿ������:"+age);
		System.out.println("----------------��һ��˶ʿ-------------------");
		System.out.println("������˶ʿ������:");
		String nambr = scanner.next();
		System.out.println("������˶ʿ���Ա�");
		String sex1 = scanner.next();
		System.out.println("������˶ʿ������:");
		try {
			 age1 = scanner.nextInt();
		}catch(Exception s){
			System.out.println("��⵽���������쳣������������:");
			System.exit(1);
		}
		System.out.println("--------------------------------------");
		System.out.println("˶ʿ������:"+nambr+" ˶ʿ���Ա�:"+sex1+"˶ʿ������:"+age1);
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
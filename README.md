# 班级：计G202 
# 学号：2020322087 
# 姓名：王超琦
# 一、实验目的

    掌握Java中抽象类和抽象方法的定义； 
    掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;
    了解异常的使用方法，并在程序中根据输入情况做异常处理;
    
# 二、实验要求  

     1.在博士研究生类中实现各个接口定义的抽象方法;
     2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
     3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
     4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
     5.根据输入情况，要在程序中做异常处理。
# 三、实验方法   

    class Doctor implements Studentjiekou,Teacherjiekou {};      //接入接口
    public void tuition2() {
		int x=40;
		int sum=2000;
		for(int i=1;i<x;i++) {		                                   //学生缴纳的学费
		if(9==i) {
			sum*=i;
			System.out.println("另一名学生缴纳的学费为:"+sum);	
	  	}
		 }
     public interface Studentjiekou{}；                          //定义接口
     public interface Teacherjiekou{}；                          //定义接口
     try {                                                       //异常处理        
			 age = scanner.nextInt();
		}catch(Exception s){
			System.out.println("检测到您的输入异常，请重新输入:");
			System.exit(1);
		}
    

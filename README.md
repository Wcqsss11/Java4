# Java-实验-4 
## 计G202  王超琦  2020322087
## 一、实验内容
- 1.某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。
- 2.该博士研究生有双重身份：学生和助教教师。
- 3.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
- 4.设计博士研究生类：实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
- 5.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（工资减去学费的3%为纳税金额）。
- 6.注意学费是不能为0的，不符合标准，系统需要提醒。
- 7.当研究生博士查询成绩如果出错，系统要自动报错，报出异常，提醒研究生博士。
- 8.能通过简单明了的系统就给出结果，方便博士研究生。
    
## 二.实验要求  
- 1.在博士研究生类中实现各个接口定义的抽象方法;
- 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
- 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
- 4。实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
- 5.根据输入情况，要在程序中做异常处理。

## 三.实验过程 
- 1.创建接口
       
      public abstract void setTuition(int Tuition);         //学生学费
      public abstract void getTuition(int Tuition);}        //查询学生学费
- 2.创建doctor类接入接口，定义类，并实现接口。

      class Doctor implements Studentjiekou,Teacherjiekou    
      { String Name;
      String Sex;}
      public void setSalary(int Salary) 
      {this.salary = Salary;}
- 3.计算纳税金额，做出程序异常处理。

      try {
      age1 = scanner.nextInt();
      }catch(Exception s){
      System.out.println("检测到您的输入异常，请重新输入:");
      System.exit(1);
      }

      
## 四.流程图
![](https://github.com/Wcqsss11/Java4/blob/main/%E6%B5%81%E7%A8%8B%E5%9B%BE.png)

## 五.核心代码   

    class Doctor implements Studentjiekou,Teacherjiekou {};      //接入接口
    public void tuition2() {                                     //学生缴纳的学费
		int x=40;
		int sum=2000;
		for(int i=1;i<x;i++) {	   
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
## 六.实验结果
![](https://github.com/Wcqsss11/Java4/blob/main/%E5%AE%9E%E9%AA%8C4.png)
![](https://github.com/Wcqsss11/Java4/blob/main/%E5%BC%82%E5%B8%B8.png)

## 七.程感想
    1.通过这次实验掌握了Java中接口的定义、抽象类和抽象方法的定义；
    2.掌握了定义接口包含接口声明和接口体；
    3.掌握了一个类要在类声明中使用关键字implements声明该类实现一个或多个接口；
    4.掌握了口的定义形式以及接口的实现方法；
    5.掌握了Scanner的用法运行语句输出；
    6.掌握了try的用法，来处理异常机制。
    

package wcq;
class Doctor implements Studentjiekou,Teacherjiekou {
	String Name;
	String Sex;
	String Age;
	String tuition;
	String salary;	
	final double tex=0.1;
	public void semester1() {
		int s=10000;
		System.out.println("每学期学费为:"+s);
		int y=10000*2;
		System.out.println("一年的学费为:"+y);
		int s1=10000;
	}
	public void semester2() {
		int s1=11000;
		System.out.println("另一位博士每学期学费为:"+s1);
		int y1=11000*2;
		System.out.println("另一位博士的学费为:"+y1);
	}
	public void tuition1() {
			int x=40;
			int sum=2000;
			for(int i=1;i<x;i++) {		
			if(9==i) {
				sum*=i;
				System.out.println("学生缴纳的学费为:"+sum);		
			}
			}
		}
	public void tuition2() {
		int x=40;
		int sum=2000;
		for(int i=1;i<x;i++) {		
		if(9==i) {
			sum*=i;
			System.out.println("另一名学生缴纳的学费为:"+sum);	
		}
		}
	}
	public void chaxun1() {
		int x=10000;
		System.out.println("学费查询结果为:"+x);
		int many=10000;
		System.out.println("薪水查询结果为:"+many);
	}
	public void chaxun2() {
		int x1=11000;
		System.out.println("学费查询结果为:"+x1);
		int many1=12000;
		System.out.println("薪水查询结果为:"+many1);
	}
	public void salary1() {
		int q=13000;
		System.out.println("每月薪水为:"+q);
		int z=q*12;
		System.out.println("每年薪水为:"+z);
		System.out.println("应纳税金额:"+(z-q)*tex);
	}
	public void salary2() {
		int q1=14000;
		System.out.println("每月薪水为:"+q1);
		int z1=q1*12;
		System.out.println("每年薪水为:"+z1);
		System.out.println("应纳税金额:"+(z1-q1)*tex);
	}
}

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
		System.out.println("ÿѧ��ѧ��Ϊ:"+s);
		int y=10000*2;
		System.out.println("һ���ѧ��Ϊ:"+y);
		int s1=10000;
	}
	public void semester2() {
		int s1=11000;
		System.out.println("��һλ��ʿÿѧ��ѧ��Ϊ:"+s1);
		int y1=11000*2;
		System.out.println("��һλ��ʿ��ѧ��Ϊ:"+y1);
	}
	public void tuition1() {
			int x=40;
			int sum=2000;
			for(int i=1;i<x;i++) {		
			if(9==i) {
				sum*=i;
				System.out.println("ѧ�����ɵ�ѧ��Ϊ:"+sum);		
			}
			}
		}
	public void tuition2() {
		int x=40;
		int sum=2000;
		for(int i=1;i<x;i++) {		
		if(9==i) {
			sum*=i;
			System.out.println("��һ��ѧ�����ɵ�ѧ��Ϊ:"+sum);	
		}
		}
	}
	public void chaxun1() {
		int x=10000;
		System.out.println("ѧ�Ѳ�ѯ���Ϊ:"+x);
		int many=10000;
		System.out.println("нˮ��ѯ���Ϊ:"+many);
	}
	public void chaxun2() {
		int x1=11000;
		System.out.println("ѧ�Ѳ�ѯ���Ϊ:"+x1);
		int many1=12000;
		System.out.println("нˮ��ѯ���Ϊ:"+many1);
	}
	public void salary1() {
		int q=13000;
		System.out.println("ÿ��нˮΪ:"+q);
		int z=q*12;
		System.out.println("ÿ��нˮΪ:"+z);
		System.out.println("Ӧ��˰���:"+(z-q)*tex);
	}
	public void salary2() {
		int q1=14000;
		System.out.println("ÿ��нˮΪ:"+q1);
		int z1=q1*12;
		System.out.println("ÿ��нˮΪ:"+z1);
		System.out.println("Ӧ��˰���:"+(z1-q1)*tex);
	}
}

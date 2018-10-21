class parant{
	int i=10;
	void m2(){
		parant parant=new parant();
		System.out.println(this);
		parant.m3();
	}
	void m3(){
		System.out.println(this);
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(20);
		System.out.println(i1.equals(i2));
	}
}

public class ShedawingSuper extends parant{
    
	int j=90;
	void m1(){
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		ShedawingSuper shedawingSuper=new ShedawingSuper();
		System.out.println(shedawingSuper.i);
		shedawingSuper.m1();
		shedawingSuper.m2();
	}
}

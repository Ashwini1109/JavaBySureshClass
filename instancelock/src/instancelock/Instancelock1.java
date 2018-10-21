package instancelock;

public class Instancelock1 {
    int i=10;   
	{
	   System.out.println("block");
	}
	
	public Instancelock1() {
		System.out.println("zero");	
	}
	
	public Instancelock1(int i) {
		System.out.println("one");	

	}
	public Instancelock1(int i,int j) {
		System.out.println("two");	
	}
	
	void m1(){
		System.out.println("ins method");
	}
	
	public static void main(String[] args) {
		Instancelock1 instancelock1=new Instancelock1();
		System.out.println("===============");
		Instancelock1 Instancelock2=new Instancelock1(10);
		//Instancelock1 Instancelock3=new Instancelock1(10,20);
		System.out.println("main");
		
		instancelock1.m1();
		
		
	}
	
	{
		System.out.println("block 2");
	}
	
	int j=90;
}

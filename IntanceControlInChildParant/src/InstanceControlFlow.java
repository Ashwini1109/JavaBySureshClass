
 class Parant{
	
	{
		System.out.println("instace block of parant");
	}
	int i=90;
	
	Parant(){
		System.out.println("Cont of parat");
	}
	
	void m1(){
		System.out.println("m1 of parant");
	}
}
class Child extends Parant{
	{
		System.out.println("instace block of child");
	}
	int i=90;
	
	Child(){
		System.out.println("Cont of child");
	}
	
	void m2(){
		System.out.println("m1 of child");
	}
}

public class InstanceControlFlow {
      
	public static void main(String[] args) {
		Child child=new Child();
		child.m1();
		child.m2();
		
		Parant parant=new  Parant();
		parant.m1();
	}
}

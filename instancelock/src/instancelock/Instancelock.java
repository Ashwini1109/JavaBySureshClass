package instancelock;

public class Instancelock {
   static int i;
	{
	   i++;
	}
	
	public Instancelock() {
		System.out.println("zero");	
	}
	
	public Instancelock(int i) {
		System.out.println("one");	

	}
	public Instancelock(int i,int j) {
		System.out.println("two");	
	}
	
	public static void main(String[] args) {
		Instancelock instancelock=new Instancelock();
		Instancelock instancelock1=new Instancelock(10);
		Instancelock instancelock3=new Instancelock(10,20);
		System.out.println("main"+instancelock.i);
	}
}

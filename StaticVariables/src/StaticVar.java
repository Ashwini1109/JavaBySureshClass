class Parant{
	static int i = 80;
}
public class StaticVar extends Parant{

	static int i = 90;

	void m1(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		System.out.println(Parant.i);
	}
}

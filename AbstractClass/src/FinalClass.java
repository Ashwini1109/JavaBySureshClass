final class ABC {
	int a = 90;
}

public class FinalClass {
	public static void main(String[] args) {
		ABC a=new ABC();
		a.a=10;
		System.out.println(a.a);
	}
}

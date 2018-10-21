//for private
class Pt {

	private void m1() {
		System.out.println("parant");
	}
}

class Ch extends Pt {
	private void m1() {
		System.out.println("parant");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Pt pt=new Pt();
		pt.m1();
		Ch c=new Ch();
		c.m1();
		Pt p1=new ch();
		p1.m1();
	}
}

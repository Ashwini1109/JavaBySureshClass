public class ConstructorExe2 {

	int i=10;
	int j=20;
    int k;
	public ConstructorExe2(int i) {
		System.out.println("i con");
		this.i = i;
	}

	public ConstructorExe2(int j, int k) {
		System.out.println("j,k con");

		this.i = i;
		this.j = j;
	}

	public ConstructorExe2() {
		this(90);
		System.out.println("default con");
		k=i+j;
		
	}

	public static void main(String[] args) {
		ConstructorExe2 constructorExe2 = new ConstructorExe2();
		System.out.println(constructorExe2.k);
	}
}

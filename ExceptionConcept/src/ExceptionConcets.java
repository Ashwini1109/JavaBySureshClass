class Parent {
	void m1() throws Exception {
		throw new  NullPointerException();
	}
}

public class ExceptionConcets extends Parent {

	void m1() throws ClassNotFoundException {

	}

	public static void main(String[] args) {
		try {
			ExceptionConcets concets = new ExceptionConcets();
			concets.m1();
		} catch (NullPointerException e) {
			System.out.println("null");
		} catch (Exception e) {
			System.out.println("abcd");
		}

	}
}

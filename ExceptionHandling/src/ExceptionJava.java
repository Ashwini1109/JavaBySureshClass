public class ExceptionJava {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i <= 9; i++) { try { System.out.println("try"); if (i
		 * == 5) { i = i / 0; break; } } catch (ArithmeticException e) {
		 * System.out.println("catch"); } finally {
		 * System.out.println("finally"); } }
		 */

		/*
		 * for (int i = 0; i <= 9; i++) { try { System.out.println("try"); if (i
		 * == 5) { i = i / 0; continue; } } catch (ArithmeticException e) {
		 * System.out.println("catch"); } finally {
		 * System.out.println("finally"); } }
		 */
		m1();

	}

	public static void m1() {
		int  i; 
		try {
			System.out.println("");
			i = 90;
		} catch (ClassCastException e) {
			i = 90;
			System.out.println("catch");
           System.out.println(i);
		} finally {
			//System.out.println(i);
		}
	}
}

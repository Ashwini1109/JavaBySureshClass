public class EnunConcept implements Cloneable {
 int i;
	int j;

	public static void main(String[] args) throws Exception {
		 int k=0;
		EnunConcept e2;
		EnunConcept e1 = new EnunConcept();
		e1.i = 10;
		e1.j = 20;
		
		e2 = (EnunConcept) e1.clone();

		System.out.println(e1.i + "======" + e1.getClass());
		e1.i = 90;
		e1.j = 100;

		System.out.println(e1.i + "======" + e1.j);

		System.out.println(e2.i + "======" + e2.j);
		System.out.println(k);
		
		for(int h=0;h<10;h++){
			
		}
	}
}

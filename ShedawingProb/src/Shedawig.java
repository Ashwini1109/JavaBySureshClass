public class Shedawig {

	private int i=90;

	void m1(int i) {
      this.i=i;
      System.out.println(this+"========="+this.i+i);
      
      System.out.println(this);
	}

	public static void main(String[] args) {
       Shedawig shedawig=new Shedawig();
       shedawig.m1(10);
       System.out.println(shedawig.i);
       System.out.println(shedawig);
	}
}

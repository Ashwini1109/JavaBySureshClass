
public class MyExceptionHandling{
     
	public void m3()throws ArithmeticException{
		int i=90/0;
	}
	
	public void m2(){
		m3();
	} 
	
	public void m1()throws Exception{
		m2();
	}
	  public static void main(String[] args)throws Exception {
		  MyExceptionHandling exceptionHandling=new MyExceptionHandling();
		
			  exceptionHandling.m1();
			  System.out.println("abcd");
		}
}

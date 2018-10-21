
public class StaticBlock{
  
	  static int i=90;
	  static int j=80;
	  static{
		  System.out.println("abc");
	  }
	  
	  static void m1(){
		  System.out.println("m1");
	  }
	  
	  public static void main(String[] args) {
		System.out.println("main");
		
		StaticBlock block=new StaticBlock();
		block.i=20;
		block.j=30;
		
		System.out.println(block.i+"===="+block.j);
		
		StaticBlock block1=new StaticBlock();
		block1.i=40;
		block1.j=50;
		
		System.out.println(block.i+"===="+block.j);
		System.out.println(block1.i+"===="+block1.j);
		
		StaticBlock.m1();
	}
}

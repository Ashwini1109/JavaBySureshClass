class parent{
	 static {
		 System.out.println("parent static");
	 }
	 parent(){
		 System.out.println("parent constructor");		 
	 }
	 
}
public class StaticInstanceControlFLow extends parent{
   
	int i=80;
	
	static int j=80;
	
	{
		System.out.println("instance blocks");
	}
	
	static{
		System.out.println("static blocks");
	}
	
	public StaticInstanceControlFLow() {
		System.out.println("Constructor");
	}
	
	static void m1(){
		System.out.println("m1 static");
	}
	
    void m2(){
    	System.out.println("m2 instance");
	}
    
    public static void main(String[] args) {
    	System.out.println("main");
    	StaticInstanceControlFLow controlFLow=new StaticInstanceControlFLow();
    	StaticInstanceControlFLow controlFLow1s=new StaticInstanceControlFLow();
	}
    
    {
    	System.out.println("second instance blocks");
    }
    
    static {
    	System.out.println("second static blocks");
    }
}

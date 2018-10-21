
public class InstanceVariable {
   
	 int id=101;
	 String name="suresh";
	 
	 public static void main(String[] args) {
		InstanceVariable instanceVariable1=new InstanceVariable();
		
		InstanceVariable instanceVariable2=new  InstanceVariable();
		instanceVariable2.id=102;
		instanceVariable2.name="abcd";
		

		System.out.println(instanceVariable1.id+"==="+instanceVariable1.name);

		System.out.println(instanceVariable2.id+"==="+instanceVariable2.name);
		instanceVariable2.m1();
	}
	 
	 void m1(){
		 System.out.println(this.id+"======="+this.name);
		 m2();
	 }
	 
	 void m2(){
		 System.out.println(this.id+"======="+this.name);
	 }
}

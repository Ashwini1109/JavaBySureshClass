
class Parent{
	
	Parent m1()
	{
		Parent parent=new  Parent();
		return parent;
	}

}
 public class Child extends Parent{
	Parent m1()
	{
		System.out.println("childs");
		return new Parent();
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		Parent parent=c.m1();
		
		Parent parent2=new Child();
		Parent parent1=parent.m1();
	}
}

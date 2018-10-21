public class MainClass {

	 static public void main(String[] args) {

		Parent parent = new Parent();
		parent.setId(101);
		parent.setName("suresh");
		System.out.println(parent.getId() + "====" + parent.getName() + "==="
				+ "parent");

		Child child = new Child();
		child.setId(102);
		child.setName("ajay");
		child.setAdd("mumbai");
		child.setSalary(1000);

		System.out.println(child.getId() + "====" + child.getName() + "==="
				+ "child");
		System.out.println(child.getAdd() + "====" + child.getSalary() + "==="
				+ "child");
		
		main(new String[3],"abcd");

		return ;
	}

	public static void main(String[] args, String name) {
		Parent parent = new Parent();
		parent.setId(101);
		parent.setName("suresh");
		System.out.println(parent.getId() + "====" + parent.getName() + "==="
				+ "parent");

		Child child = new Child();
		child.setId(102);
		child.setName("ajay");
		child.setAdd("mumbai");
		child.setSalary(1000);

		System.out.println(child.getId() + "====" + child.getName() + "==="
				+ "child");
		System.out.println(child.getAdd() + "====" + child.getSalary() + "==="
				+ "child");
	}
}

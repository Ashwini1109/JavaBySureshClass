import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {

		/*
		 * ArrayList list = new ArrayList(50); LinkedList list3 = new
		 * LinkedList(); list3.add("d"); list3.add("q"); list3.add(1);
		 * list3.add(4); list3.add(5); list3.addFirst(1);
		 * System.out.println(list3); list.add(1); list.add("a"); list.add("c");
		 * list.add(9); list.add(1); list.add(null);
		 * 
		 * LinkedList list5=new LinkedList(list);
		 * System.out.println(list5.getClass().getName()); //
		 * System.out.println(list.lastIndexOf(1));
		 * 
		 * 
		 * Object[] obj=list.toArray(); System.out.println(obj);
		 * 
		 * 
		 * boolean remove = list.remove("c"); System.out.println(list);
		 * System.out.println(remove);
		 * 
		 * ArrayList list2=new ArrayList(); list2.add(1); list2.add(2);
		 * list2.add(3); list2.add(4);
		 * 
		 * // list.addAll(list2);
		 * 
		 * //System.out.println(list);
		 * 
		 * //list.retainAll(list2); //System.out.println(list);
		 * 
		 * 
		 * list.add(list2);
		 * 
		 * System.out.println(list);
		 */

		Vector vector = new Vector();
		Vector vector2 = new Vector(20);
		Vector vector3 = new Vector(2, 20);
		vector3.add(1);
		vector3.add(2);
		vector3.add(3);
		System.out.println(vector3.capacity());

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Object o = stack.peek();
		int i = stack.search(1);
		System.out.println(i);
		int[] a = { 4, 1, 2, 3, 5 };
	}
}

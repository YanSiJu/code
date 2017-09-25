package pck1;
import java.util.*;
public class CollectionDemo {

		public static void main(String[] args){
			Integer a = 102,b = 103,c = 66,f = 66;
			List<Integer> list = new LinkedList<Integer>();
			list.add(a);
			list.add(c);
			boolean n = list.add(a);
			System.out.println(n);
			//list.set(0, d);
		
			System.out.print("List1:"+list);
			System.out.println();
			Iterator<Integer> It = list.iterator();
			while(It.hasNext())
			{
				System.out.println(It.next());
			}
			
			List<Integer> List2 = new LinkedList<Integer>();
			List2.add(f);
			List2.add(b);
			list.addAll(List2);
			System.out.println("List2:"+list);
			System.out.println(list.size());
			System.out.println(list.isEmpty());
			List2.clear();
			System.out.println(List2.size());
			System.out.println("\nList3:"+List2);
			
		}
}

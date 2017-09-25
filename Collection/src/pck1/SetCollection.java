package pck1;
import java.util.*;
public class SetCollection {
	
	public static void main(String[] args){
	
			Set<String> set = new HashSet<String>();
			set.add("Java");
			set.add("Linux");
			set.add("Javascript");
			
			System.out.println(set.add("Java"));
			System.out.println("set1"+set);
			
			List<String> list = new LinkedList<String>();
			list.add("Python");
			list.add("Go");
			list.add("Lua");
			list.add("Go");
			list.add("Lua");
			list.add("Swift");
			
			System.out.println("list"+list);
			
			set.addAll(list);
			System.out.println("set2"+set);
			
			Iterator<String> It = set.iterator();
			while(It.hasNext()){
				System.out.println(It.next());
			}
	}

}

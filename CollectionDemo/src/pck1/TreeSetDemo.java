package pck1;
//import java.util.*;
import java.util.*;
public class TreeSetDemo {

		public static void main(String[] args){
			Set<Integer>  set = new TreeSet<>();
			set.add(Integer.valueOf(2));
			set.add(12);
			set.add(34);
			set.add(0);
			set.add(87);
			set.add(25);
			
			
			System.out.println(set);
			
			
			Set<String> Name = new TreeSet<>();
			Name.add("Bob");
			Name.add("Bo");
			Name.add("Horstmann");
			Name.add("Amy");
			Name.add("Ame");
			Name.add("Core java");
			
			
			System.out.println(Name);
		}
}

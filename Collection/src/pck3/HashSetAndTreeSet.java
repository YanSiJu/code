package pck3;
import java.util.*;
public class HashSetAndTreeSet {

			public static void main(String[] args){
				Set<String> hash = new HashSet<>();
				hash.add("Amy");
				hash.add(new String("Bob"));
				hash.add("Mary");
				hash.add("Mikeal");
				hash.add("Lucy");
				hash.add(new String("Jerry"));
				
				
				System.out.print("HashSet:");
				Iterator<String> Iter = hash.iterator();
				Iter.forEachRemaining(set->System.out.print(set+" "));		//lambda  expression
				System.out.println();
				
				Set<String> Tree = new TreeSet<>();
				Tree.addAll(hash);
				
				
				System.out.print("TreeSet:");
				for(String S:Tree)
					System.out.print(S+" ");
				
				
				
				
				
				
			}
}

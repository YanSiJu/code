package setDemo;
import java.util.*;
public class HashSetDemo {
	
	public static void main(String[] args){
		Set<String> hash = new HashSet<String>();
		hash.add("Java");
		hash.add("Lua");
		
		hash.add("Javascript");
		hash.add("Python");
		hash.add("HTML5");
		
		
		System.out.println(hash.add("Lua"));
		System.out.println(hash.add("swift"));
		System.out.println(hash);
	}

}

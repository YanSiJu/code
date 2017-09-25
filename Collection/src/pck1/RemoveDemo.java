package pck1;
import java.util.*;
//import java.lang.*;
public class RemoveDemo {
	
	public static void main(String[] arg){
		List<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(22));
		list.add(new Integer(23));
		list.add(new Integer(78));
		list.add(new Integer(58));
		list.add(new Integer(66));
		
		System.out.println("List:"+list);
		//Integer.valueOf(32);
		Iterator<Integer> It = list.iterator();
		//It.remove();
		It.next();
		It.next();
		It.remove();
		System.out.println("List:"+list);
		
	}
	
	
	
	
	
	
	
	
	/*
	public static Iterator Remove(Iterator<Integer> It,int size,int index){
		
		if(index < 0 || index >= size){
			
			return null;
		}
		
		int count = 0;
		while(It.hasNext()){
			
			if(count >= index){
				break;
			}
			It.next();
			count++;
		}
		It.remove();
		return It;
		
	}
			*/

}


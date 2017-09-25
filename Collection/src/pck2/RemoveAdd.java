package pck2;
import java.util.*;
public class RemoveAdd 
{
	
	public static void main(String[] args){
		List<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Linux");
		list.add("Lua");
		list.add("Python");
		
		
		list.add(1, "Javascript");
		
		
		
		
		
		System.out.println(list);
		
		
		System.out.println("        -----for  each-----");
		
		for(String S:list){
			System.out.print(S+"  ");
		}
		
		System.out.println("\n\n    -----·´Ïò±éÀú-----");
		ListIterator<String> It = list.listIterator();
		while(It.hasNext()){
			It.next();
		}
		while(It.hasPrevious())
		{
			System.out.print(It.previous()+"  ");
		}
		
	}
	
	public static List<String> add(List<String> list,String Str,int index){
		
		if(index < 0 || index > list.size())
		{
			return null;
		}
		
		ListIterator<String> It = list.listIterator();
		int count = 0;
		while(It.hasNext() && count < index)
		{
			count++;
			It.next();
		}
		It.add(Str);
		return list;
	}

	
		
	
	public static  List<String> remove(List<String> list){
		
		return list;
	}
}

package com.Map;
import java.util.*;
import java.time.LocalDate;
public class MapTest {
	
	
	public static void main(String[] args){
		
		Map<String,Employee> staff = new HashMap<>();
		staff.put("144-25-5464", new Employee("Amy  Lee"));
		staff.put("567-24-2546", new Employee("Harry  Hacker"));
		staff.put("157-62-7935", new Employee("Gary cooper"));
		staff.put("157-62-8025", new Employee("Sally cooper"));
		staff.put("456-62-5527", new Employee("Francesca  Cruz"));
		
		staff.forEach((k,v)->
			System.out.println("key = "+k+",value = "+v.getName())
				);
		
		
		System.out.println();
		System.out.println(staff.get("157-62-7935").getName());
		System.out.println(staff.get("157-62-7835"));
		System.out.println(staff.getOrDefault("157-62-7935", new Employee("")));
		Employee e = staff.getOrDefault("157-62-7835", new Employee("null"));
		System.out.println("Name:"+e.getName());
		
		System.out.println();
		
		System.out.println();
		
		
		for(Employee E:staff.values())
			System.out.print(E.getName()+",");
		
		System.out.println("\n\n"+staff.put("567-24-2546", new Employee("Core S.Horstmann")).getName());
		for(Employee E:staff.values())
			System.out.print(E.getName()+",");
		
		
		System.out.println("\n\nHashMap"+staff.keySet());
		Map<String,Employee> treeMap = new TreeMap<>();
		treeMap.putAll(staff);
		System.out.println("TreeMap"+treeMap.keySet());
	}

}




class Employee
{
   private String name;
   private double salary;
   private LocalDate hireDay;

   public Employee(String name)
   {
	   this.name = name;
   }
   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public LocalDate getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}

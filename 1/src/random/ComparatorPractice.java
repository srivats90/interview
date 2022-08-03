package random;

import java.io.Serializable;
import java.util.*;
public class ComparatorPractice implements Serializable {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>() { {	
			add(new Employee("Goms", 27));
			add(new Employee("Sash", 1));
			add(new Employee());
		}
		};
		
		list.forEach(s -> System.out.println(s.name));
		
//		Collections.sort(list);
 

		
		Comparator<Employee> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Employee a = (Employee) o1;
				Employee b = (Employee) o2;
				if(a.age > b.age)
					return 1;
				else
					return -1;
			}
			
		};
		
	//	Collections.sort(list, comp);
		Collections.sort(list, (e1, e2) -> e2.age - e1.age);
		
		//list.forEach(s -> System.out.println(s.name));
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().age);
		}
	}

}

class Employee implements Comparable{
	String name;
	int age;
	public Employee() {
		this.name = "kk";
		this.age = 30;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Employee a = (Employee) o;
		if(this.age < a.age)
			return 1;
		else
		    return -1;
	}

	
}
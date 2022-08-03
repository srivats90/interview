package streams;

import java.util.*;
import java.util.stream.Collectors;
public class MapTest {

	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"krishna",1000));
		list.add(new Employee(2,"kumar",2000));
		list.add(new Employee(3,"goms",3000));
		
		List<Employee> newList =  list.stream().map(s -> s.setSalary(s.getSalary() + 5000)).collect(Collectors.toList());
		System.out.println(newList.toString());
	}

}

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
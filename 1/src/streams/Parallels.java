package streams;
import java.util.*;
import java.util.stream.Collectors;
public class Parallels {

	int age;
	String name;
	
	Parallels(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Parallels [age=" + age + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		
		List<Parallels> list = new ArrayList<>();
		for(int i = 0; i< 5; i++) {
			list.add(new Parallels(5+i, "ABC"+i));
		}
		
		List<Parallels> newList = list.stream().parallel().map(x -> new Parallels(x.age*5, x.name+"Z")).collect(Collectors.toList());

		System.out.println(list);
		System.out.println(newList);
	}

}

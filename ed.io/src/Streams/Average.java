package Streams;

import java.util.*;
public class Average {
	
	int price;
	String name;
	
	public Average(int price, String name) {
		this.price = price;
		this.name = name;
	}
		
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		List<Average> list = new ArrayList<>(List.of(new Average(5,"Mango"), new Average(10,"Banana"), new Average(5,"Potato")));

		System.out.println(list.stream().mapToInt(Average::getPrice).average());
		
	}

}

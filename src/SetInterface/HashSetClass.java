package SetInterface;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> city = new HashSet<String>();
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Pune");
		city.add("Chennai");
		city.add("Kolkata");
		city.add("Pune");
		city.add(null);
		System.out.println(city);
		System.out.println("Iterating hashset : ");
		for(String cities : city) {
			System.out.println(cities);
		}

		System.out.println(city.isEmpty());
		city.size();
		System.out.println(city.size());
	}

}

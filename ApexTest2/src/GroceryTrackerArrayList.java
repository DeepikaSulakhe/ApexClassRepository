import java.util.ArrayList;
import java.util.List;

public class GroceryTrackerArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apples");
		list.add("Bread");
		list.add("Milk");
		list.add("Eggs");
		list.add("Coffee");
		
		System.out.println("All the Grocery Items list: "+list);
		list.remove("Bread");
		System.out.println("Grocery Items list after removing Bread: "+list);
		String item = "Milk";
		if(list.contains(item) == false) {
			System.out.println(""+item+" is not found in List");
		}else {
			System.out.println(""+item+" is found in list: "+list);
		}
		
		System.out.println("Total number of items in list: "+list.size());
		for(String n: list) {
			System.out.println(n);
		}
		
	}

}

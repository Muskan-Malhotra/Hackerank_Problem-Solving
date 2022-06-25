import java.util.*;

/**
 * First create a list (AL)
 * then add this list in an empty list created
 * then use get function to get the elemts of an AL
 * get(0) provides the first AL of the AL of AL
 * get(0).get(0) provides first element of the AL of AL
 */

class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<>();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(bakeryList);   //to create list of list
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
    System.out.println(groceryList.get(0));
    System.out.println(groceryList.get(0).get(0));
		
	}
}
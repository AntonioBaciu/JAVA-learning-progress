package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    // add item
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // print items
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // modify item
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    // remove item
    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // find an item in the grocery list
    public String findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            System.out.println(groceryList.get(position));
            return groceryList.get(position);
        }
        return null;
    }
}

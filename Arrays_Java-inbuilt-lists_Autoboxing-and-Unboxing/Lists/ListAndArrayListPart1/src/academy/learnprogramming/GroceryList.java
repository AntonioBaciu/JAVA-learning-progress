package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //  groceryList.add(item) -> adds the [item] to the groceryList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // groceryList.size() -> returns how many elements are currently stored in the ArrayList
    // groceryList.get(i) -> returns the item at index [i]
    // i + 1 -> is used since the printed list will start from 1. and not from 0.
    public void printGroceryList() {
        System.out.println("We have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    //  groceryList.set(position, newItem) -> replace the item at position x with the newItem
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    // groceryList.remove(position) -> removes the item at specified index/position
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem); // will return true or false if the searchItem is found in the groceryList
        int position = groceryList.indexOf(searchItem); // returns the index position of the item from groceryList that matched the searchItem
        if(position >= 0){ // if the position returns a positive index position (>= 0) it means that the item exists in the list, so we will return the name of the existing item
            return groceryList.get(position); // gets the item name matched with the searchItem
        }
        return null; // otherwise, if the item do not exist in the list, -1 will be returned, so in this case we will return null (nothing is returned) so our code won't break if we search for a missing item
     }


}

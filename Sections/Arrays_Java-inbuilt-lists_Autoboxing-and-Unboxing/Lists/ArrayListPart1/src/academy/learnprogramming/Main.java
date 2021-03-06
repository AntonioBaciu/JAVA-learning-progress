package academy.learnprogramming;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    // menu instructions
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    // Choice methods:

    //add input to grocery list
    public static void addItem() {
        System.out.print("Item to be added: ");
        groceryList.addGroceryItem(scanner.nextLine().toLowerCase());
    }

    // modify
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item");
        String newItem = scanner.nextLine().toLowerCase();
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    // remove
    public static void removeItem() {
        System.out.println("Remove item: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNum - 1);
    }

    // search
    public static void searchForItem() {
        System.out.println("Search item: ");
        String searchItem = scanner.nextLine().toLowerCase();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in the grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}

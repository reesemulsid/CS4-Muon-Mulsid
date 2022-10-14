/*
With what you’ve learned so far, you should be able to do the following:
Create an array or ArrayList containing different data
Loop over the different indices of the arrays and ArrayLists to check and use the content
Given the attached Item.java, we can create a store, which is essentially just an array of Items. Complete
the Store.java so that the application is able to work as specified in StoreSim.java;

Submit the package in a compressed zip folder. The package should contain 3 java files, Store.java,
Item.java, and the java file containing the main method.
*/

public class StoreSim {
  public static void main(String[] args) {
    // Create items
    Item i1 = new Item("Burger", "food", 50);
    Item i2 = new Item("Fries", "food", 30);
    Item i3 = new Item("Fried Chicken", "food", 70);

    Item i4 = new Item("Shampoo", "toiletries", 120);
    Item i5 = new Item("Soap", "toiletries", 65);
    Item i6 = new Item("Toothpaste", "toiletries", 95);

    Item i7 = new Item("T-shirt", "clothes", 200);
    Item i8 = new Item("Jeans", "clothes", 1200);
    Item i9 = new Item("Shoes", "clothes", 2300);

    // Create Stores
    Store mcdo = new Store("McDo");
    Store watsons = new Store("Watsons");
    Store mall = new Store("Supermall");

    mcdo.addItem(i1);
    mcdo.addItem(i2);
    mcdo.addItem(i3);

    watsons.addItem(i4);
    watsons.addItem(i5);
    watsons.addItem(i6);

    mall.addItem(i1);
    mall.addItem(i2);
    mall.addItem(i4);
    mall.addItem(i5);
    mall.addItem(i6);
    mall.addItem(i7);
    mall.addItem(i8);
    mall.addItem(i9);

    mall.filterType("food");
    mall.filterCheap(500);
    mall.filterExpensive(1000);

    mcdo.sellItem(0);
    mcdo.sellItem(50);
    watsons.sellItem("Soap");
    watsons.sellItem("Mouthwash");
    mall.sellItem(i7);
    mall.sellItem(i3);

    // Check final earnings
    Store.printStats();
  }
}

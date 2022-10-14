package q1ex5;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name) {
    this.name = name;
    earnings = 0;
    ArrayList<Store> itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName() {
    return name;
  }

  public double getEarnings() {
    return earnings;
  }

  public void sellItem(int index) {
    if (index < itemList.size()) {
      Item product = itemList.get(index);
      double itemCost = product.getCost();
      double sale = earnings + itemCost;
      System.out.println("Store's current sales are " + sale);
    } else {
      System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }

  public void sellItem(String name) {
    for (Item i : itemList) {
      String sampleName = i.getName();
      if (sampleName == name) {
        double itemCost = i.getCost();
        double sale = earnings + itemCost;
        System.out.println("Store's current sales are " + sale);
      } else {
        System.out.println("There are only " + itemList.size() + " items in the store.");
      }
    }
  }

  public void sellItem(Item i) {
    if (itemList.contains(i)) {
      double itemCost = i.getCost();
      double sale = earnings + itemCost;
      System.out.println("Store's current sales are " + sale);
    } else {
      System.out.println("The store does not sell this item.");
    }
  }

  public void addItem(Item i) {
    itemList.add(i);
  }

  public void filterType(String type) {
    // loop over itemList and print all items with the specified type
  }

  public void filterCheap(double maxCost) {
    Item product = itemList.get(0);
    maxCost = product.getCost();

    for (int i = 0; i < itemList.size(); i++) {
      Item sampleProduct = itemList.get(i);
      double sampleCost = sampleProduct.getCost();
      if (sampleCost > maxCost) {
        maxCost = sampleCost;
      }
    }

    for (Item j : itemList) {
      double productCosts = j.getCost();
      if (productCosts <= maxCost) {
        String productName = j.getName();
        System.out.println(productName);
      }
    }
  }

  public void filterExpensive(double minCost) {
    Item product = itemList.get(0);
    minCost = product.getCost();

    for (int i = 0; i < itemList.size(); i++) {
      Item sampleProduct = itemList.get(i);
      double sampleCost = sampleProduct.getCost();
      if (sampleCost < minCost) {
        minCost = sampleCost;
      }
    }

    for (Item j : itemList) {
      double productCosts = j.getCost();
      if (productCosts >= minCost) {
        String productName = j.getName();
        System.out.println(productName);
      }
    }
  }

  public static void printStats() {
    for (Item i : storeList) {
      String productName = i.getName();
      System.out.println(productName);

      double productCost = i.getCost();
      double overallEarnings = i.getEarnings();

      double sale = overallEarnings + productCost;
      System.out.println(productCost);
    }
    // loop over storeList and print the name and the earnings'Store.java'

  }
}

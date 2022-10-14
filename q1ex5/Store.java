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
      double sale = earnings + product.getCost();
      System.out.println("Store's current sales are " + sale);
    } else {
      System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }

  public void sellItem(String name) {
    for (Item i : itemList) {
      if (i.getName() == name) {
        double sale = earnings + i.getCost();
        System.out.println("Store's current sales are " + sale);
      } else {
        System.out.println("There are only " + itemList.size() + " items in the store.");
      }
    }
  }

  public void sellItem(Item i) {
    if (itemList.contains(i)) {
      double sale = earnings + i.getCost();
      System.out.println("Store's current sales are " + sale);
    } else {
      System.out.println("The store does not sell this item.");
    }
  }

  public void addItem(Item i) {
    itemList.add(i);
  }

  public void filterType(String type) {
    for (int i = 1; i < itemList.size(); i++) {
      if (itemList.get(i).getType().equals(type)) {
        System.out.println(itemList.get(i).getType());
      }
    }
  }

  public void filterCheap(double maxCost) {
    Item product = itemList.get(0);
    maxCost = product.getCost();

    for (int i = 0; i < itemList.size(); i++) {
      Item sampleProduct = itemList.get(i);
      if (sampleProduct.getCost() > maxCost) {
        maxCost = sampleProduct.getCost();
      }
    }

    for (Item j : itemList) {
      if (j.getCost() <= maxCost) {
        System.out.println(j.getName());
      }
    }
  }

  public void filterExpensive(double minCost) {
    Item product = itemList.get(0);
    minCost = product.getCost();

    for (int i = 0; i < itemList.size(); i++) {
      Item sampleProduct = itemList.get(i);
      if (sampleProduct.getCost() < minCost) {
        minCost = sampleProduct.getCost();
      }
    }

    for (Item j : itemList) {
      if (j.getCost() >= minCost) {
        System.out.println(j.getName());
      }
    }
  }

  public static void printStats() {
    for (Store i : storeList) {
      System.out.println(i.getName());
      System.out.println(i.getEarnings());
    }
  }
}

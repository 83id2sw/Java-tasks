package task5;

import java.util.ArrayList;
import java.util.Scanner;

import static task5.ItemList.createItemList;

public class Shop {
    private ArrayList<Item> vault = null;
    private ArrayList<Item> items;
    private int bestPrice;
    private int capacity;

    public Shop(int capacity) {
        this.capacity = capacity;
    }

    public void printItems() {
        items = createItemList();

        System.out.println("List of items:");
        for (Item i : items) {
            System.out.println(i);
        }
    }

    private int calcVolume(ArrayList<Item> list)
    {
        int sumVolume = 0;

        for(Item i: list)
        {
            sumVolume += i.volume;
        }

        return sumVolume;
    }


    private int calcValue(ArrayList<Item> items)
    {
        int sumValue = 0;

        for(Item i: items)
        {
            sumValue += i.price;
        }

        return sumValue;
    }

    public void checkSet(ArrayList<Item> list) {
        if (vault == null)
        {
            if (calcVolume(list) <= capacity)
            {
                vault = list;
                bestPrice = calcValue(list);
            }
        }
        else
        {
            if(calcVolume(list) <= capacity && calcValue(list) > bestPrice)
            {
                vault = list;
                bestPrice = calcValue(list);
            }
        }
    }

    public void makeAllSets(ArrayList<Item> list) {
        if (list.size() > 0) {
            checkSet(list);
        }

        for (int i = 0; i < list.size(); i++)
        {
            ArrayList<Item> newSet = new ArrayList<>(list);

            newSet.remove(i);

            makeAllSets(newSet);
        }
    }

    public ArrayList<Item> getBestSet()
    {
        return vault;
    }

}

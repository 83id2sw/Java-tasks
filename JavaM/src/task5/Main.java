package task5;

import java.util.ArrayList;
import java.util.Scanner;

import static task5.ItemList.createItemList;

public class Main{

    public static void main(String[] args) {
        System.out.println("Enter the capacity of vault:");
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();
        Shop shop = new Shop(capacity);

        shop.printItems();
        System.out.println();

        shop.makeAllSets(createItemList());

        ArrayList<Item> ar = shop.getBestSet();
        for (Item i : ar) {
            System.out.println(i.title);
        }

    }
}

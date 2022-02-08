package task5;

import java.util.ArrayList;

public class ItemList {

    public static ArrayList<Item> createItemList() {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item(300, 1, "Gold Box"));
        list.add(new Item(50, 3, "Silver Box"));
        list.add(new Item(100, 11, "Bronze Box"));
        list.add(new Item(10, 2, "Book"));
        list.add(new Item(20, 5, "Milk"));
        return list;
    }
}

package task5;

import java.util.ArrayList;

public class Item {
    public int volume;
    public int price;
    public String title;

    public Item(int volume, int price, String title) {
        this.volume = volume;
        this.price = price;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "volume=" + volume +
                ", price=" + price +
                ", title='" + title + '\'' +
                '}';
    }
}

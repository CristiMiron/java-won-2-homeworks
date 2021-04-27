package ro.fasttrackit.homeworks.curs10.ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlowerBasket {
    public static void main(String[] args) {
        Set<String> flowers = new HashSet<>(List.of("lalele","crini","trandafiri"));

        System.out.println(flowers);
        flowers.add("ghiocei");
        flowers.remove("lalele");
        System.out.println(flowers);
        System.out.println(flowers);

    }
}

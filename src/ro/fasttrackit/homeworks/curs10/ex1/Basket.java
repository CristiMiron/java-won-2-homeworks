package ro.fasttrackit.homeworks.curs10.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Basket {

    private final List<String> fruits = new ArrayList<>();

    public boolean find(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return true;
            }
        }
        return false;
    }





}









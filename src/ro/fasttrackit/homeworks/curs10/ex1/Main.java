package ro.fasttrackit.homeworks.curs10.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<String> fruits = new ArrayList<>();

    public static void main(String[] args) {
        basket();


    }

    private static void basket() {
        List<String> fruits = new ArrayList<>();

        fruits.add("mere");
        fruits.add("pere");
        fruits.add("portocale");
        System.out.println(fruits);

        fruits.remove("mere");
        System.out.println(fruits);

        System.out.println(fruits.get(1));

        System.out.println(fruits.stream().count());



    }




}


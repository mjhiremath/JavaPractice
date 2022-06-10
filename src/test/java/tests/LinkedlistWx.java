package tests;

import java.util.LinkedList;

public class LinkedlistWx {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Forgo");
        cars.add("BMW");
        cars.add("Mauti");
        for (String i : cars
             ) {
            System.out.println(i);
        }
    }
}

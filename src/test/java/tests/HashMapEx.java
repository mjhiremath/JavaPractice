package tests;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> capitlCities = new HashMap<String, String>();
        capitlCities.put("Karnataka","Bangalore");
        capitlCities.put("Maharashta","Mumbai");
        System.out.println(capitlCities);
        for (String i : capitlCities.keySet()){
            System.out.println(i);
        }
        for (String i : capitlCities.values()){
            System.out.println(i);
        }
        for (String i : capitlCities.keySet()){
            System.out.println(i +" capital is " + capitlCities.get(i));
        }
    }
}

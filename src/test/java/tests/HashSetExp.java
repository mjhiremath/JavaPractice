package tests;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(6);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);
        numbers.add(25);
        for (int i : numbers){
            System.out.println(i);
        }
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if (i < 10){
                it.remove();
            }
            System.out.println("######################");
            System.out.println(numbers);
        }

        for (int i = 0; i <= 10; i++){
            if (numbers.contains(i)){
                System.out.println(i +" was found in set");
            } else
            {
                System.out.println(i +" was not found in set");
            }
        }
    }
}

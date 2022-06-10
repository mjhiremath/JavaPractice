package tests;

import java.util.Scanner;

public class PersonName  {

    public static void main(String[] args) {
        Person myObj = new Person();
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = myObj1.nextLine();
        myObj.setName(name1);
        System.out.println(myObj.getName());
    }
}

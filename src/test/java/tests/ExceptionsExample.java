package tests;

public class ExceptionsExample {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try{
            int[] myNumbers = {1,2,5,3,8};
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Executing after the try and catch block");
        }

        checkAge(20);

    }
}

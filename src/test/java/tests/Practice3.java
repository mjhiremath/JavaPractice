package tests;

public class Practice3 {

    static void method1(){
        System.out.println("Static method can be called without creating the object");
    }

    public void method2(){
        System.out.println("Public method can't be called without creating the object");
    }

    public static void main(String[] args) {
        method1();
        Practice3 myObject = new Practice3();
        myObject.method2();
    }
}

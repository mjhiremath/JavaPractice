package tests;

public class enumsEx {
    enum level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        level myVar = level.MEDIUM;
        System.out.println(myVar);
    }
}

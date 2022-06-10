package tests;

public class Practice4 {
    int modelYear;
    String modelName;

    public Practice4(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Practice4 myCar = new Practice4(2022, "BMW");
        System.out.println("My car at "+myCar.modelYear + " is "+myCar.modelName);
    }
}

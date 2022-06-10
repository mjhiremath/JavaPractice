package tests;

public class ConstrctorPractice {
    int x;

    public ConstrctorPractice(){
        x = 6;
        System.out.println(x);
    }

    public ConstrctorPractice(int y){
        x = y;
    }

    public static void main(String[] args) {
        ConstrctorPractice myObj = new ConstrctorPractice();
        ConstrctorPractice myObj1 = new ConstrctorPractice(9);
        System.out.println(myObj1.x);
    }
}

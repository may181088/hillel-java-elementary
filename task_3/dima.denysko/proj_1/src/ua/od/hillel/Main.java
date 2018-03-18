package ua.od.hillel;

public class Main {

    public static void main(String[] args) {
        System.out.println("This lesson on my comp. in class");
        System.out.println(minAndMaxNumbers(3,1,2)    );
    }

    public static String minAndMaxNumbers(int num1, int num2, int num3) {
        int min = num1;
        int max = num2;

        if (min > num2) {
            min = num2;
            max = num1;
        }
        if (min > num3){
            min = num3;
        } else if(max < num3) {
            max = num3;
        }

        return min + " " + max;
    }
}

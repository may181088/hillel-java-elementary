import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num;
        int discont1 = 20, discont2 = 50, price = 50;
        double sum = 0;
        double discont=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("input days qountaty: ");
        num = sc.nextDouble();
        if (num < 5) sum = num * price;                       //ничего интересного
        if (num >= 5 & num < 7) sum = num * price - discont1; //ничего интересного
        if (num == 7) sum = num * price - discont2;           //ничего интересного

        if (num > 7) {
            discont = Math.floor(num / 7) * discont2;
            if (num % 7 >= 5) discont = discont + discont1;

        }
        sum = num * price - discont;


        System.out.println("summ= " + sum);


    }
}

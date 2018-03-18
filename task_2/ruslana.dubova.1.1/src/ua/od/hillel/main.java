package ua.od.hillel;

import java.math.*;

public class main{
    /**main method */
    public static void main(String[]args){
        minOfThreeNumbers(6, 12, 90);
        minAndMaxOfThreeNumbers(16, 5, 19);
        int[] a= {53, 35, 54};
        allMinOfThreeNumbers(a);
        parityOfNumber(93.0);
        divisionOfTwoNumbers(13.0, 56.0);
        nearestNumber(10, 6, 18);
        paymentForFlat(14, 5, 7, 40, 20, 50);

    }
    /**find minimum of three numbers */
    public static void minOfThreeNumbers(int n1, int n2, int n3){
        int min= Math.min(n1, n2);
        min= Math.min(min, n3);
        System.out.println("min:" + min + "from:"+ n1+"," + n2+"," + n3+";");
    }
    /**find min and max of three numbers */
    public static void minAndMaxOfThreeNumbers(int n1, int n2, int n3){
        int min= Math.min(n1, n2);
        min= Math.min(min, n3);

        int max= Math.max(n1, n2);
        max= Math.max(max, n3);
        System.out.println("min:"+ min+", max:" + max+"from:"+ n1+","+ n2+","+ n3+";");
    }
    //**find all min of three numbers */
    public static void allMinOfThreeNumbers(int[] mas1){
        int max =mas1[0];
        for (int i=0; i<mas1.length; i++){
            if(mas1[i]>max){
                max = mas1[i];
            }
        }
        for (int i=0; i<mas1.length; i++){
            if(mas1[i]<max){
                System.out.println(mas1[i]+ " is less that max "+ max);
            }
        }
    }
    //*check parity */
    public static void parityOfNumber(double n){
        if (n%2==0){
            System.out.println("number"+ n+ "is even");
        }else{
            System.out.println("number"+ n+ "is odd");
        }
    }
    //is the result of division even
    public static void divisionOfTwoNumbers(double n1, double n2){
        if(n1%n2==0){
            System.out.println("the result of divilion is even");
        }else{
            System.out.println("the result of divilion is odd");
        }
    }
    //*nearest number to 10
    public static void nearestNumber(int n1, int n2, int n3){
        int d1=Math.abs(n1-n2);
        int d2=Math.abs(n1-n3);
        if(d1<d2){
            System.out.println("nearest number to 10 is"+n2);
        }else{
            System.out.println("nearest number to 10 is"+n3);
        }
    }
    //* payment for flat */
    public static void paymentForFlat(int numOfDays,int numOfDaysFor1discount, int numOfDaysFor2discount, int costFor1Day, int discount1, int discount2){
        int payment=costFor1Day*numOfDays;

        if(numOfDays<=numOfDaysFor2discount){
            payment-=discount1;

        }if(numOfDays>numOfDaysFor2discount){
            payment-=discount2;

        }
        System.out.println("payment for flat= "+ payment);
    }
}



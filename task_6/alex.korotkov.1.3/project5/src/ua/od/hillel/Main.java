package ua.od.hillel;

public class Main {

    public static void main(String[] args) {

        int hight = 8;
        int [][] array1 = initializate(hight);
        drowTriangle(array1);

        int [][] array2 = initializate(4, 6);
        drovMassiv(array2);

    }


    public static int[][] initializate(int hight){
        int [][] massiv = new int [hight][hight*2+1];
        massiv [0][hight] = 1;

        return massiv;
    }

    public static void drowTriangle(int[][] array){
        int hight = array.length;
        System.out.println("Task1: \nHigh: " + hight);
        for (int i=1;i<hight;i++){

            for(int j=1;j<hight*2-1;j++){
                array[i][j]= array[i-1][j-1] + array[i-1][j+1];
            }
        }
        for (int[] arraySimple:
                array) {
            for (int number:
                    arraySimple ) {
                if(number==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(number );
                }


            }
            System.out.println("");
        }


    }

    public static int[][] initializate(int wide, int hight){
        int [][] array = new int[hight][wide];
        array[0][0]=0;
    return array;
    }

    public static void drovMassiv(int [][] array){
        int hight, wide;
        hight = array.length;
        wide = array[0].length;
        System.out.println("Task 2: \nHight: "+ hight + " Wide: " + wide);

        int count = 0;
        int previousNumber = 0;
        while(previousNumber<wide*hight -1) {
            for (int i =  count; i < wide  - count; i++, previousNumber++) {
                array[count][i] = previousNumber + 1;
            }
            for (int i = 1 + count; i < hight - count; i++, previousNumber++) {
                array[i][wide - count - 1] = previousNumber + 1;
            }

            for (int i = wide - 1 - count; i > 0 + count; i--, previousNumber++) {
                array[hight - count - 1][i - 1] = previousNumber + 1;
            }

            for (int i = hight - 1 - count; i > 0 + count + 1; i--, previousNumber++) {
                array[i - 1][count] = previousNumber + 1;
            }
            count++;
        }

        for (int[] arrayInArray: array
                ) {
            for (int member:arrayInArray
                    ) {
                System.out.print(member + "  ");

            }
            System.out.println("");

        }



    }
}

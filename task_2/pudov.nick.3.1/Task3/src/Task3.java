/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author AnT1Xr1s
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int size = 3;
        int[] mas = new int[size];
        int i;
        for(i=0; i<3; i++)
        {
             mas[i] = in.nextInt();
        }
        int min = mas[0];
        int max = mas[0];
        int kolmin = 0;
        int kolmax = 0;
        for(i=0; i<3; i++)
        {
            if (!(mas[i] > min)) 
            {             
                if (mas[i]==min)
                {
                    kolmin++;
                }
                else
                {
                    kolmin=1;
                }
      
                min = mas[i];
  
            }
            if (!(mas[i] < max))
            {
                if (mas[i]==max)
                {
                    kolmax++;
                }
                else
                {
                    kolmax=1;
                }
                max = mas[i];
            }   
        }
        for(i=1; i<=kolmin; i++)
        {
        System.out.println("Минимальное значение:"+ min);
        }
        for(i=1; i<=kolmax; i++)
        {
        System.out.println("Максимальное значение:"+ max);
        }
    }
    
}

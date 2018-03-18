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
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        if ((a % 2)==0)
        {
            System.out.println("Четное");
        }
        else
        {
            System.out.println("Нечетное");
            
        }
    }
    
}

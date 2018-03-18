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
public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а");
        int a = in.nextInt();
        System.out.println("Введите значение b");
        int b = in.nextInt();
        int m1 = Math.abs(a-10);
        int m2 = Math.abs(b-10);
        if(m1 > m2)
        {
            System.out.println("Число b ближе к 10");
        }
        else
        {
            System.out.println("Значение a ближе к 10");
        }
    }
    
}

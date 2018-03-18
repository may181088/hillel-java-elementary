package ua.od.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Please type what opperation you want to do 'tips' or 'calculator': ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command1 = reader.readLine();
        if (command1.equalsIgnoreCase("tips")){
            System.out.println("You choose tips calculator! \nPlease input your order total");
            Float orderTotal = Float.parseFloat(reader.readLine());
            System.out.println("Please input level of service:");
            String service = reader.readLine();
            System.out.println("Tips: " + calculateOrder(service, orderTotal));

        }
        else if (command1.equalsIgnoreCase("calculator")){
            System.out.println("You choose calculator! \nPlease input operation name");
            String operation= reader.readLine();
            if(operation.toLowerCase().equals("abs")){
                System.out.println("Please first number:");
                Float num1 = Float.parseFloat(reader.readLine());
                System.out.println("Result: " + calculateBase(num1, operation));

            }
            else{
                System.out.println("Please input first number");
                Float num1 = Float.parseFloat(reader.readLine());
                System.out.println("Please input second number");
                Float num2 = Float.parseFloat(reader.readLine());
                System.out.println("Result: " + calculateBase(num1, num2, operation));

            }



        }
    }


    private static float calculateBase(float num1, float num2, String operation) {
        float result = 0;
        switch (operation.toLowerCase()) {
            case "multiply":
                return result = num1 * num2;
            case "divide":
                return result = num1 / num2;
            case "add":
                return result = num1 + num2;
            case "minus":
                return result = num1 - num2;
            case "rest":
                return result = num1 % num2;
        }
        return 0;
    }
        private static float calculateBase(float num1, String operation){
            float result = 0;
            switch (operation.toLowerCase()) {
                case "abs":
                    return result = Math.abs(num1);

            }
            return 0;
        }



    private static float calculateOrder(String serviceLevel, float orderTotal){
        int tipsPercentage = 0;
        float tips = 0;
        switch (serviceLevel.toLowerCase()){
            case "terriable":
                break;
            case "poor":
                tipsPercentage = 5;
                break;
            case "good":
                tipsPercentage = 10;
                break;
            case "great":
                tipsPercentage = 15;
                break;
            case "excelent":
                tipsPercentage = 20;
                break;
        }

        return  tips = orderTotal * tipsPercentage /100;

    }
}

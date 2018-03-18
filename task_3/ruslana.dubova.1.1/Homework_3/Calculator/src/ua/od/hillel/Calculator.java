package ua.od.hillel;


public class Calculator {
    public int compute(String operation, int firstOperand, int secondOperand){
        int result = 0;
        switch(operation){
            case "addition":
              result = firstOperand+secondOperand;
              break;
            case "multiplication":
                result = firstOperand*secondOperand;
                break;
            case "division":
                result = firstOperand/secondOperand;
                break;
            case "subtruction":
                result = firstOperand-secondOperand;
                break;
            case "restOfDiv":
                result = firstOperand%secondOperand;
                break;
            case "module":
                result = Math.abs(firstOperand);
                break;
            default:
                System.out.println("Unrecognised command");
        }
        return result;
    }
}

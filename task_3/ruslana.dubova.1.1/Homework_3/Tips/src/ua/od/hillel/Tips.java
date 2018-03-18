package ua.od.hillel;

public class Tips {
    public double compute(String impression, float price) {
        double tips = 0;
        switch(impression){
            case "terrible":
                tips = 0.0;
                break;
            case "poor":
                tips = price*0.05;
                break;
            case "good":
                tips = price*0.1;
                break;
            case "great":
                tips = price*0.15;
                break;
            case "exellent":
                tips = price*0.2;
                break;
            default:
                System.out.println("Unknown impression");
        }
        return tips;
    }
}

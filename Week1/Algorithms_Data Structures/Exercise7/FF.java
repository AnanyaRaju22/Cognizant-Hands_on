package Anu;

public class FF {
	
    public static void main(String[] args) {
    	
        double[] revenues = {5000, 5200, 5100, 5300, 5500};
        double totalGrowth = 0;
        
        for (int i = 1; i < revenues.length; i++) {
            totalGrowth += (revenues[i] - revenues[i-1]) / revenues[i-1];
        }
        
        double avgGrowth = totalGrowth / (revenues.length - 1);
        double forecast = revenues[revenues.length-1] * (1 + avgGrowth);
        System.out.println("Ananya's projected revenue: " + forecast);
    }
}




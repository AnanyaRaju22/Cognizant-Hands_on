package Project1;

import java.util.Scanner;

public class BonusCalculator {

    // Simulated stored procedure in Java
    public static double calculateBonus(double salary) {
        if (salary >= 50000) {
            return salary * 0.1; // 10% bonus
        } else if (salary >= 30000) {
            return salary * 0.08; // 8% bonus
        } else {
            return salary * 0.1; // 10% bonus for lower income
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        double bonus = calculateBonus(salary);

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);

        sc.close();
    }
}

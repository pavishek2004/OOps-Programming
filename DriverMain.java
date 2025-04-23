package oopsProgramming;
import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        
        System.out.print("Monthly Salary: $");
        double salary = scanner.nextDouble();
        
        Employee employee = new Employee(empId, empName, salary);
        
        // Get product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();
        
        System.out.print("Product Unit Price: $");
        double price = scanner.nextDouble();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        
        Product product = new Product(pid, price, quantity);
        
        // Calculate and display tax information
        System.out.println("\n----- Tax Calculation Results -----");
        
        // Display Employee Tax Information
        System.out.println("\nEmployee Details:");
        System.out.println(employee);
        double yearlyIncome = employee.getSalary() * 12;
        System.out.printf("Yearly Income: $%.2f\n", yearlyIncome);
        System.out.printf("Income Tax Rate: %.1f%%\n", Taxable.incomeTax * 100);
        System.out.printf("Income Tax: $%.2f\n", employee.calcTax());
        
        // Display Product Tax Information
        System.out.println("\nProduct Details:");
        System.out.println(product);
        System.out.printf("Sales Tax Rate: %.1f%%\n", Taxable.salesTax * 100);
        System.out.printf("Sales Tax per Unit: $%.2f\n", product.calcTax());
        System.out.printf("Total Price before Tax: $%.2f\n", product.getTotalPrice());
        System.out.printf("Total Sales Tax: $%.2f\n", product.getTotalTax());
        System.out.printf("Total Price with Tax: $%.2f\n", 
                          product.getTotalPrice() + product.getTotalTax());
        
        scanner.close();
    }
}
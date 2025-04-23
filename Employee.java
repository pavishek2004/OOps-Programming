package oopsProgramming;


class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary; // monthly salary
    
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public double calcTax() {
        // Calculate income tax on yearly salary
        double yearlySalary = salary * 12;
        return yearlySalary * incomeTax;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee [ID: " + empId + ", Name: " + name + ", Monthly Salary: $" + salary + "]";
    }
}
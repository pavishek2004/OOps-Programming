package oopsProgramming;


class Product implements Taxable {
    private int pid;
    private double price; // unit price
    private int quantity;
    
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public double calcTax() {
        // Calculate sales tax on unit price of product
        return price * salesTax;
    }
    
    public int getPid() {
        return pid;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getTotalPrice() {
        return price * quantity;
    }
    
    public double getTotalTax() {
        return calcTax() * quantity;
    }
    
    @Override
    public String toString() {
        return "Product [ID: " + pid + ", Unit Price: $" + price + ", Quantity: " + quantity + "]";
    }
}

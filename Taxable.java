package oopsProgramming;
import java.util.Scanner;

public interface Taxable {

    double salesTax = 0.07; // 7%
    double incomeTax = 0.105; // 10.5%
    
    double calcTax();
}

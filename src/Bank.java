import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    private String city;
    private Customer[] customers;
    private int customerCount = 0;
    private int customerLimit;

    public Bank(String name, String city, int customerLimit){
        this.name = name;
        this.city = city;
        this.customerLimit = customerLimit;
        customers = new Customer[customerLimit];
    }

    public void displayCustomers(){
        for (Customer c:this.customers) {
            System.out.println(c);
        }
    }

    public void registerCustomer(){
        System.out.println("Tast kundens navn:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Tast kundens startbeløb:");
        int startAmount = scan.nextInt();

        //tilføj kunde til banken med det navn brugeren har skrevet i konsollen
        this.addCustomer(name, startAmount);

    }

    @Override
    public String toString(){
        String space = "\n";
        String s ="Navn: "+ this.name +space+"By: "+ this.city+space+"Max antal kunder: "+this.customerLimit+space;
        return s;
    }

    private void addCustomer(String name, int startAmount){
        Customer c = new Customer(name, startAmount);
        customers[customerCount]=c;
        this.customerCount++;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getName() {
        return name;
    }
    public int getCustomerLimit() {
        return customerLimit;
    }
}

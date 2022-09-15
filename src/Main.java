import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        // create a bank instances
        Bank bank1 = new Bank("Yvonnes Bank", "København", 3);
        Bank bank2 = new Bank("Lollandsbanken", "Maribo",1000);


        // tell the user to register new customers in the bank until the banks limit is met
        System.out.println("Opret 3 Kunder i "+bank1.getName());



        while(bank1.getCustomerCount() < bank1.getCustomerLimit()) {
            bank1.registerCustomer();
        }

        bank1.displayCustomers();
    }






}

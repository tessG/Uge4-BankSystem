public class Customer {
    private String name;
    private int balance;

    //Konstruktor
    public Customer(String name, int startAmount){
        this.balance = startAmount;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }



    @Override
    public String toString(){
        String space = ": ";
        String s = this.name +space+ this.balance+"kr";
        return s;
    }


}

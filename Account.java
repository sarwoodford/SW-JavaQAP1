public class Account{

    // assign attributes
    private String id;
    private String name;
    private int balance = 0;

    // constructors

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // do a second constructor with only name and id so that accounts can be made when balance is the default value of 0
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    // getters

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    //methods 
    // credit: adds to balance
    public int credit(int amount){
        balance += amount;
        return balance;
    }

    // debit: decreases amount if funds are insufficient
    public int debit(int amount){
        if (amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient Funds. Amount Exceeds Balance.");
        }
        return balance;
    }

    // transferTo: transfers amounts between accounts
    public int transferTo(Account another, int amount){
        if(amount <= balance){
            this.debit(amount);
            another.credit(amount);
        }else{
            System.out.println("Cannot Transfer. Amount Exceeds Balance.");
        }
        return balance;
    }

    // toString: concantonates values to return to user
    public String toString(){
        return "Account[id: " + id + " name: " + name + " balance " + balance + "]";
    }
}
package Module2_1.CustomerOOP;

public class Customer {
    String name;
    int id;
    static double balance;

    public Customer(String name1, int id1){
        name = name1;
        id = id1;
        balance = 0;
    }

    public Customer(String name1, int id1, double balance1){
        name = name1;
        id = id1;
        balance = balance1;
    }
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}


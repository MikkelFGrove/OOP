package Module2_1.CustomerOOP;

public class main {
    public static void main(String[] args) {
        Customer aCustomer = new Customer("Mikkel", 3);
        aCustomer.deposit(400);
        aCustomer.withdraw(250);
        System.out.println(aCustomer.getBalance());

        CustomerDatabase customerData = new CustomerDatabase();
        customerData.newCustomer(aCustomer);
        customerData.removeID(3);

        customerData.printCustomerList();
    }
}

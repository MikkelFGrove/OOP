package Module2_1.CustomerOOP;

public class CustomerDatabase {
    Customer[] customers;
    static int customerNumber = 0;
    public CustomerDatabase(){
        customers = new Customer[10];
    }

    public void newCustomer(Customer customer){
        for (int i = 0; i < customers.length; i++){
            if (customers[i] == null){
                customers[i] = customer;
                return;
            }
        }
        System.out.println("Database is full!");

    }

    public Customer[] returnArray(){
        return customers;
    }

    public void printCustomerList(){
        for (int i = 0; i < customers.length; i++){
            if (customers[i] != null){
                System.out.println(customers[i].name);
            }
        }
    }

    public void removeID(int id){
        for (int i = 0; i < customers.length; i++){
            if(customers[i] != null) {
                if (customers[i].id == id){
                    customers[i] = null;
                }
            }
        }
    }
}

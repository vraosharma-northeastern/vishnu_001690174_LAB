/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class CustomerDir {
    ArrayList<Customer> customerList;

    public CustomerDir(){
        customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer findbyID(String id){
        for(Customer c : customerList){
            if(c.getPersonID().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Customer createCustomer(String personID, String name, String age){
        Customer customer = new Customer(personID, name, age);
        customerList.add(customer);
        return customer;
    }
    
}

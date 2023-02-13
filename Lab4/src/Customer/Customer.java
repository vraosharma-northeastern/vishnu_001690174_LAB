/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class Customer extends Person {
    private int ordersTotal;
    
    private ArrayList<Order> customerOrderList;

    public Customer(){
        super();
        customerOrderList = new ArrayList<Order>();
    }
    
    public Customer(String personID, String name, String age){
        super.age = age;
        super.name = name;
        super.personID = personID;
        customerOrderList = new ArrayList<Order>();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public ArrayList<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public void setCustomerOrderList(ArrayList<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
    public void addDeliveryOrder(Order o){
        this.customerOrderList.add(o);
    }

    @Override
    public String toString() {
        return this.personID; 
    }
    
    
}

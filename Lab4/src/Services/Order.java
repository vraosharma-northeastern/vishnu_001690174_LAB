/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;

/**
 *
 * @author vraosharma
 */
public class Order {
    Customer customer;
    DeliveryAgent agent;
    private static int count = 0;
    String orderID;
    String status;
    public Order(){
        this.customer = new Customer();
        this.agent = new DeliveryAgent();
        this.orderID = "Ord" + count++;
        this.status = "Created";
        this.count = count++;

        this.orderID = "ORDER" + count++;
    }
    public Order(Customer customer, DeliveryAgent agent){
        this.customer = customer;
        this.agent = agent;
        this.orderID = "Ord" + count++;
        this.status = "Created";
        this.count = count++;

        this.orderID = "ORDER" + count++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    public static int getCount() {
        return count;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getStatus() {
        return status;
    }

  

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  
    public String toString(){
        return this.orderID;
    }
}

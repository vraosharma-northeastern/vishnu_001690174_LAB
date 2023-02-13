/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;
import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class MasterOrderDir {
    ArrayList<Order> orderList;
    
    
    public MasterOrderDir(){
        this.orderList = new ArrayList<Order>();
    }
    
    //create order
    public Order createOrder(Customer customer, DeliveryAgent del){
        Order o = new Order(customer, del);
        this.orderList.add(o);
        return o;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    
    //request order
    public Order requestOrder(Customer customer){
        Order o = new Order();
        o.setCustomer(customer);
        this.orderList.add(o);
        return o;
    }
    
    
    //assign order
    public Order assignOrder(Order o, DeliveryAgent del){
        o.setAgent(del);
        return o;
    }
        
}

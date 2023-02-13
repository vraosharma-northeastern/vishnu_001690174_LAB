/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class DeliveryAgent extends Person {
    private int orderCount;
    private ArrayList<Order> agentOrderList;
    
    public DeliveryAgent (){
        super();
        this.agentOrderList = new ArrayList<Order>();
    }

    public int getOrderCount() {
        return orderCount;
    }

    public ArrayList<Order> getAgentOrderList() {
        return agentOrderList;
    }

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void setAgentOrderList(ArrayList<Order> agentOrderList) {
        this.agentOrderList = agentOrderList;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public Order addOrder(Order o){
        agentOrderList.add(o);
        return o;
    }
}

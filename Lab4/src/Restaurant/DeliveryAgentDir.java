/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class DeliveryAgentDir {
    ArrayList<DeliveryAgent> deliveryAgentList;
    
    public DeliveryAgentDir(){
        this.deliveryAgentList = new ArrayList<DeliveryAgent>();
    }
    
    

    public ArrayList<DeliveryAgent> getDeliveryAgentList() {
        return deliveryAgentList;
    }

    public void setDeliveryAgentList(ArrayList<DeliveryAgent> deliveryAgentList) {
        this.deliveryAgentList = deliveryAgentList;
    }
    
    public DeliveryAgent findbyID(String id){
        for(DeliveryAgent d : deliveryAgentList){
            if(d.getPersonID().equals(id)){
                return d;
            }
        }
        return null;
    }
    
    public DeliveryAgent createAgent(String personID, String name, String age){
        DeliveryAgent agent = new DeliveryAgent();
        
        agent.setAge(age);
        agent.setName(name);
        agent.setPersonID(personID);
        
        
        deliveryAgentList.add(agent);
        return agent;
    }

    public UserAccount createUserAccount(String admin, String admin0, String manager) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

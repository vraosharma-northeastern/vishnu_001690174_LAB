/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDir;
import Restaurant.DeliveryAgentDir;
import Services.MasterOrderDir;

/**
 *
 * @author vraosharma
 */
public class Business {
    private DeliveryAgentDir deliveryAgentDirectory;
    private CustomerDir customerDirectory;
    private UserAccountDir useraccountDirectory;
    private MasterOrderDir allOrders;
    
    public Business (){
        this.deliveryAgentDirectory= new DeliveryAgentDir();
        this.customerDirectory = new CustomerDir();
        this.useraccountDirectory = new UserAccountDir();
        this.allOrders = new MasterOrderDir();
        

        UserAccount user = this.useraccountDirectory.createUserAccount("admin", "admin", "Manager");
    }

    public DeliveryAgentDir getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public CustomerDir getCustomerDirectory() {
        return customerDirectory;
    }

    public UserAccountDir getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public MasterOrderDir getAllOrders() {
        return allOrders;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDir deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public void setCustomerDirectory(CustomerDir customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void setUseraccountDirectory(UserAccountDir useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public void setAllOrders(MasterOrderDir allOrders) {
        this.allOrders = allOrders;
    }

    
    
    public static Business getBusinessInstance(){
        return new Business();
    }
    
    
    
}

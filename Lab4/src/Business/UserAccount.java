/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import UI.CustomerWorkArea.CustomerJFrame;
import UI.DeliveryAgentWorkArea.AgentJFrame;
import UI.ManagerWorkArea.ManagerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author vraosharma
 */
public class UserAccount {
    private static int count = 0;
    private String accountID;
    private String username;
    private String password;
    
    private String role;
    public UserAccount(){
        this.accountID = "Acc" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public UserAccount(String username, String password, String role){
        this.accountID = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
                
    }

    public static int getCount() {
        return count;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public void getObjectDetails(){
        System.out.println(username+ " username "+ password +" passw " + role +" role ");
    }
    
    
    public JFrame getWorkArea(String role, Business business, UserAccount useraccount){
        if (role.equals("Manager")){
            return new ManagerJFrame(business, useraccount);
        }
        if (role.equals ("Customer") ) {
            return new CustomerJFrame(business, useraccount);
        }
        if (role.equals ("Agent") ) {
            return new AgentJFrame(business, useraccount);
        }
        return null;
    }
        
}

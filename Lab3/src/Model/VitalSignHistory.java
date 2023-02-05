/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    
    public Observation createObservation (int obversationID, double bloodPressure, double temperature){
        Observation observation = new Observation();
        
        observation.setObservationID(obversationID);
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(temperature);
        
        this.vitalSignHistory.add(observation);
        return observation;
    }
    public Observation findObservation(int id){
        for(Observation o : this.vitalSignHistory){
            if (o.getObservationID() == id){
                return o;
            }
        }
        return null;
    }
    
    public Boolean checkObservationIDUnique(int id){
        for (Observation o: this.vitalSignHistory){
            if (o.getObservationID() == (id)){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vraosharma
 */
public class Observation {
    int observationID;
    private double bloodPressure;
    private double temperature;
    private Medicine medication;
    public Observation(){
        this.medication = new Medicine();
    }

    public int getObservationID() {
        return observationID;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setObservationID(int observationID) {
        this.observationID = observationID;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }
   

    @Override
    public String toString() {
        return String.valueOf(this.observationID); 
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

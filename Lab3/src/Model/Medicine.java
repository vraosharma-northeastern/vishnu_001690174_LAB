/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author vraosharma
 */
public class Medicine {
    String medicineName;
    Double dosage;

    public Medicine(){
        this.medicineName = "";
        this.dosage = null;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public Double getDosage() {
        return dosage;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

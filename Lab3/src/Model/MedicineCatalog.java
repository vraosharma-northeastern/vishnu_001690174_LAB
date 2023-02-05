/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vraosharma
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicineCatalog;
    
    public MedicineCatalog(){
        this.medicineCatalog = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineCatalog() {
        return medicineCatalog;
    }

    public void setMedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        medicine.setMedicineName(name);
        medicine.setDosage(dosage);
        
        this.medicineCatalog.add(medicine);
        return medicine;
    }
    public Boolean checkMedicineIDUnique(String name){  
        for (Medicine med: this.medicineCatalog){
            if (med.getMedicineName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

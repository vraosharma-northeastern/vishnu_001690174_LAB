/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author vraosharma
 */
public class Person {
    public String personID;
    public String name;
    public String age;

    public Person(){
        this.personID = personID;
        this.name = name;
        this.age = age;
    }
    public Person(String personID, String name, String age){
        this.personID = personID;
        this.name = name;
        this.age = age;
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

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.personID; 
    }

    
}
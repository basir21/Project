/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CalculateKreditAnalysis {
    
    private List<Person> person;
    
    

    public CalculateKreditAnalysis() {
        person = new ArrayList<>();
    }
    
    public double HitungBungaCicilan(){
        double bungaKredit= 0.0;
        for (Person people : person) {
            bungaKredit= people.getJumlahPinjaman()*people.getSukuBunga()*(people.getLamaPinjaman()/12.0);
            return bungaKredit;
        }
        return bungaKredit;
    }
//    public double hitungCicilan(){
//        double totalCicilan = 0.0;
//        for (Person people : person) {
//            totalCicilan = 
//        }
//        
//        return totalCicilan;
//    }

    /**
     * @return the person
     */
    public List<Person> getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(List<Person> person) {
        this.person = person;
    }
    
    

    
    
    
    
    
}

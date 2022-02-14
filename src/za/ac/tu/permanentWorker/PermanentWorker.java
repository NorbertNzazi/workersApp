/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tu.permanentWorker;

import za.ac.tut.worker.Worker;

/**
 *
 * @author tresorkl
 */
public class PermanentWorker extends Worker {
    
 private int numberOfDaysWorkedPerMonth;
 
 
    public PermanentWorker(){
        
    }
    
    public PermanentWorker(String name,int numberOfDaysWorkedPerMonth){
        
        super(name);
        this.numberOfDaysWorkedPerMonth = numberOfDaysWorkedPerMonth;
        
    }

    public int getNumberOfDaysWorkedPerMonth() {
        return numberOfDaysWorkedPerMonth;
    }

    public void setNumberOfDaysWorkedPerMonth(int numberOfDaysWorkedPerMonth) {
        this.numberOfDaysWorkedPerMonth = numberOfDaysWorkedPerMonth;
    }

    @Override
    public String toString() {
        return "PermanentWorker{" + "numberOfDaysWorkedPerMonth=" + numberOfDaysWorkedPerMonth + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.seasonalworker;

import za.ac.tut.worker.Worker;

/**
 *
 * @author tresorkl
 */
public class SeasonalWorker extends Worker {
    
    private int  numberOfBagsCompletedPerMonth;
    
    public SeasonalWorker(){ 
        
    }
    
    public SeasonalWorker(String name, int numberOfDaysWorkedPerMonth){
        super(name);
        this.numberOfBagsCompletedPerMonth = numberOfDaysWorkedPerMonth;
    }

    public int getNumberOfBagsCompletedPerMonth() {
        return numberOfBagsCompletedPerMonth;
    }

    public void setNumberOfBagsCompletedPerMonth(int numberOfDaysWorkedPerMonth) {
        this.numberOfBagsCompletedPerMonth = numberOfDaysWorkedPerMonth;
    }

    @Override
    public String toString() {
        return "SeasonalWorker{" + "numberOfBagsCompletedPerMonth=" + numberOfBagsCompletedPerMonth + '}';
    }
    
    
}

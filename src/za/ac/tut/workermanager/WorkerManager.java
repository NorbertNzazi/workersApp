/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.workermanager;

import java.util.ArrayList;
import java.util.List;
import za.ac.tu.permanentWorker.PermanentWorker;
import za.ac.tut.seasonalworker.SeasonalWorker;
import za.ac.tut.worker.Worker;
import za.ac.tut.workerdatainterface.WorkerDataInterface;
import za.ac.tut.workerinterface.WorkerInterface;

/**
 *
 * @author tresorkl
 */
public class WorkerManager implements WorkerInterface, WorkerDataInterface {

    
    public WorkerManager(){
        
        
     }
    
    @Override
    public void determineSalaries(List<Worker> workers, List<Double> salaries) {
    
    double salary;    
    PermanentWorker permanentWorker ; 
    SeasonalWorker seasonalWorker;
        
    for(int i=0; i < workers.size();i++){
        
       
        
        if(workers.get(i) instanceof PermanentWorker ){
            
             permanentWorker = (PermanentWorker)workers.get(i);
            
            salary = PERMANENT_WORKERS_PAYMENT_RATE * 8 * permanentWorker.getNumberOfDaysWorkedPerMonth();
                
        }else{
            
            seasonalWorker = (SeasonalWorker)workers.get(i);
            
           salary = SEASONAL_WORKERS_PAYMENT_RATE  *  seasonalWorker.getNumberOfBagsCompletedPerMonth();
        }
        
        
        salaries.add(salary);
        
    }
        
        
    }
    
    
    
    @Override
    public SeasonalWorker determineBestSeasonalWorker(List<Worker> workers) {
        
        SeasonalWorker bestSeasonalWorker = null;
      
       // creating a list that will store only seasonal workers so it will be easy to find the best one  
       List<SeasonalWorker> seasonalWorkers = new ArrayList<>();
               
        for(int t=0; t<workers.size(); t++){
            
           if(workers.get(t) instanceof SeasonalWorker){
               
           SeasonalWorker  seasonalWorker = (SeasonalWorker)workers.get(t);
               
             // populating all seasonal workers 
             
              seasonalWorkers.add(seasonalWorker);
            
             }
          
        }
            
   
    // here I  sort descendingly the Numbers berOfBagsCompletedPerMonth (the sorting algorithm)
    
        for(int i=0; i< seasonalWorkers.size(); i++){
            
            for(int j=i+1; j<seasonalWorkers.size();j++){
                
             SeasonalWorker  seasonalWorkerAtI = (SeasonalWorker)seasonalWorkers.get(i);
             SeasonalWorker   seasonalWorkerAtJ = (SeasonalWorker)seasonalWorkers.get(j);
             
             
                
                if(seasonalWorkerAtI.getNumberOfBagsCompletedPerMonth() < seasonalWorkerAtJ.getNumberOfBagsCompletedPerMonth()){
                  
                
                    // swapping elements 
                    
                     seasonalWorkers.set(i, seasonalWorkerAtJ);
                     seasonalWorkers.set(j, seasonalWorkerAtI);
                     
                   
                    
                     bestSeasonalWorker = seasonalWorkers.get(0);
                     
                    }
                }
      
        }   
        
        return bestSeasonalWorker;
        
      }
    
    
}
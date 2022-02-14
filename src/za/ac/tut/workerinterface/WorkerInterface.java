/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.workerinterface;

import java.util.List;
import za.ac.tut.seasonalworker.SeasonalWorker;
import za.ac.tut.worker.Worker;



/**
 *
 * @author tresorkl
 */
public interface WorkerInterface {
    
     public void determineSalaries(List<Worker> workers, List<Double> salaries);
     
      public SeasonalWorker determineBestSeasonalWorker(List<Worker> workers); 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendaniapp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import za.ac.tu.permanentWorker.PermanentWorker;
import za.ac.tut.seasonalworker.SeasonalWorker;
import za.ac.tut.worker.Worker;
import za.ac.tut.workermanager.WorkerManager;

/**
 *
 * @author tresorkl
 */
public class RendaniApp {

    /**
     * @param args the command line arguments
     */
    
    public static void DisplayInformation( List<Double> salaries ,List<Worker> workers, SeasonalWorker bestSeasonalWorker){
        
       String info="";
       
       
       for(int i=0; i<salaries.size(); i++){
           
           if(workers.get(i) instanceof SeasonalWorker ){
               
              SeasonalWorker seasonalWorker = (SeasonalWorker)workers.get(i);
               
             info = info +("Seasonal Worker "+"\n"+
                           "Name: "+seasonalWorker.getName() + "\n"+
                           "Salary: "+salaries.get(i)).concat("\n\n");
           }else{
               
               PermanentWorker permanentWorker = (PermanentWorker)workers.get(i);
               
                info = info +("Permanent Worker "+"\n"+
                           "Name: "+permanentWorker.getName() + "\n"+
                           "Salary: "+salaries.get(i)).concat("\n\n");
               
           }
            
       }
       
       info = info + ("Best Seasonal worker"+"\n"+
                            "---------------------"+"\n"+
                             "Name: "+bestSeasonalWorker.getName()+"\n"+
                            "Number of Bags: "+ bestSeasonalWorker.getNumberOfBagsCompletedPerMonth());
           
           
       JOptionPane.showMessageDialog(null, info, "SALARY INFORMATION", JOptionPane.INFORMATION_MESSAGE);
       
        
    }
    
    public static void main(String[] args) {
       
        
        
        
        List<Worker> workers = new ArrayList<>();
        
        List<Double> salaries = new ArrayList<>();
        
        
        //populate
        
        PermanentWorker p1 = new PermanentWorker("MBIKA", 20);
        PermanentWorker p2 = new PermanentWorker("TRESOR", 10);
        SeasonalWorker s2 = new SeasonalWorker("Mary", 40);
        SeasonalWorker s1 = new SeasonalWorker("Enoch", 10);
        SeasonalWorker s3 = new SeasonalWorker("NeBia", 65);
       
        
       
        workers.add(p1);
        workers.add(s2);
        workers.add(s1);
        workers.add(s3);
        workers.add(p2);
       
        
        WorkerManager processor = new WorkerManager();
        
        //determine the salary of each worker 
        processor.determineSalaries(workers, salaries);
        
        // getting the bestSeasona lWorker 
        SeasonalWorker bestSeasonalWorker = processor.determineBestSeasonalWorker(workers);
       
        //Display
        DisplayInformation( salaries , workers, bestSeasonalWorker);
        
        
        
        
        
        
    }
    
}

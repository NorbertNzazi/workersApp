/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.worker;

/**
 *
 * @author tresorkl
 */
public abstract class Worker {
    
    private String name;
    
    public Worker(){
        
        
    }
    
     public Worker(String name){
        
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + '}';
    }
     
     
    
}

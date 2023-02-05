package edu.craptocraft.mollap.targets;


public class Vehicle implements Target{
    
    @Override
    public void execution(String id){

        System.out.println("The door is open: " + id + ", you can get your car.");
    }
}

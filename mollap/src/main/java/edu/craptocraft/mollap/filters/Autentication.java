package edu.craptocraft.mollap.filters;

public class Autentication implements Filter{
    
    @Override
    public void execution(String id){

        System.out.println("Autentication for " + id + " done.");
    }
}

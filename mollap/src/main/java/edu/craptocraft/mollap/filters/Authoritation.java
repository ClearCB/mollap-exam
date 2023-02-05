package edu.craptocraft.mollap.filters;

public class Authoritation implements Filter{

    @Override
    public void execution(String id){

        System.out.println("Authoritation for " + id + " done.");
    }
}

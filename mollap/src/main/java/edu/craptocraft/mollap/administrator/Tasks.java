package edu.craptocraft.mollap.administrator;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.mollap.filters.Filter;
import edu.craptocraft.mollap.targets.Target;

public class Tasks {
    private List<Filter> tasksToDo = new ArrayList<Filter>();
    private Target target;

    public Tasks(){
        this.target = null;
    }

    public void setTarget(Target targetFocus){
        this.target = targetFocus;
    } 

    public Target getTarget(){
        return this.target;
    }

    public List<Filter> getTasks(){
        return this.tasksToDo;
    }

    public void addTask(Filter task){
        this.getTasks().add(task);
    }

    public void execution(String id){

        for (int i = 0; i<this.getTasks().size(); i++){

            this.getTasks().get(i).execution(id);
        }

        this.getTarget().execution(id);
    }

}

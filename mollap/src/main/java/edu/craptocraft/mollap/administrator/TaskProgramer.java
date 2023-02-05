package edu.craptocraft.mollap.administrator;


import edu.craptocraft.mollap.filters.Filter;
import edu.craptocraft.mollap.targets.Target;

public class TaskProgramer {
    Target target;
    Tasks tasks;

    public TaskProgramer(Target target){
        this.target = target;
        this.tasks = new Tasks(); 
    }

    public Tasks getTasks(){
        return this.tasks;
    }

    public void setTask(Filter task){
        this.getTasks().addTask(task);
        this.getTasks().setTarget(this.target);
    }

    public void executionTasks(String id){
        this.getTasks().execution(id);
    }

}

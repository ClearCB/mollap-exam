package edu.craptocraft.mollap.clients;

import edu.craptocraft.mollap.administrator.TaskProgramer;

public class Mollapp {
    TaskProgramer taskProgramer;

    public Mollapp(){
        this.taskProgramer = null;
    }

    public void setTaskProgramer(TaskProgramer tasker){
        this.taskProgramer = tasker;
    }

    public void sendPetition(String id){
        this.taskProgramer.executionTasks(id);
    }
}

package edu.craptocraft.mollap.clients;

import edu.craptocraft.mollap.administrator.TaskProgramer;

public interface Client {
    
    void setTaskProgramer(TaskProgramer program);

    void sendPetition(String petition);
}

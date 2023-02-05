package edu.craptocraft.mollap;

import edu.craptocraft.mollap.administrator.TaskProgramer;
import edu.craptocraft.mollap.clients.Mollapp;
import edu.craptocraft.mollap.filters.Autentication;
import edu.craptocraft.mollap.targets.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        TaskProgramer tasksProgramer = new TaskProgramer(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        tasksProgramer.setTask(new Autentication());
        tasksProgramer.setTask(new Autentication());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTaskProgramer(tasksProgramer);
        mollapp.sendPetition("Francesc");
    }
}
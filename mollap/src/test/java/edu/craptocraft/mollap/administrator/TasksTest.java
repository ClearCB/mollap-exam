package edu.craptocraft.mollap.administrator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.craptocraft.mollap.filters.Authoritation;
import edu.craptocraft.mollap.filters.Filter;


public class TasksTest {
    static Tasks tasks;
    static Filter filter;
    static String id;


    @BeforeClass
    public static void  tasksTest(){
        tasks =  new Tasks();
        filter = new Authoritation();
        id = "Jorge";
    }

    @Test
    public void constructorTest(){

        
        assertNotNull(tasks);

    }

    @Test
    public void addTaskTest(){

        assertEquals(0,tasks.getTasks().size());
        tasks.addTask(filter);
        assertEquals(1,tasks.getTasks().size());

    }

}

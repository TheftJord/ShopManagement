package com.management;

import java.util.LinkedList;

public class ListProcesses {
    
    // variables
    LinkedList presentList = new LinkedList();

//---------------------------------------selecting list used----------------------------------------

    /**
     * sets up the list that is going to be used
     * this makes it so you don't have to call the list everytime you want to use these processes
     * this was set up like this because we are going to need multiple lists so it is just easier to 
     * it up like this
     * @param listUsed
     */
    public ListProcesses(LinkedList listUsed){
        presentList = listUsed;
    }

    /**
     * this allows you to pick a list if you didn't select the list in the initial setup
     * this is a backup but if coded properly is should be unused
     * @param listUsed
     */
    public void setList(LinkedList listUsed){
        presentList = listUsed;
    }
}

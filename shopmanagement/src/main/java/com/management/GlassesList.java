package com.management;

import java.util.LinkedList;

public class GlassesList {
    
    // variables
    LinkedList<GlassesNode> glassesList = new LinkedList();

//---------------------------------------edit lists----------------------------------------------

    /**
     * This adds items to the list
     * this only takes node and must be wrapped in one before using
     * @param newItem
     */
    public void addItem(GlassesNode newItem){

        // addes item to the list
        glassesList.add(newItem);
    }

    /**
     * this edits an item on the list
     * this compares a node to a node
     * this only takes GlassesNodes and nothing else
     * @param base
     * @param other
     */
    public void editItem(GlassesNode base, GlassesNode other){

        // get location on list
        int location = getLocation(base);
        if(location == -1){
            System.out.println("An Error Has Occured: Node Not Found - editItem - GlassesList");
        }

        // doubles checks to make sure that it's not the same node
        if(!glassesList.get(location).compareValues(other)){
            // doubles checks to make sure that the brand is not empty
            if(!other.getBrand().isEmpty()){
                glassesList.get(location).setBrand(other.getBrand()); // sets new value
            }
            // double checks to make sure that the id is not empty
            if(!other.getId().isEmpty()){
                glassesList.get(location).setId(other.getId()); // sets new value
            }
            // double checks to make sure that the lensesSize is not empty
            if(other.getLensesSize() != -1){
                glassesList.get(location).setLensesSize(other.getLensesSize()); // sets new value
            }
            // double checks to make sure that the bridgeSize is not empty
            if(other.getBridgeSize() != -1){
                glassesList.get(location).setBridgeSize(other.getBridgeSize()); // sets new value
            }
            // double checks to make sure that the color is not empty
            if(!other.getColor().isEmpty()){
                glassesList.get(location).setColor(other.getColor()); // sets new value
            }
        }
        else{
            System.out.println("An Error Has Occured: Node are Equal - editItem - GlassesList");
        }
    }

    /**
     * removes the desired object from the list
     * this only takes node and must be wrapped in one before using
     * @param base
     */
    public void removeItem(GlassesNode base){
        
        // gets location
        int location = getLocation(base);
        if(location == -1){
            System.out.println("An Error Has Occured: Node Not Found - removeItem - GlassesList");
        }

        // remove node from the list
        glassesList.remove(location);
    }

    public LinkedList<GlassesNode> searchItem(GlassesNode other){

        // variables
        LinkedList<GlassesNode> returnValue = new LinkedList<>(); // return value; default fail


        // return statement
        return returnValue;
    }

//--------------------------------------MISC-----------------------------------------------------

    private int getLocation(GlassesNode chosenNode){

        // variables
        int returnValue = -1; // return value; default fail

        // cycles through list for node
        for(int i = 0; i < glassesList.size(); i++){
            if(chosenNode.compareValues(glassesList.get(i))){ // compares values to find the node
                returnValue = i; // sets returnValue to equal the position in the list
                break; // ends the for loop to reduce strain on system
            }
        }

        // return statement
        return returnValue;
    }
}

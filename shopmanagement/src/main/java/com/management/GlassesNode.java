package com.management;

/**
 * this is to store the information about the glasses in question
 * @author Edmund Tartaro
 */
public class GlassesNode {
    
    // variables
    private String brand; // this is the brand of the frame
    private String id; // this is the id code for the frame in question
    // this is the lense size; typically the number on the left of the square
    private int lensesSize; 
    // this is the bridge size; typically the number on the right on the square
    private int bridgeSize;
    // this is the color of the glasses; put the actual color and not the color code
    private String color; 

//---------------------------------------------setters--------------------------------------------

    /**
     * this sets up the node once the node is called so you don't have to set all the variables up
     * indvidually
     * if you are wondering why I didn't do the set{variable name}, thats because I was lazy
     * @param brand
     * @param id
     * @param lensesSize
     * @param BridgeSize
     * @param color
     */
    public GlassesNode(String brand, String id, int lensesSize, int bridgeSize, String color){
        this.brand = brand;
        this.id = id;
        this.lensesSize = lensesSize;
        this.bridgeSize = bridgeSize;
        this.color = color;
    }

    /**
     * This sets the brand
     * @param setBrand
     */
    public void setBrand(String setBrand){
        this.brand = setBrand;
    }

    /**
     * this sets the id code
     * @param setId
     */
    public void setId(String setId){
        this.id = setId;
    }

    /**
     * this sets the lenses size
     * @param setLensesSize
     */
    public void setLensesSize(int setLensesSize){
        this.lensesSize = setLensesSize;
    }

    /**
     * This sets the bridge size
     * @param setBridgeSize
     */
    public void setBridgeSize(int setBridgeSize){
        this.bridgeSize = setBridgeSize;
    }

    /**
     * this sets the color
     * this should not be the color code but the actual color itself
     * @param setColor
     */
    public void setColor(String setColor){
        this.color = setColor;
    }
//---------------------------------------getters--------------------------------------------

    /**
     * this allows other classes to have access to the brand
     * @return 
     */
    public String getBrand(){
        return this.brand;
    }

    /**
     * This allows other classes to have access to the id code
     * @return
     */
    public String getId(){
        return this.id;
    }

    /**
     * this allows other classes to have access to the lenses size
     * @return
     */
    public int getLensesSize(){
        return this.lensesSize;
    }

    /**
     * this allows other classes to have access to the bridge size
     * @return 
     */
    public int getBridgeSize(){
        return this.bridgeSize;
    }

    /**
     * this allows other classes to have access to the color
     * this should return the actual color and not the color code
     * @return 
     */
    public String getColor(){
        return this.color;
    }

}

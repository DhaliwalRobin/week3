/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3startercode;

/**
 *
 * @author mehta
 */
public class Student {
    private String FirstName;
    private int ID;
    private boolean part_time;

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the part_time
     */
    public boolean isPart_time() {
        return part_time;
    }

    /**
     * @param part_time the part_time to set
     */
    public void setPart_time(boolean part_time) {
        this.part_time = part_time;
    }
    
}

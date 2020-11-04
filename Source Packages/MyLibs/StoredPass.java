/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author TorQuiLa
 */
public class StoredPass {
    private String firstName;
    private String lastName;
    private int age;
    private SecInfo second;
    
     public StoredPass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    /* //Inactive
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    */
    
    /*

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    */

    public SecInfo getSecond() {
        return second;
    }
}


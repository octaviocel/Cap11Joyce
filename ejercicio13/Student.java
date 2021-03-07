/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author DELL
 */
public abstract class Student {
    private String name;
    private Boolean fullTime;

    public Student(String name, Boolean fullTime) {
        this.name = name;
        this.fullTime = fullTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }
    
    public abstract Integer tarifa();
    
}

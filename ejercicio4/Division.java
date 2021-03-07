/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author DELL
 */
public abstract class Division {
    private String name;
    private Integer account;

    public Division(String name, Integer account) {
        this.name = name;
        this.account = account;
    }
    
    public abstract void display();

    public String getName() {
        return name;
    }

    public Integer getAccount() {
        return account;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

/**
 *
 * @author Slimen OUNI
 */
public class User {
    
    private int id;
    private String pseudo;
    private String password;

    public User() {
    }

    public User(String pseudo, String password) {
        this.pseudo = pseudo;
        this.password = password;
    }

    public User(int id, String pseudo, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", pseudo=" + pseudo + ", password=" + password + '}';
    }
    
    
}
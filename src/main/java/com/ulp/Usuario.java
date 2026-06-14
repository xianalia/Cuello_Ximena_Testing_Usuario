/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author xiana
 */
public class Usuario {
    private String user;
    private int pass;

    public Usuario() {
    }

    public Usuario(String user, int pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.pass != other.pass) {
            return false;
        }
        return Objects.equals(this.user, other.user);
    }
    
    
    
    public boolean validarPassword(int contra){
        return contra==this.pass;
    }
    
    void cambioPassword(String newPass){
        this.pass = Integer.parseInt(newPass);
    }
    
    void delay(int mili){
       try {
        Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Hay un delay de " + mili + " milisegundos");
        } 
    }
    
    public boolean usuariosDiferentes(Usuario u2) {
        if (this.equals(u2)){
            return true;
        } else {
            return false;
        }
 
        }
    
    
    public static boolean ValidarMailDos(String email) {
       if (email.contains("@")&& email.contains(".")&& email.length()<20){
            return true; 
    }
       return false;
}
}







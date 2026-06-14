/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ulp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author xiana
 */
public class ParameterUserTest {
    
    public ParameterUserTest() {
    }
    
    @ParameterizedTest
    @CsvSource ({
        "1234,1234",
        "123, 1234",
        "'1234', 1234", 
    })
    
    public void TestCambioPass(String newPass, int esperado){
        Usuario usr = new Usuario ("Juanjo", 1212);
        usr.cambioPassword(newPass);
        
        assertEquals(esperado, usr.getPass());
    }
    
    
}

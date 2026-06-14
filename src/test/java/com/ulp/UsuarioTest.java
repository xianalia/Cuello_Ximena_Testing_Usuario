/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ulp;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author xiana
 */
public class UsuarioTest {
    private static Usuario usr;
    private static int testI;
    
    public UsuarioTest() {
    }
    
    @BeforeAll
    public static void antesDeTodo() {
        usr = new Usuario ("Juano", 1212);
        System.out.println("Test de usuario");
    }
    
    //ESTA PRUEBA ESTÁ DISEÑADA SEGÚN SOLICITA LA CONSIGNA PERO NO IMPRIME LOS MSJES EN PANTALLA :(
    @AfterAll
    public static void despuesDeTodo() {
        System.out.println(LocalDate.now().minusDays(1));
        System.out.println("Fin de las pruebas");


    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("---------------------------");
        testI++;
        System.out.println("Test"+testI);
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("---------------------------");
    }

    @Test
    public void testValidarUsr(){                //DEBE FALLAR
        int nuevaContraseña = 2222;
        boolean resultado = usr.validarPassword(nuevaContraseña);
        assertTrue(resultado, "Fallo");
        
    }
    
    @Test
    public void validarEmail(){                 //TEST EXITOSO
        String email = "juanjo@juanjo.com";
        boolean valido;
        
        if (email.contains("@")&& email.contains(".")&& email.length()<20){
            valido = true;
            assertTrue(valido);
        }
        
    }
    
    @Test
    public void TestCambioPass(){              //TEST EXITOSO
        String newPass = "1234";
        usr.cambioPassword(newPass);
        assertEquals(1234, usr.getPass(), "Sin cambios en la contraseña");
        System.out.println("Ahora la contraseña es: "+newPass);       
    }
    
    @Test                                       //DEBE FALLAR
    @Timeout (value=30, unit =TimeUnit.MILLISECONDS)
    public void testDelay() throws InterruptedException {
        usr.delay(50);
        
    }
    
  
    
    @Test                                        //TEST EXITOSO
    public void testUsuariosDiferentes(){
        Usuario u1 = new Usuario ("Xime", 1524);
        Usuario u2 = new Usuario ("German", 1624);
        
        boolean diferente = u1.usuariosDiferentes(u2);
        assertNotSame(u1, u2, "mismo usuario");
    }
}

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
public class ParameterMailTest {
    
    public ParameterMailTest() {
        
    }
     
    //ACÁ RECICLÉ EL METODO PARA VALIDAR EMAIL (largo, @, y .) Y LO AGREGUÉ A LA CLASE USUARIO.
    //SI BIEN NO SEGUÍ LA CONSIGNA AL PIE DE LA LETRA, LA ADAPTÉ PARA PODER HACER ALGUNA PRUEBA PARAMETRIZADA
    //LO PROBÉ CON CSV SOURCE, QUE ES EL PROVEEDOR DE DATOS QUE APRENDÍ A USAR EN EL TP
    //ESTÁ DOS VECES EL MISMO TEST, PUES EN UN DEJÉ LOS DATOS TAL COMO ESTÁN EN LA CONSIGNA Y EN OTRO MODIFIQUÉ
        //PARA TENER DISTINTOS RESULTADOS
    
    @ParameterizedTest
    @CsvSource ({
        "jorgesys@tototita.com", //FALSE se pasa de 20 caracteres
        "jorgesys@tototitacom", //FALSE no tiene punto
        "jorgesystototita.com", //FALSE no tiene arroba
        "@jorgesystototita.com", //FALSE se pasa de caracteres
        ".jorgesystototita@com", //FALSE se pasa de carcteres
        
    })
    
    public void validadEmailDos (String email){
        boolean resultado = Usuario.ValidarMailDos(email);
        
        assertTrue(resultado);
    }
    
    
        @ParameterizedTest
    @CsvSource ({
        "jorgesys@toto.com", //TRUE tiene menos de 20 caracteres, @ y .
        "jorgesys@tototitacom", //FALSE no tiene punto
        "jorgesystototita.com", //FALSE no tiene arroba
        "@jorgesystototita.com", //FALSE se pasa de caracteres
        ".jorgesystototita@com", //FALSE se pasa de carcteres
        
    })
    
    public void validadEmailTres (String email){
        boolean resultado = Usuario.ValidarMailDos(email);
        
        assertTrue(resultado);
    }
    
}

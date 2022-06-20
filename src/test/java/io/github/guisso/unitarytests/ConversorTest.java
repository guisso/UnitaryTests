/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.unitarytests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 */
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ConversorTest {

    public ConversorTest() {
    }

    @Test
//    @Order(1)
    public void converter4ParaD() {
        System.out.println("converter4ParaD");
        Conversor c = new Conversor();
        assertEquals('D', c.converter((byte) 4));
    }

    @Test
//    @Order(2)
    public void converter3ParaC() {
        System.out.println("converter3ParaC");
        Conversor c = new Conversor();
        assertEquals('C', c.converter((byte) 3));
    }

    @Test
//    @Order(3)
    public void converter2ParaB() {
        System.out.println("converter2ParaB");
        Conversor c = new Conversor();
        assertEquals('B', c.converter((byte) 2));
    }

    @Test
//    @Order(4)
    public void converter1ParaA() {
        System.out.println("converter1ParaA");
        Conversor c = new Conversor();
        assertEquals('A', c.converter((byte) 1));
    }

}

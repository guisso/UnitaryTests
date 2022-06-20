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

/**
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 */
public class QuadradoTest {

    public QuadradoTest() {
    }

    @Test
    public void testSomeMethod() {
        System.out.println("Teste executado!");
    }

    @Test
    public void stringsComEnderecosIguais() {
        System.out.println("stringsComEnderecosIguais");

        String x = "IFNMG";
        String y = "IFNMG";
        assertSame(x, y);
    }

    @Test
    public void saoMesmoQuadrado() {
        System.out.println("saoMesmoQuadrado");

        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = q1;
        assertSame(q1, q2);
    }

    @Test
    public void construtorPadraoGeraLadoNulo() {
        System.out.println("construtorPadraoGeraLadoNulo");
        Quadrado q = new Quadrado();
//        assertTrue(q.getLado() == null);
//        assertEquals(null, q.getLado());
//        assertSame(null, q.getLado());
        assertNull(q.getLado());
    }

    @Test
    public void areaDeveSer4() {
        System.out.println("areaDeveSer4");
        Quadrado q = new Quadrado();
        q.setLado(2);
        assertEquals(4, q.calcularArea());
    }

    @Test
    public void areaDeveSer9() {
        System.out.println("areaDeveSer9");
        Quadrado q = new Quadrado(3);
        assertEquals(9, q.calcularArea());
    }

    @Test
    public void ladoNaoPodeSerNegativo() {
        System.out.println("ladoNaoPodeSerNegativo");
        Quadrado q = new Quadrado();

//        q.setLado(-10);
//        assertNull(q.getLado());
        assertThrows(IllegalArgumentException.class,
                () -> {
                    q.setLado(-10);
                });
    }

    @Test
    public void ladoNaoPodeSerNegativoConstrutor() {
        System.out.println("ladoNaoPodeSerNegativoConstrutor");

        assertThrows(IllegalArgumentException.class,
                () -> {
                    Quadrado q = new Quadrado(-5);
                });
    }

    @Test
    public void objetosSaoIguais() {
        System.out.println("objetosSaoIguais");

        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(2);

        assertEquals(q1, q2);
    }

}

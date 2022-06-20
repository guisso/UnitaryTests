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

/**
 * Classe Conversor
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 20/06/2022
 */
public class Conversor {

    public char converter(byte valor) {
        if (valor == 1) {
            return 'A';
        }

        if (valor == 2) {
            return 'B';
        }

        if (valor == 3) {
            return 'C';
        }

        return 'D';

    }
}

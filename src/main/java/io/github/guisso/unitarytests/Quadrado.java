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

import java.util.Objects;

/**
 * Classe Quadrado
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 20/06/2022
 */
public class Quadrado {

    private Integer lado;

    public Quadrado() {
    }

    public Quadrado(Integer lado) {
        setLado(lado);
    }

    public Integer getLado() {
        return lado;
    }

    public void setLado(Integer lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("O lado não pode ser negativo");
        }
        this.lado = lado;
    }

    public Integer calcularArea() {
        return lado * lado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.lado);
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
        final Quadrado other = (Quadrado) obj;
        return hashCode() == obj.hashCode();
    }

}

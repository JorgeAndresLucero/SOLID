/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurassolid;

import java.io.IOException;

/**
 *
 * @author juliana
 */
public abstract class Figura {
    
    //Declaro variables locales
    protected double lado1;
    protected double lado2;
    protected double radio;

    //Método constructor
    public Figura() {
        lado1 = 0;
        lado2 = 0;
        radio = 0;

    }
    //Método constrcutor parametrizado

    public Figura(double lado1, double lado2, double radio) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.radio = radio;

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) throws IOException {
        this.radio = radio;
    }
  
    //Método que me calcula el area 
    public abstract double area();
   
}


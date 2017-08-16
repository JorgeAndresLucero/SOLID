/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurassolid;

/**
 *
 * @author juliana
 */
public class Circulo extends Figura {

    
    @Override
    public double area() {
        return Math.PI*Math.pow(lado1,2);	
    }

    
}

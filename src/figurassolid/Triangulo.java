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
public class Triangulo extends Figura {

    protected double base;
    public Triangulo (){
        super();
        
    }
    
    @Override
    public double area() {
        return (lado1*lado2)/2;
    }

}
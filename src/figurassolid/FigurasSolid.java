/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurassolid;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author juliana
 */
public class FigurasSolid {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Cuadrado cuadro = new Cuadrado();
        Triangulo trian = new Triangulo();
        Circulo circ = new Circulo();
        Figura figurita = new Figura() {
            @Override
            public double area() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        int opcion = 0;
        System.out.println("SELECCIONE LA FIGURA PARA CALCULAR SU ÁREA");
        System.out.println("1) CIRCULO");
        System.out.println("2) CUADRADO");
        System.out.println("3) TRIANGULO");

        opcion = Integer.parseInt(in.readLine());

        switch (opcion) {
            case 1:

                System.out.println("INGRESE EL RADIO DEL CIRCULO");
                circ.setLado1(Double.parseDouble(in.readLine()));
                System.out.println("" + circ.area());
                break;

            case 2:
                System.out.println("CUADRADO");

                System.out.println("INGRESE EL LADO 1");
                cuadro.setLado1(Double.parseDouble(in.readLine()));



                System.out.println(" EL AREA DEL CUADRADO ES: " + cuadro.area());
                
                break;

            case 3:
                
                System.out.println("INGRESE EL LADO 1");
                trian.setLado1(Double.parseDouble(in.readLine()));

                System.out.println("INGRESE EL LADO 2");
                trian.setLado2(Double.parseDouble(in.readLine()));
                
                System.out.println("EL AREA DEL TRIANGULO ES: "+ trian.area());
              
                
                break;
                
            default :
                System.out.println("La opcion selecccionada es incorrecta");

        }

    }

}

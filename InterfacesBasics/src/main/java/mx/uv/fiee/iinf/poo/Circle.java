package mx.uv.fiee.iinf.poo;

import java.util.Objects;

/**
 * Representa un objeto circulo que implementa las interfaces Draw y Shape
 * por lo tanto, está oblidada a implementar los métodos que estas definen
 *
 * La interfaz clonable no define un método propio, en su lagar utiliza la
 * función definida en la clase base (Object) para realizar la copia.
 * Dicha operación es realizada mediante código nativo a la plataforma,
 * con el objetivo de realizala lo más rápido posible, pero principalmente
 * debido a que debe acceder directamente a la memoria para copiar byte a byte
 * al objeto en cuestión.
 *
 * Implementa la interfaz Comparable, dándole la capacidad al objeto creado
 * a partir de esta clase, de compararse contra otro objeto igual de forma que se
 * pueda saber si se es mayor, menor o iguales.
 *
 */
class Circle implements Draw, Shape {
    int x, y;
    int radio;
    double area;

    public Circle (int x, int y, int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    /***
     * Sobreescribe los métodos definidos en la interfaz Draw
     */
    @Override
    public void paint () {
        System.out.println ("Círculo dibujado con centro en (" + this.x + ", " + this.y + ") y radio de " + this.radio);
    }

    @Override
    public void fill () {
        System.out.println ("Círculo coloreado!");
    }
    /****/

    /**
     * Sobreescribe al método definido en la interfaz Shape
     */
    @Override
    public void calculateArea () {
        this.area = Math.PI * Math.sqrt (radio);
        System.out.println ("El área del círculo es " + this.area);
    }


}
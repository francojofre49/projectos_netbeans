/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. Luego, en RaicesServicio las 
operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package serviciosejerextra01.ServicioRaices;

import serviciosejerextra01.Entidad.Raiz;

/**
 *
 * @author frank
 */
public class ServicioRaiz {

    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raiz r) {

        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());

    }

    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raiz r) {

        return getDiscriminante(r) >= 0;

    }

    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raiz r) {

        return getDiscriminante(r) == 0;

    }

    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raiz r) {

        if (tieneRaices(r)) {

            // Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("Las posibles soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }

    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raiz r) {
        if (tieneRaiz(r)) {

            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única solución es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene una única solución real.");
        }
    }

    public void calcular(Raiz r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}

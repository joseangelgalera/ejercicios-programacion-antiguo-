/*
 * Tema 9
 *
 * Ejercicio 3
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y 
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefne 
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un 
 * programa en el que se instancien objetos y se les apliquen métodos.
 *
 */

package tema.pkg9;

public class Ave extends Animal{
    
    public void piar(){
        System.out.println("pipipipi");
    }
    
    public void construirNido(){
        System.out.println("***********");
        System.out.println(" ********* ");
        System.out.println("  ******  ");
        System.out.println("   ****  ");
    }
    
    public void empollar(){
        
    }
}

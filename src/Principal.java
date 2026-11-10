
import logica.BancoPalabras;
import modelo.Palabra;
import logica.JuegoAhorcado;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) { 
      Scanner teclado = new Scanner  (System.in);
      
      //creo el objeto mas importante juego ahorcado con el que se inicializa el juego 
      JuegoAhorcado juego = new JuegoAhorcado();
      
      
      while (!juego.verificarVictoria()&& !juego.verificarDerrota()){
          System.out.println("------MENU DE JUEGO-------");
          juego.mostrarPalabra();
          System.out.println("1. intentar una letra");
          System.out.println("2. Pista: mostrar categoria de la palabra");
          System.out.println("3. pista: mostrar descripcion de la palabra");
          System.out.println("4. pista: mostrar una letra de la palabra");
          System.out.println("5. ¡Quiero arriesgarme! Adivinar la palabra completa");
          System.out.println("Seleccione una opcion(recuerda que solo puede usar una pista una unica vez): ");
          
          //Agregamos validacion para que el usuario solo ingrese opciones valor tipo entero
          if(!teclado.hasNextInt()){
                System.out.println("Debe ingresar una opcion valida.");
                teclado.next(); // limpia el valor inválido
                continue;
            }
          int opcion = teclado.nextInt();
          
          switch (opcion){
              
                case 1:
                    System.out.println("Ingresar una letra");
                    String entrada = teclado.next();

                    if(entrada.length() != 1){
                          System.out.println(
                              "Debe ingresar una sola letra.");
                      }else{
                          juego.intentarLetra(entrada.charAt(0));
                      }
                    break;
                  
                case 2: 
                    juego.elegirPista(0);
                    break;
                  
                case 3:
                    juego.elegirPista(1);
                    break;
                  
                case 4:
                    juego.elegirPista(2);
                    break;
                    
                case 5:
                    System.out.println("Ingrese la palabra completa:");
                    String palabra = teclado.next();
                    if(juego.intentarPalabra(palabra)){
                        System.out.println("¡Felicidades! Has adivinado la palabra.");
                    }
                    break;
                    
                default:
                    System.out.println("Debe ingresar una opcion valida.");
                break;
                }
         
      }
            
    }
    
}


import logica.BancoPalabras;
import modelo.Palabra;
import logica.JuegoAhorcado;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) { 
      Scanner teclado = new Scanner  (System.in);
      JuegoAhorcado juego = new JuegoAhorcado();
      juego.mostrarPalabra();
      
      while (!juego.verificarVictoria()
                && !juego.verificarDerrota()){
          System.out.println("Ingresar una letra");
          char letra = teclado.next().charAt(0);
          
          juego.intentarLetra(letra);
      }
            
    }
    
}

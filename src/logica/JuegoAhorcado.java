
package logica;
import modelo.Palabra;
import modelo.Pista;
import modelo.PistaCategoria;
import modelo.PistaLetra;
import modelo.PistaTexto;
//aqui guardamos la logica del juego ahorcado


public class JuegoAhorcado {
    
    private Palabra palabraActual;
    private int intentosFallidos;
    private char[] palabraOculta;
    private Pista[] pistas;//se guardaran varias referencias de tipo lista
    
    
    //creamos el objeto banco de palabras
    BancoPalabras banco = new BancoPalabras();

    //CONSTRUCTOR
    public JuegoAhorcado() {//aqui se inicializa todo el juego
        
        //seleccionamos una palabra al azar del banco
        this.palabraActual = banco.obtenerPalabraAleatoria();
        //Calcular cuantas letras tiene la palabra seleccionada
        int tamaño = palabraActual.getTexto().length();
        //se inicializa el contador de fallos en 0
        this.intentosFallidos = 0;         

        //Crea un arreglo con una posición por cada letra de la palabra
        palabraOculta = new char[tamaño];

        //Empieza en la posición 0, sigue mientras no llegue al final 
        //del arreglo y avanza una posición en cada vuelta. En cada posición guarda un '_'
        for (int i = 0; i < palabraOculta.length; i++){
            palabraOculta[i] = '_';
        }
        //creo e inicializo un arreglo para guardar las pistas correspondientes de la palabra seleccionada
        this.pistas =  new Pista[3];
        
        this.pistas[0] = new PistaCategoria(palabraActual);
        this.pistas[1] = new PistaTexto(palabraActual);
        this.pistas[2] = new PistaLetra(palabraActual);
                
        //System.out.println("Palabra seleccionada: "
        // + palabraActual.getTexto());
    }
   
    
    
  //creamos un metodo para gestionar las letras que ingresa el usuario  
    public void intentarLetra(char letra){
        //verificar que el usuario ingrese caracteres del abcdario 
        if(!Character.isLetter(letra)){
            System.out.println("Debe ingresar un valor de tipo letra.");
        return;
        }
        boolean encontrada = false;
        //llamamos la palabra actual
        String texto = palabraActual.getTexto();

        for(int i = 0; i < texto.length(); i++){
            //comparamos que la letra ingresada coincida con alguna letra de la palabra
            if(texto.charAt(i) == letra){
                //si la encuentra cambia el estado de encontrada a verdadero
                palabraOculta[i] = letra;
                encontrada = true;
            }
        }
        //si es diferente a encontrada
        if(!encontrada){
            //sumamos a el contador de fallos 1 
            intentosFallidos++;

            System.out.println("La palabra no contiene esa letra.");
            System.out.println("Intentos fallidos: " + intentosFallidos);
        }

        mostrarPalabra();
        
        if(verificarVictoria()){
        System.out.println("¡Felicidades! Has ganado.");
        }

        if(verificarDerrota()){
        System.out.println("Has perdido.");
        System.out.println("La palabra era: " + palabraActual.getTexto());
        }
    }   
    
    
    //metodo para mostrar la palabra    
    public void mostrarPalabra(){

    for(int i = 0; i < palabraOculta.length; i++){
        System.out.print(palabraOculta[i] + " ");
    }
    //agrego salto de linea
    System.out.println();

}
    
    //metodo para verificar si el usuario gana
    public boolean verificarVictoria(){
        //si no encuentra "_" la palabra se completo y Gano!
        for(int i = 0; i < palabraOculta.length; i++){
            if(palabraOculta[i] == '_'){
                return false;
            }
        }
        return true;
    }
    
    //metodo para verificar si el usuario pierde :c 
    public boolean verificarDerrota(){
        return intentosFallidos >= 7;
    }
    
    //metodo para elegir una pista desde su indice
    public void elegirPista(int opcion){
        
        
        if(pistas[opcion].esUsada()){
            System.out.println("Esta pista ya fue utilizada");
        }else{
            System.out.println(pistas[opcion].mostrarPista());                    
        }
        
        if(opcion < 0 || opcion >= pistas.length){
        System.out.println("Opción de pista inválida");
        return;
            }
    }
    // metodo para que pueda ingresar una palabra completa para adivinar
    public boolean intentarPalabra(String palabraIngresada){
    String palabraReal = palabraActual.getTexto();
    if(palabraIngresada.equalsIgnoreCase(palabraReal)){
        for(int i = 0; i < palabraReal.length(); i++){
            palabraOculta[i] = palabraReal.charAt(i);
        }
        return true;
    }else{
        System.out.println("Palabra incorrecta :c");
        System.out.println("Has perdido...");
        System.out.println("La palabra era: " + palabraReal);
        intentosFallidos = 7;
        return false;
    }
    

}
}
        
        
    
        
    
       

    
        
    

 


   
    
   
    


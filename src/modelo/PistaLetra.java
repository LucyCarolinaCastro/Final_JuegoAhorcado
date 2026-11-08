
package modelo;


public class PistaLetra extends Pista{
    
    private Palabra palabra;
    private char letraRevelada;

    public PistaLetra(Palabra palabra) {
        this.palabra = palabra;
        
    }
    //sobreescribo el metodo mostrar pista
    @Override
    public String mostrarPista(){
        setUsada(true);
        
        String texto = palabra.getTexto();
        //generamos un índice aleatorio dentro de la palabra.
        int indice = (int)(Math.random() * texto.length());
        //obtenemos y retornamos un catacter aleatorio elegido en la palabra 
        letraRevelada = texto.charAt(indice);
        
        return String.valueOf(letraRevelada);
    }
    
    
}

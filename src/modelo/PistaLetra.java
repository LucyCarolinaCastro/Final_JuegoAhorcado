
package modelo;


public class PistaLetra extends Pista{
    
    private Palabra palabra;
    private char letraRevelada;

    public PistaLetra(Palabra palabra, char LetraRevelada) {
        this.palabra = palabra;
        this.letraRevelada = LetraRevelada;
    }
    //sobreescribo el metodo mostrar pista
    @Override
    public String mostrarPista(){
        setUsada(true);
        
        String texto = palabra.getTexto();
        //generamos un índice aleatorio dentro de la palabra.
        int indice = (int)(Math.random() * texto.length());
        //obtenemos y retornamos un catacter aleatorio de indice en la palabra 
        letraRevelada = texto.charAt(indice);
        
        return String.valueOf(letraRevelada);
    }
    
    
}

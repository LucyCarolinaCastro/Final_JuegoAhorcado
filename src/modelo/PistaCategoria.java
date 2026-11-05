
package modelo;

public class PistaCategoria extends Pista{
    
    private Palabra palabra;

    public PistaCategoria(Palabra palabra) {
        this.palabra = palabra;
    }
    
    //sobreescribo el metodo mostrar pista
    @Override
    public String mostrarPista(){
        setUsada(true);
        return palabra.getCategoria();
    }
    
}

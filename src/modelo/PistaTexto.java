
package modelo;


public class PistaTexto extends Pista{
    
    private Palabra Palabra;

    public PistaTexto(Palabra Palabra) {
        this.Palabra = Palabra;
    }
    
    @Override
    public String mostrarPista(){
        setUsada(true);
        return Palabra.getDescripcion();
    }
    
}


package modelo;


public class Palabra {
    
    private String texto;
    private String categoria;
    private String descripcion;

    public Palabra(String texto, String categoria, String descripcion) {
        this.texto = texto;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
//muestra la palabra
    public String getTexto() {
        return texto;
    }
//muestra categoria
    public String getCategoria() {
        return categoria;
    }
//muestra la descripcion de la palabra que de usa como pista
    public String getDescripcion() {
        return descripcion;
    }
    
    
    
}

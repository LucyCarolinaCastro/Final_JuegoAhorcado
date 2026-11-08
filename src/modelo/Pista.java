
package modelo;


public abstract class Pista {
    
    protected boolean usada;//al ser protected puede ser usada desde las clases hijas sin necsaidad de getters

    public abstract String mostrarPista(); 
    
    public boolean esUsada(){
        return usada;
    }
    //metodo set para cambiar es estado de una pista a usada
    protected void setUsada(boolean usada){
        this.usada = usada; 
        
    }
            
    
    
    
    
}

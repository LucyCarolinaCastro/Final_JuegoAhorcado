
package logica;
import modelo.Palabra;
import java.util.ArrayList;


public class BancoPalabras {//crea y gestiona el arrayList 
    
    private ArrayList<Palabra>palabras;
    
//crear lista vacia y llamar a cargarPalabras 
     public BancoPalabras(){
        palabras = new ArrayList<>();
        cargarPalabras();
    }
     
    public void cargarPalabras(){//llena mi arrayList palabras
        //Categoria VESTIMENTA:
        palabras.add(new Palabra("Corbata","vestimenta","los usas con traje"));
        palabras.add(new Palabra("Chaqueta","vestimenta","para abrigarse"));
        
        //Categoria PROFESIONES:
        palabras.add(new Palabra("Doctor","Profesiones","si no hay alguien que te atiende cuando enfermas, te mueres"));
        palabras.add(new Palabra("Profesor","Profesiones","Su labor es la compartir concimiento"));
        
        //Categoria DEPORTES:
        palabras.add(new Palabra("Ciclismo","Deportes","equilibrio en dos ruedas"));
        palabras.add(new Palabra("natacion","Deportes","desplazarse a través del agua mediante el movimiento coordinado del cuerpo y las extremidades"));
        
        
        //Categoria COMIDAS:
        palabras.add(new Palabra("Carne","Comidas","Fuente de proteina de las vacas"));
        palabras.add(new Palabra("Huevos","Comidas","Lo ponen las gallinas"));
        
        //Categoria PAISES:
        palabras.add(new Palabra("Colombia","Paises","El pais mas hermoso del mundo"));
        palabras.add(new Palabra("Brasil","Paises","Lo ponen las gallinas"));
        
    }

 
    public Palabra obtenerPalabraAleatoria(){ 
        int tamaño = palabras.size();//obtiene cuantas palabras hay 
        int numAleatorio =(int)(Math.random()*(tamaño));//generamos indices validos aleatorios de mi lista de palabras
        Palabra palabraSeleccionda = palabras.get(numAleatorio);//obtenemos la palabra en esa posicion 
       return palabraSeleccionda;//devolvemos objeto palabra para mostrar la palabra aleatoria seleccionada.
    }

    
    }
    


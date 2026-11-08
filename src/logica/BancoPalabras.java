
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
        palabras.add(new Palabra("corbata","vestimenta","los usas con traje"));
        palabras.add(new Palabra("chaqueta","vestimenta","para abrigarse"));
        
        //Categoria PROFESIONES:
        palabras.add(new Palabra("doctor","Profesiones","si no hay alguien que te atiende cuando enfermas, te mueres"));
        palabras.add(new Palabra("profesor","Profesiones","Su labor es la compartir concimiento"));
        
        //Categoria DEPORTES:
        palabras.add(new Palabra("ciclismo","Deportes","equilibrio en dos ruedas"));
        palabras.add(new Palabra("natacion","Deportes","desplazarse a través del agua mediante el movimiento coordinado del cuerpo y las extremidades"));
        
        
        //Categoria COMIDAS:
        palabras.add(new Palabra("carne","Comidas","Fuente de proteina de las vacas"));
        palabras.add(new Palabra("huevos","Comidas","Lo ponen las gallinas"));
        
        //Categoria PAISES:
        palabras.add(new Palabra("colombia","Paises","El pais mas hermoso del mundo"));
        palabras.add(new Palabra("brasil","Paises","Lo ponen las gallinas"));
        
    }

 
    public Palabra obtenerPalabraAleatoria(){ 
        int tamaño = palabras.size();//obtiene cuantas palabras hay 
        int numAleatorio =(int)(Math.random()*(tamaño));//generamos indices validos aleatorios de mi lista de palabras
        Palabra palabraSeleccionda = palabras.get(numAleatorio);//obtenemos la palabra en esa posicion 
       return palabraSeleccionda;//devolvemos objeto palabra para mostrar la palabra aleatoria seleccionada.
    }

    
    }
    

